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
<tr>Salary </tr>
<tr><form:input path="sal" />   </tr>
<tr><form:errors path ="sal" cssClass = "error"/></tr>
</table>

<table>
<tr>Department </tr>
<tr><form:input path="dep" />   </tr>
<tr><form:errors path ="dep" cssClass = "error"/></tr>
</table>

</form:form>





</body>