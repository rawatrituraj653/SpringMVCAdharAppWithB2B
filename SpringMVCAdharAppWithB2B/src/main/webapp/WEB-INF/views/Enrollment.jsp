<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<link rel="stylesheet" 
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
<meta charset="ISO-8859-1">
</head>
<body>
	<h2 class="h2 text-center text-success">Enrollment Page</h2>
	
	<span class="text-primary text-right h4">${msg}</span><br>
	<form:form action="enroll.form" modelAttribute="person"  method="post" cssClass="form-group">
	<label class="h5 text-center text-warning">Enter Person First Name</label>
		<form:input path="firstName" cssClass="form-control"/>
		<label class="h5 text-center text-warning">Enter Person Last Name</label>
		<form:input path="lastName" cssClass="form-control"/>
		<label class="h5 text-center text-warning">Enter Person Age</label>
		<form:input path="age" cssClass="form-control"/>
		<label class="h5 text-center text-warning">Enter Person Email</label>
		<form:input path="email" cssClass="form-control"/>
		<label class="h5 text-center text-warning">choose Person Gender</label>
		<div class="form-control">
		<form:radiobutton path="gender" value="MALE"/>Male&nbsp;&emsp;
		<form:radiobutton path="gender" value="FEMALE"/>Female
		</div>
		<label class="h5 text-center text-warning">Enter Person Phone No.</label>
		<form:input path="phoneNo" cssClass="form-control"/>
		<br/>
		<input type="submit" class="btn btn-primary" value="Enrollment"/>
		<input type="reset" class="btn btn-danger" value="CLear"/> 
	</form:form>
	<a href	="getInput.form" class="text-center btn btn-light">GetAdharData</a>		
</body>
</html>