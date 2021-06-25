<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
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
<body>
 <header>
    <div class="d-flex justify-content-center">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
        <h2>Welcome ${pageContext.request.userPrincipal.name} | <a class="btn btn-secondary" onclick="document.forms['logoutForm'].submit()">Logout</a></h2>
    </c:if>
  </div>   
        <div class="d-flex flex-row-reverse justify-content-center">                
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
<c:if test="${message != null}">
		<div>${message}</div>
</c:if>
</div>
	<div class="d-flex justify-content-center">
		<form:form method="POST" enctype="multipart/form-data" action="/uploadForm">
		<br>
			<table>
				<tr><td>File to upload:</td><td><input type="file" name="file" /></td></tr>
				<tr><td></td><td><input type="submit" value="Upload" /></td></tr>
			</table>
		</form:form>
	</div>
	<br><br>
		<div class="container mt-3 text-center">
    	<h3>Uploaded files</h3>
    	<table class="table table-bordered" id="tbl">
		<thead>
		<tr>
		<th>File name</th>
		</tr>
		</thead>
		<tbody>
			<c:forEach items="${files}" var="file">
			<tr>
			<td>${file}</td>
			</tr>
		</c:forEach>
		</tbody>
		</table>
		</div>

</body>
</html>