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
	<form:form action="editdoc" method="post" modelAttribute="fdoctor">
	<table border="0" cellpadding="5">
				<tr>
                    <td>Id: </td>
                    <td>
                    ${fdoctor.docid}
                    <form:hidden path="docid" />
                    </td>
                </tr>
                    <td>First Name: </td>
                    <td><form:input path="firstname" /></td>
                </tr>
                <tr>
                    <td>Last Name: </td>
                    <td><form:input path="lastname" /></td>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td><form:input path="email" /></td>
                </tr>   
                 <tr>
                    <td>Phone Number: </td>
                    <td><form:input path="phoneNumber" /></td>
                </tr>   
                 <tr>
                    <td>NPI: </td>
                    <td><form:input path="npi" /></td>
                </tr>    
                 <tr>
                    <td>Education: </td>
                    <td><form:input path="education" /></td>
                </tr>   
                 <tr>
                    <td>Specialization: </td>
                    <td><form:input path="specialization" /></td>
                </tr>
                <tr>
                <td><label>Gender:</label><td>
                   <form:radiobutton path="gender" value="male"/> Male                     
                     <form:radiobutton path="gender" value="female"/> Female 
                     <form:radiobutton path="gender" value="other"/> Other
                      </tr>     
                <tr>
                    <td>ZipCode: </td>
                    <td><form:input path="address.zipcode" /></td>
                </tr> 
                <tr>
                    <td>State: </td>
                    <td><form:input path="address.stateName" /></td>
                </tr> 
                <tr>
                    <td>City: </td>
                    <td><form:input path="address.citiName" /></td>
                </tr>
                <tr>
                    <td>Street: </td>
                    <td><form:input path="address.streetName" /></td>
                </tr>  
                <tr>
                    <td>House Number: </td>
                    <td><form:input path="address.houseNumber" /></td>
                </tr>
                <tr>
                    <td>Apt Number: </td>
                    <td><form:input path="address.aptNumber" /></td>
                </tr>    
                     <tr>                         
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                   
            </table>
	</form:form>	
	</div>
</body>
</html>