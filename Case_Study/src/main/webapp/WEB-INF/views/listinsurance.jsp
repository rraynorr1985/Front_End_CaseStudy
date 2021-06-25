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
        <div class="d-flex flex-row-reverse justify-content-center">
                 
        <div class="p-2"><a href="reg" class="btn btn-secondary" role="button">Registration</a></div>
            <div class="p-2"><a href="login" class="btn btn-secondary" role="button">Login</a></div>
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
    <h2>Insurances Table</h2>
    <div class="d-flex justify-content-center">
    <a class="btn btn-secondary btn-lg" href="doctors" role="button">To Doctors Table</a>
    &nbsp;
    <a class="btn btn-secondary btn-lg" href="newins" role="button">New Insurance</a>
  		</div>
  		<br>
    <p>Type to search in the table</p>  
    <input class="form-control text-center" id="myInput" type="text" placeholder="Search..">
    <br>
    <table class="table table-bordered" id="tbl">
      <thead>
        <tr>
          <th>Insurance Name</th>
          <th>Insurance Phone</th>
          <th>Insurance WebPage</th>
        </tr>
      </thead>
      <tbody id="myTable2">
      <c:forEach items="${listInsurance}" var="insurance">
        <tr>
          <td>${insurance.insurName}</td>
          <td>${insurance.insPhone}</td>
          <td>${insurance.insWebLink}</td>
          <td>
          <div class="btn-group btn-group-sm">
          <a class="btn btn-secondary" href="editins?insid=${insurance.insid}" role="button">Edit</a>
          &nbsp;
          <a class="btn btn-secondary" href="deleteins?insid=${insurance.insid}" role="button">Delete</a>
          </div>
          </td>
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