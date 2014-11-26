<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>  
<head>  
<title>EmployeeForm</title>  
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
 text-align: left;  
}  
  
.heading {  
 font-size: 18px;  
 color: white;  
 font: bold;  
 background-color: orange;  
 border: thick;  
}  
</style> 
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
  $("input").focus(function(){
    $(this).css("background-color","#cccccc");
  });
  $("input").blur(function(){
    $(this).css("background-color","#ffffff");
  });
});
</script>
</head>
<body>


</head>  


<body>  


 <center>
 <h2><b> ${error}</b></h2>
  <div>  
   <form:form name="myForm" method="post" action="/insert.html" commandName="employee">  
    <table>  
    <tr>  
      <td><form:label path="employeeId"><spring:message code="label.employeeId"/></form:label></td> 
      <td><form:input path="employeeId"/><form:errors path="employeeId"/></td> 
     
     </tr>  
     <tr>  
      <td><form:label path="firstname"><spring:message code="label.firstname"/></form:label></td>  
      <td><form:input path="firstname" /><form:errors path="firstname"></form:errors></td>  
     </tr>  
     <tr>  
      <td><form:label path="lastname"><spring:message code="label.lastname"/></form:label></td>  
      <td><form:input path="lastname" /><form:errors path="lastname"></form:errors></td>  
     </tr>  
     
     <tr>  
      <td><form:label path="desg"><spring:message code="label.desg"/></form:label></td>  
      <td><form:input path="desg" /><form:errors path="desg"></form:errors></td>  
     </tr>  
     
     
     <tr>  
      <td> </td>  
      <td><input type="submit" value="Save"/></td>  
     </tr>  
     
    </table>  
   </form:form>  
  </div>  
 </center>  
</body>  
</html>  
