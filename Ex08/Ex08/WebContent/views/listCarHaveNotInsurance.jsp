<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.itsol.ex07.entity.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Car Havenot Insurance</title>
</head>
<body>
	<h3>List Car Havenot Insurance</h3>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NumberInsurance</th>
			<th>YearOfManufacture</th>
			<th>Brand</th>
			<th>HaveInsurance</th>
		</tr>
		<c:forEach items="${requestScope.listCarHaveNotInsurance}" var="car">
			<tr>
				<th>${car.id }</th>
				<th>${car.numberPlate}</th>
				<th>${car.yearOfManufacture }</th>
				<th>${car.brand }</th>
				<th>${car.haveInsurance }</th>
				<th><a href="buyInsurance?carId=${car.id }">Buy Insurance</a></th>
			</tr>
		</c:forEach>
	</table>


</body>
</html>