package com.codingdojo.vany.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.vany.modelos.Gasto;

@Repository
public interface RepositorioViajes extends CrudRepository<Gasto,Long>{
	//hay 4 funciones que se importan
	List<Gasto> findAll();
	List<Gasto> findById(long id);

	Gasto save(Gasto gasto); //para guardar y actualizar
	
	void deleteById(Long id);

}
