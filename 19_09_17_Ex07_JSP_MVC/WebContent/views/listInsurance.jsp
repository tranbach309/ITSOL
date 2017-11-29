<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.itsol.ex07.entity.Insurance"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Insurance</title>
</head>
<body>
	<h3>List Insurance</h3>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Package Type</th>

		</tr>
		<c:forEach items="${listInsurance}" var="insurance">
			<tr>
				<td>${insurance.id}</td>
				<td>${insurance.packageType}</td>
			</tr>

		</c:forEach>


	</table>

</body>
</html>