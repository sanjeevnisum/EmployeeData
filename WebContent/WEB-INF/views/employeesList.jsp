<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>All Employees</title>
</head>
<body>
<font color="green"><h1>List Employees</h1></font>
<table id="example" class="display" cellspacing="0" width="100%" border="1" bgcolor="pink">  
   <tr>  
    <td class="heading"><b>Employee Id</b></td>
    <td class="heading"><b>First Name</b></td>  
    <td class="heading"><b>Last Name</b></td>  
    <td class="heading"><b>Designation</b></td>
    <td class="heading" colspan="2"><b>Operation</b></td></tr>

		<c:forEach var="employee" items="${employeeList}"> 
			<tr>
				<td><c:out value="${employee.employeeId}"/></td>
				<td><c:out value="${employee.firstname}"/></td>
				<td><c:out value="${employee.lastname}"/></td>
				<td><c:out value="${employee.desg}"/></td>
				
				<td><a href="edit.html?id=${employee.employeeId}">Edit</a></td>  
                <td><a href="delete.html?id=${employee.employeeId}">Delete</a></td> 
					
			</tr>
		</c:forEach>
	</table>

</body>
</html>