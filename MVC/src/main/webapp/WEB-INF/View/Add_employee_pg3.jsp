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
<form:form modelattribute = "Emp" >
<table>
	
	<tr>
	
	
	<c:forEach var="Emp" items="${Emp.ltop}" varStatus="status">
	<td>Lname</td>
   <form:input path="ltop[${status.index}].lname" name="lname" id="lname" value="" />
        <td>Lid</td>
   <form:input path="ltop[${status.index}].lid" name="lid" id="lid" value="" />
    </c:forEach>
	
	
	</tr>
	
	
	
	
	</table>
	
	<table>
	<tr>
	<td colspan = "3">
<input type = "hidden" value ="2" name = "_page"/>
<input type = "submit" value = "cancel" name = "_cancel"/>
<input type ="submit" value ="previous" name = "_target1"/>
<input type = "submit" value ="FINISH" name = "_finish"/>
</td>
</tr>
</table> 
</form:form>	
</body>
</html>