package com.codingdojo.vany.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.vany.modelos.Gasto;
import com.codingdojo.vany.repositorios.RepositorioViajes;

@Service
public class ServicioViajes {
	
	private final RepositorioViajes repositorio;

	//constructor
	public ServicioViajes(RepositorioViajes repo) {
		this.repositorio = repo;
	}
	
	//se obtienen todos los gastos
	public List<Gasto> get_gastos(){
		return repositorio.findAll();
	}
	
	public Gasto find_gasto(Long id) {
		Optional<Gasto> optionalGasto = repositorio.findById(id); //optional: si existe o no el id
		if(optionalGasto.isPresent()) {
			return optionalGasto.get();
		} else {
			return null;
		}
	}
	
	//se guarda el gasto
	public Gasto save_gasto(Gasto gasto) {
		return repositorio.save(gasto); 
	}
	
	//eliminar
	public void delete_gasto(Long id) {
		repositorio.deleteById(id);
	}
	
	

}
