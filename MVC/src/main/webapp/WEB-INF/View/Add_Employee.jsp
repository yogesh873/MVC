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
<td>Employee Name</td>
<td><form:input path = "ename"/> </td>
<td><form:errors path = "ename" cssClass = "error" /></td>
</tr>

<tr>
<td>Job</tr>
<td><form:input path = "job"/> </td>
<td><form:errors path = "job" cssClass = "error" /></td>
</tr>

<tr>
<td>MGR</tr>
<td><form:input path = "mgr"/> </td>
<td><form:errors path = "mgr" cssClass = "error" /></td>
</tr>


<tr>
<td>Hiredate</tr>
<td><form:input path = "Hiredate"/> </td>
<td><form:errors path = "Hiredate" cssClass = "error" /></td>
</tr>
<!-- The variables to handle multiple forms -->

<tr>
<td  colspan = "3">
<input type = "hidden" value = 0 name = "_page">
<input type ="submit" value = "Next" name = "_target1"/>
<input type = "submit" value = "cancel" name ="_cancel"/>

</td>

</tr>
        <tr><input type = "submit" value ="logout" /> </tr>
</table>



</form:form>


</body>
</html>
