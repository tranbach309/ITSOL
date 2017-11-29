<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.itsol.ex07.entity.Car"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Car</title>
</head>
<body>
	<h3>Product List</h3>

	<table border="1">
		<tr>
			<th>NumberPlate</th>
			<th>YearOfManufacture</th>
			<th>Brand</th>
			<th>HaveInsurance</th>
		</tr>

		<c:forEach items="${requestScope.listCar}" var="car">
			<tr>
				<td>${car.numberPlate}</td>
				<td>${car.yearOfManufacture}</td>
				<td>${car.brand}</td>
				<td>${car.haveInsurance}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>