<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Login</title>
        </head>
        <body>
        <form:form modelAttribute="employee"  action="View_detail" method="post">
      <table align="center">
    <c:forEach items="${Employee}" var="Emp">
    <tr>
      <td><c:out value="${Emp.empno}" /></td>
      <td><c:out value="${Emp.ename}" /></td>
    </tr>
  </c:forEach>
                    <tr>
                        <td></td>
                        <td><a href="index">Home</a>
                        </td>
                    </tr>
                </table>
            
            <table align="center">
                <tr>
                    <td style="font-style: italic; color: red;">${message}</td>
                </tr>
            </table>
            </form:form>
        </body>
        </html>
