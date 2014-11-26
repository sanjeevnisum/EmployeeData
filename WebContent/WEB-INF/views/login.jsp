<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<form:form action="login.html" method="post"  modelAttribute="loginAttribute">

         ${error}
    <table border="0" cellpadding="0" cellspacing="0">
        <tr>
            <th>Username</th>
            <td><form:input type="text"  class="login-inp" path="username" /></td>
        </tr>
        <tr>
            <th>Password</th>
            <td><form:input type="password" value="************"  onfocus="this.value=''" class="login-inp" path="password"/></td>
        </tr>
        <tr>
            <th></th>
            <td valign="top"><input type="checkbox" class="checkbox-size" id="login-check" /><label for="login-check">Remember me</label></td>
        </tr>
        <tr>
            <th></th>
            <td><input type="submit" class="submit-login"  /></td>
        </tr>
    </table>
</form:form>