<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <!-- jQuery library -->
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <!-- Popper JS -->
         <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<title>New Insurance Adding</title>
</head>
<body>
<h2>New Insurance Adding</h2>
	<div class="col-lg-5 text-center mx-auto">
	<form:form action="saveins" method="post" modelAttribute="insurance">
	<table border="0" cellpadding="5">
                <tr>
                    <td>Insurance Name: </td>
                    <td><form:input path="insurName" /></td>
                    <td><form:errors class="text-danger" path="insurName" /></td>
                </tr>
                <tr>
                    <td>Insurance Phone: </td>
                    <td><form:input path="insPhone" /></td>
                    <td><form:errors class="text-danger" path="insPhone" /></td>
                </tr>
                <tr>
                    <td>Insurance WebPage: </td>
                    <td><form:input path="insWebLink" /></td>
                    <td><form:errors class="text-danger" path="insWebLink" /></td>
                </tr>   
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
	</form:form>
	
	</div>
</body>
</html>