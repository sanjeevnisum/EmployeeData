<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>  
<html>  
<head>  
<title>Being Java Guys | Spring DI Hello World</title>  
<style>  
body {  
 font-size: 20px;  
 color: teal;  
 font-family: Calibri;  
}  
  
td {  
 font-size: 15px;  
 color: black;  
 width: 100px;  
 height: 22px;  
 text-align: center;  
}  
  
.heading {  
 font-size: 18px;  
 color: white;  
 font: bold;  
 background-color: orange;  
 border: thick;  
}  
</style>  
</head>  
<body bgcolor="9966FF">   
 <b>Edit User Details </b>  
 
  <div>  
   <form:form method="post" action="/update.html" modelAttribute="employee">  
    <table>  
    <tr>  
     <td><form:label path="employeeId"><spring:message code="label.employeeId"/></form:label></td>
      
      <td><form:input path="employeeId"  
        value="${map.employee.employeeId}" />  
      </td>  
     </tr>  
     <tr> 
 <td><form:label path="firstname"><spring:message code="label.firstname"/></form:label></td>
      <td><form:input path="firstname"  
        value="${map.employee.firstname}" />  
      </td>  
     </tr>  
     <tr>  
      <td><form:label path="lastname"><spring:message code="label.lastname"/></form:label></td>
     
      <td><form:input path="lastname" value="${map.employee.lastname}" />  
      </td>  
     </tr>  
     
     <tr>  
   <td><form:label path="desg"><spring:message code="label.desg"/></form:label></td>
     
      <td><form:input path="desg" value="${map.employee.desg}" />  
      </td>  
     </tr>  
     <tr>  
      <td> </td>  
      <td><input type="submit" value="Save" />  
      </td>  
     </tr>  
    </table>  
   
  
   </form:form>  
  </div>  

</body>  
</html>  