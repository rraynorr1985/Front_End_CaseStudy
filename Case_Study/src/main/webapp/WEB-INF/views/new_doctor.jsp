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

<title>New Doctor Adding</title>
</head>
<body>
<h2>New Doctor Adding</h2>
	<div class="col-lg-5 text-center mx-auto">
	<form:form action="savedoc" method="post" modelAttribute="doctor">
	<table border="0" cellpadding="5">
                <tr>
                    <td>First Name: </td>
                    <td><form:input path="firstname" /></td>
                    <td><form:errors class="text-danger" path="firstname" /></td>
                </tr>
                <tr>
                    <td>Last Name: </td>
                    <td><form:input path="lastname" /></td>
                     <td><form:errors class="text-danger" path="lastname" /></td>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td><form:input path="email" /> </td>  
					<td><form:errors class="text-danger" path="email" /></td>                 
                                       
                </tr>   
                 <tr>
                    <td>Phone Number: </td>
                    <td><form:input path="phoneNumber" /></td>
                    <td><form:errors class="text-danger" path="phoneNumber" /></td> 
                </tr>  
                 <tr>
                    <td>NPI: </td>
                    <td><form:input path="npi" /></td>
                    <td><form:errors class="text-danger" path="npi" /></td>  
                </tr>    
                 <tr>
                    <td>Education: </td>
                    <td><form:input path="education" /></td>
                    <td><form:errors class="text-danger" path="education" /></td>
                </tr>   
                 <tr>
                    <td>Specialization: </td>
                    <td><form:input path="specialization" /></td>
                     <td><form:errors class="text-danger" path="specialization" /></td>
                </tr>
              	<tr>
                   <td><label>Gender:</label><td>
                   <form:radiobutton path="gender" value="male"/> Male                     
                     <form:radiobutton path="gender" value="female"/> Female 
                     <form:radiobutton path="gender" value="other"/> Other
                     <form:errors class="text-danger" path="gender" />
                       </tr>                             
                <tr>
                    <td>Zip code: </td>
                    <td><form:input path="address.zipcode" /></td>
                    <td><form:errors class="text-danger" path="address.zipcode" /></td> 
                </tr>
                <tr>
                    <td>State: </td>
                    <td><form:input path="address.stateName" /></td>
                    <td><form:errors class="text-danger" path="address.stateName" /></td> 
                </tr>
                <tr>
                    <td>City name: </td>
                    <td><form:input path="address.citiName" /></td>
                    <td><form:errors class="text-danger" path="address.citiName" /></td> 
                </tr>   
                 <tr>
                    <td>Street name: </td>
                    <td><form:input path="address.streetName" /></td>
                    <td><form:errors class="text-danger" path="address.streetName" /></td> 
                </tr>   
                 <tr>
                    <td>House number: </td>
                    <td><form:input path="address.houseNumber" /></td>
                     <td><form:errors class="text-danger" path="address.houseNumber" /></td>
                </tr>    
                 <tr>
                    <td>Apt number: </td>
                    <td><form:input path="address.aptNumber" /></td>
                    <td><form:errors class="text-danger" path="address.aptNumber" /></td>
                </tr> 
                <tr>           
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
	</form:form>
	
	</div>
</body>
</html>