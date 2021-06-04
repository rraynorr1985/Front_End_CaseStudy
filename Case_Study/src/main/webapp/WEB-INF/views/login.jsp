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
                    
                
                <div class="p-2"><a href="reg" class="btn btn-secondary" role="button">Registration</a></div>
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
                    <div class="col-lg-4 text-center mx-auto">
                        <h2>User Login</h2>
                        <form name="myForm2" onsubmit="return(loginvalidation())" method="POST" id="formtwo">
                        <div class="buttons">
                            <input class="input" type="text" id="email" name="email" onfocus="this.value=''" placeholder="Email">
                        </div>
                            <div class="buttons">
                                <input class="input" type="password" id="passw" name="passw" onfocus="this.value=''" placeholder="Password">
                            </div>
                            <div class="buttons">
                                <div>
                                <button type="submit" class="btn btn-secondary" role="button">Login</button>
                                </div>
                            </div>
                    </form>
                </div>
                
                    </div>
            </div>


        </body>
   
</html>