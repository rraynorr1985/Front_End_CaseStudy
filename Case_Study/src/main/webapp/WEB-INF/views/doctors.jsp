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

        <style>
            @import url("https://fonts.googleapis.com/css?family=Princess Sofia|Alegreya Sans SC|Alegreya SC |DM Sans");
           
           
            
    .main{
    width: 300px;
    height: 350px;
    background-color: #e8e8e8;
    padding-top: 50px;
    font-family: 'Alegreya Sans SC';
}
.buttons{
    height: 45px;
    width: 65%;
    background-color: #d3d3d3;
    text-align: center;
    margin: 15px 0 0 15%;
    font-family: 'Alegreya Sans SC';
    
}
.input{
    height: 45px;
    width: 100%;
    font-size: 18px;
    background-color: #d3d3d3;
    font-weight: bold;
   border: none;
   text-align: center;
   opacity: 0.3;
   font-family: 'Alegreya Sans SC';
}
.login{
    height: 45px;
    width: 65%;
    font-size: 18px;
    margin: 15px 0 0 -15px;
    background-color: #56c9e4;
    font-weight: bold;
    border: none;
    font-family: 'Alegreya SC';
    color: #8ee2ef;
}
h2{
    
    color: #9a9a9a;
}
.navpan{
    background-color: #56c9e4;
    color: #9a9a9a;
    font-weight: bold;
    font-family: 'Alegreya SC';
    font-size: 25px;
   
}
.h1c{
    font-family: 'Alegreya SC';
    color: #9a9a9a;
}
h1{
    font-family: 'Alegreya Sans SC';
    
}
.carousel2{
    max-width:100%; 
    height:auto; 
}
#tbl{
    background-color: white;
}
</style>
<title>LapMed | Store your Medical History ONLINE</title>
</head>
<body class="headerbg">
    <header>
        <div class="d-flex flex-row-reverse justify-content-center">
            
        <!-- <div class="col-lg-2"><img src="${pageContext.request.contextPath}/resources/pictures/test200x200.png" /></div> -->
        <div class="p-2"><a href="./Registration.html" class="btn btn-secondary" role="button">Registration</a></div>
            <div class="p-2"><a href="./Login.html" class="btn btn-secondary" role="button">Login</a></div>
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
    <p>Type to search the table for first names, last names, specialties, emails, phone numbers</p>  
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