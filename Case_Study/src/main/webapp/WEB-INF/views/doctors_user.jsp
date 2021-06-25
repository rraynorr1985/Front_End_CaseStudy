	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
	
	
	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<!DOCTYPE html>
	<html>
        <head>
            <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <!-- jQuery library -->
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <!-- Popper JS -->
         <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/style.css">

	
	<title>LapMed | Store your Medical History ONLINE</title>
	</head>
	<body class="headerbg">
    <header>
    <div class="d-flex justify-content-center">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
        <h2>Welcome ${pageContext.request.userPrincipal.name} | <a class="btn btn-secondary"  onclick="document.forms['logoutForm'].submit()">Logout</a></h2>
    </c:if>
  </div>
    
        <div class="d-flex flex-row-reverse justify-content-center">
           <div class="p-2"><a href="doctors" class="btn btn-secondary">For Admin</a></div>
            <div class="p-2">
                <h2><strong>LapMed | Store your Medical History ONLINE</strong></h2>
                </div>
    </div>
    </header><!--Navigation starts here-->
    <nav class="navbar navbar-expand-sm navpan justify-content-center">
        <ul class="navbar-nav">
            <a class="nav-brand"><img src="${pageContext.request.contextPath}/resources/pictures/test200x200.png" alt="Logo" style="width:40px;"/></a>
            <li class="nav-item"><a class="nav-link h1c" href="${pageContext.request.contextPath}/">Home</a></li>
            <li class="nav-item"><a class="nav-link h1c" href="#">About us</a></li>
            <li class="nav-item"><a class="nav-link h1c" href="#">Contact us</a></li>
            
        </ul>
    </nav>

<div class="container mt-3 text-center">
    <h2>Doctors Table</h2>
    <div class="d-flex justify-content-center">  		
  		</div>
  		<br>
    <span>Type to search in the table</span>  
    <input class="form-control text-center" id="myInput" type="text" placeholder="Search..">
    <br>
    <table class="table table-bordered" id="tbl">
      <thead>
        <tr>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Specialty</th>
          <th>Email</th>
          <th>Phone</th>
          <th>Address(Zip,State,Street)</th>
          <th>Accept Insurances</th>
        
        </tr>
      </thead>
      <tbody id="myTable">
      <c:forEach items="${listDoctors}" var="doctor">
        <tr>
          <td>${doctor.firstname}</td>
          <td>${doctor.lastname}</td>
          <td>${doctor.specialization}</td>
          <td>${doctor.email}</td>
          <td>${doctor.phoneNumber}</td>
           <td>${doctor.address.zipcode}
          ${doctor.address.stateName}
          ${doctor.address.citiName}
          ${doctor.address.houseNumber}
          ${doctor.address.streetName}
          <c:if test="${doctor.address.aptNumber != null }">${doctor.address.aptNumber}</c:if>
          </td>
          
          
          <td><c:forEach items="${doctor.insurance}" var="docIns">
          ${docIns.insurName} </c:forEach></td>
         
        </tr>
       </c:forEach>
      </tbody>
    </table> 
  </div>
  
  <script>
  $(document).ready(function(){
    $("#myInput").on("keyup", function() {
      var value = $(this).val().toLowerCase();
      $("#myTable tr").filter(function() {
        $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
      });
    });
  });
  </script>
 
  </body>
  </html>