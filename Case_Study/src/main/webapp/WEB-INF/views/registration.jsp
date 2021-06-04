<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    background-color: -internal-light-dark(rgb(255, 255, 255), rgb(59, 59, 59));
    border-style: solid;
    border-color: rgb(225, 225, 228);
    border-radius: 0px;
    border-width: 1px;
    box-sizing: border-box;
    color: #47607d;
    text-align: center;
    margin: 15px 0 0 15%;
    font-family: 'Alegreya Sans SC';
}
.buttonreg{
    height: 45px;
    width: 65%;
    background-color: -internal-light-dark(rgb(255, 255, 255), rgb(59, 59, 59));
    border-style: solid;
    border-color: rgb(225, 225, 228);
    border-radius: 0px;
    border-width: 0px;
    box-sizing: border-box;
    color: #47607d;
    text-align: center;
    margin: 15px 0 0 15%;
    font-family: 'Alegreya Sans SC';
}
.input{
    height: 45px;
    width: 100%;
    font-size: 18px;
    background-color: white;
   border: none;
   text-align: center;
   opacity: 0.5;
   font-family: 'Alegreya Sans SC';
}
.radio{
    opacity:0.5;
}
.login{
    height: 45px;
    width: 65%;
    font-size: 18px;
    margin: 15px 0 0 -25px;
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
        </style>

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
                        
                        
                            <form name="myForm" onsubmit="return(validate());" method="POST" id="formone">
                                <div class="buttons">
                                    <input class="input" type="text" id="namew" name="name" onfocus="this.value=''" placeholder="First Name">
                                </div>
                                <div class="buttons">
                                    <input class="input" type="text" id="lname" name="lname" onfocus="this.value=''" placeholder="Last Name">
                                </div>
                                <div class="buttons">
                                    <input class="input" type="text" id="iname" name="iname" onfocus="this.value=''" placeholder="Insurance company name">
                                    </div>
                                <div class="buttons">
                                    <input class="input" type="text" id="icard" name="icard" onfocus="this.value=''" placeholder="Insurance card">
                                </div>
                                
                                    <div class="buttons">
                                        <input class="input" type="text" id="email" name="email" onfocus="this.value=''" placeholder="Email">
                                        </div>
                                        <div class="buttons">
                                            <input type="radio" id="male" name="gender" value="male">
                                            <label for="male" class="radio">Male</label>
                                            <input type="radio" id="female" name="gender" value="female">
                                            <label for="female" class="radio">Female</label>
                                        </div>
                                        <div class="buttons">
                                            <input class="input" type="text" id="pnum" name="pnum" onfocus="this.value=''" placeholder="Phone Number">
                                            </div>
                                           
                                            <div class="buttons">
                                                <input class="input" type="text" id="emnum" name="emnum" onfocus="this.value=''" placeholder="Emergency Contact Number">
                                                </div>
                                                
                                         <div class="buttons">
                                        <input class="input" type="password" id="passw" name="pass" onfocus="this.value=''" placeholder="Password">
                                        </div>                                       
                           
                                         <div class="buttonreg">
                               			 <div>
                                		<button type="submit" class="btn btn-secondary" role="button">Registration</button>
                                			</div>
                           				 </div>
                                 </form>
                     </div>
                
                    </div>
            </div>

            
        </body>
   
</html>