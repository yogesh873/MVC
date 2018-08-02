
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee registration form</title>
<style>
.error{
  color = #ffoooo
  font-weight: bold; 
  }
</style>
</head>
<body>
<form:form method = "post" modelAttribute = "Emp">
<table>
<tr>
<td>Ename </td>
<td>"{$Emp.ename}"   </td>
</tr>
</table>

<table>
<tr>
<td>Ename </td>
<td>"{$Emp.ename}"   </td>
</tr>
</table>
  <table>
<tr>
<td>Ename </td>
<td>"{$Emp.ename}"   </td>
</tr>
</table>
  
  <table>
<tr>
<td>Ename </td>
<td>"{$Emp.ename}"   </td>
</tr>
</table>
  
  <table>
<tr>
<td>Ename </td>
<td>"{$Emp.ename}"   </td>
</tr>
</table>
  
  <table>
<tr>
<td>Ename </td>
<td>"{$Emp.ename}"   </td>
</tr>
</table>
  
  <table>
<tr>
<td>Ename </td>
<td>"{$Emp.ename}"   </td>
</tr>
</table>
  
<tr>
<td colspan = "3">
<input type = "hidden" value ="3" name = "_page"/>
<input type = "submit" value = "Page1" name = "_target0"/>
<input type ="submit" value ="page2" name = "_target1"/>
  <input type ="submit" value ="page3" name = "_target2"/>
  <input type = "submit" value ="save" name = "save"/>
<input type = "submit" value ="Cancel" name = "_cancel"/>
</td>
</tr>

</form:form>
