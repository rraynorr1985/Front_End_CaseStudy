<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit doctor</title>
</head>
<body>
	<h2>Edit Doctor</h2>
	<div class="col-lg-5 text-center mx-auto">
	<form:form action="editins" method="post" modelAttribute="fins">
	<table border="0" cellpadding="5">
				<tr>
                    <td>Id: </td>
                    <td>
                    ${fins.insid}
                    <form:hidden path="insid" />
                    </td>
                </tr>
                    <td>Insurance Name: </td>
                    <td><form:input path="insurName" /></td>
                </tr>
                <tr>
                    <td>Insurance Phone: </td>
                    <td><form:input path="insPhone" /></td>
                </tr>
                <tr>
                    <td>Insurance WebLink: </td>
                    <td><form:input path="insWebLink" /></td>
                </tr>                      
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                   
            </table>
	</form:form>	
	</div>
</body>
</html>