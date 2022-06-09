<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	
	
	<div class="card">
		<h1>Expense details</h1>
		<a class="card-link" href="/expenses">Go back</a>
		
		<div class="card-body"> 
			<div>
				<label>Expense name:</label>
				<p><c:out value="${show_gastos.getExpense_name()}"/><p>
			</div>
			
			<div>
				<label>Expense description:</label>
				<p><c:out value="${show_gastos.getDescription()}"/><p>
			</div>
			
			<div>
				<label>Vendor:</label>
				<p><c:out value="${show_gastos.getVendor()}"/><p>
			</div>
			
			<div>
				<label>Amount spend:</label>
				<p><c:out value="${show_gastos.getAmount()}"/><p>
			</div>
		</div>
	</div>
	
	


</body>
</html>