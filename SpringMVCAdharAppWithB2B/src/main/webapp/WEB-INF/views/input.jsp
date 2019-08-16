<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" 
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
<meta charset="ISO-8859-1">
<title>Enter Adhar Number</title>
</head>
<body>
	<span class="h4 text-center text-danger">${msg}</span>
	<h4 class="h4 text-center text-success">Welcome Get Your Adhar Deatails </h4>
	<form action="getData.form" method="post" class="form-group">
	<fieldset class="text-center">
	<label class="text-primary h5">Enter AAdhar Number </label>
	<input type="number"  size="12"  class="form-control" name="id" placeholder="Enter Adhar Number"/>
	<input type="submit" class="btn btn-primary" value="GetAdharDetails"/>
	<input type="reset" class="btn btn-warning" value="CLear"/>
	</fieldset>
	</form>	
	
	<a href="getForm.form" class="text-center h4 btn btn-light">Goto Enrollment Page</a>
</body>
</html>