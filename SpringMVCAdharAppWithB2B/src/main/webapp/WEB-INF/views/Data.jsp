<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>     
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" 
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
<meta charset="ISO-8859-1">
<meta charset="ISO-8859-1">
<title>Person Data</title>
</head>
<body>
		<h3 class="text-center h4 text-primary">Person Aadhar Data </h3>
	<table class="table table-bodered table-striped">
	<tr>	
		<th class="thead-dark">Person AdharNumber</th>
		<td><c:out value="${person.adharNum}" /></td>
	</tr>
	<tr>
		<th class="thead-dark">Person  FirstName</th>
		<td><c:out value="${person.firstName}"/> </td>
	</tr><tr>	
		<th class="thead-dark">Person Last Name</th>
		<td><c:out value="${person.lastName}"/></td>
		</tr><tr>
		<th class="thead-dark">Person  Gender</th>
		<td><c:out value="${person.gender}"/></td>
		</tr><tr>
		<th class="thead-dark">Person Age</th>
		<td><c:out value="${person.age}"/> </td>
		</tr><tr>
		<th class="thead-dark">Person Email</th>
		<td><c:out value="${person.email}"/> </td>
		</tr><tr>
		<th class="thead-dark">Person PhoneNum</th>
		<td><c:out value="${person.phoneNo}"/></td>
	</tr>	
</table>	
<a href="getInput.form" class="h4 text-center btn btn-light">Get Another Person Data </a>
</body>
</html>