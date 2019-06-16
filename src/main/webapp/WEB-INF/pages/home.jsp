<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>User List</h1>
		
		<table border="1">

			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Telephone</th>
			<th>Action</th>

			<c:forEach var="user" items="${listUser}">
				<tr>

					<td>${user.name}</td>
					<td>${user.email}</td>
					<td>${user.address}</td>
					<td>${user.telephone}</td>
					<td><a href="editUser?id=${user.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; 
<%-- 						<a href="deleteUser?id=${user.id}">Delete</a> --%>
						<a href="catalogue?id=${user.id}">Delete</a>
						</td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New User Register <a href="newUser">here</a>
		</h4>
	</div>
	
</body>
</html>