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
<td>Salary </td>
<td><form:input path="sal" />   </td>
<td><form:errors path ="sal" cssClass = "error"/></td>
</tr>
</table>

<table>
<tr>
<td>Department</td>
<td><form:select path="dname" items = "${DNAME}" itemvalue = "dnane" itemName = "Dept Name"/>   </td>
<td><form:errors path ="dep" cssClass = "error"/></td>
</tr>
</table>
<tr>
<td colspan = "3">
<input type = "hidden" value ="1" name = "_page"/>
<input type = "submit" value = "next" name = "_target2"/>
<input type ="submit" value ="previous" name = "_target0"/>
<input type = "submit" value ="Cancel" name = "_cancel"/>
</td>
</tr>

</form:form>

</body>