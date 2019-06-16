<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Catalogue</title>
</head>
<body>
	<div align="center">
		<h1>Catalogue List</h1>
		
		<table border="1">

			<th>Title</th>
			<th>ISBN</th>
			<th>Cost</th>
			<th>Quantity</th>
			<th>Action</th>

			<c:forEach var="catalogue" items="${listCatalogue}">
				<tr>

					<td>${catalogue.title}</td>
					<td>${catalogue.isbn}</td>
					<td>${catalogue.cost}</td>
					<td>${catalogue.quantity}</td>
					<td><a href="editUser?id=${catalogue.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; 
<%-- 						<a href="deleteUser?id=${user.id}">Delete</a> --%>
						<a href="/catalogue?id=${catalogue.id}">Delete</a>
						</td>

				</tr>
			</c:forEach>
		</table>		
	</div>
</body>
</html>