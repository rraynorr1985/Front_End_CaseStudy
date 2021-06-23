<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
        <head>
            <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="${pageContext.request.contextPath}/resources/javascript/regex_validation.js" type="text/javascript"></script>

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
                                   
                    <div class="p-2"><a href="log" class="btn btn-secondary">Login</a></div>
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
            <br>
            <br>
                  
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-5 text-center mx-auto">
                        <h2>Registration</h2>
                            <form:form name="myForm" method="POST" modelAttribute="userForm">
                            		<spring:bind path="username">                                                        
                                    <div class="buttons ${status.error ? 'has-error' : ''}">
                                        <form:input class="input" type="text" path="username" onfocus="this.value=''" placeholder="UserName"></form:input>
                                        <form:errors path="username"></form:errors>
                                        </div>                                       
                                        </spring:bind>                                      
                                        &nbsp;
                                        <spring:bind path="password">                                
                                         <div class="buttons ${status.error ? 'has-error' : ''}">
                                        <form:input class="input" type="password" id="passw" path="password" onfocus="this.value=''" placeholder="Password"></form:input>
                                        <form:errors path="password"></form:errors>
                                        </div>                                       
                                        </spring:bind>                                       
                                         &nbsp;
                                        <spring:bind path="passwordConfirm">
                                         <div class="buttons ${status.error ? 'has-error' : ''}">
                                            <form:input class="input" type="password" id="pnum" path="passwordConfirm" onfocus="this.value=''" placeholder="Confirm your password"></form:input>
                                            <form:errors path="passwordConfirm"></form:errors>
                                            </div>   
                  						</spring:bind>                   						                   						                                                                                
                                         <div class="buttonreg">
                               			 <div>
                                		<button type="submit" class="btn btn-secondary" role="button">Registration</button>
                                			</div>
                           				 </div>
                                 </form:form>
                     </div>                
                    </div>
            </div>            
        </body>
</html>