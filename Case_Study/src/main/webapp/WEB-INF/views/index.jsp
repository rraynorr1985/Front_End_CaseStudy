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
            <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles/style.css">
      
        <title>LapMed | Store your Medical History ONLINE</title>
        </head>
        <body class="headerbg">
            <header>
                <div class ="container">
                    <div class="row">
                        <div class="mx-auto">
                <div class="d-flex flex-row-reverse justify-content-center">
                    
                <div class="p-2"><a href="reg" class="btn btn-secondary">Registration</a></div>
                    <div class="p-2"><a href="log" class="btn btn-secondary">Login</a></div>
                    <div class="p-2">
                        <h2 class=""><strong>LapMed | Store your Medical History ONLINE </strong></h2>
                        </div>
            </div>
        </div>
        </div>
        </div>
            </header><!--Navigation starts here-->
            <nav class="navbar navbar-expand-sm navpan justify-content-center">
                <ul class="navbar-nav">
                    <a class="nav-brand"><img src="${pageContext.request.contextPath}/resources/pictures/test200x200.png" onmouseenter="mouseenter()" onmouseout="mouseout()" id="logo" alt="Logo" width=50px/></a>
                    <li class="nav-item"><a class="nav-link h1c" href="${pageContext.request.contextPath}/">Home</a></li>
                    <li class="nav-item"><a class="nav-link h1c" href="#">About us</a></li>
                    <li class="nav-item"><a class="nav-link h1c" href="#">Contact us</a></li>
                    
                </ul>
            </nav>
            <br>
            <br>
            <div class="d-flex justify-content-center">
                <div class="row">
            <div id="demo" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ul class="carousel-indicators">
                  <li data-target="#demo" data-slide-to="0" class="active"></li>
                  <li data-target="#demo" data-slide-to="1"></li>
                  <li data-target="#demo" data-slide-to="2"></li>
                </ul>
              
                <!-- The slideshow -->
                <div class="carousel-inner carousel2">
                  <div class="carousel-item active">
                    <img class="img-fluid" src="${pageContext.request.contextPath}/resources/pictures/slide1_final.jpg" alt="Responsive image">
                  </div>
                  <div class="carousel-item">
                    <img class="img-fluid" src="${pageContext.request.contextPath}/resources/pictures/Slide2_final.png" alt="Responsive image">
                  </div>
                  <div class="carousel-item">
                    <img class="img-fluid" src="${pageContext.request.contextPath}/resources/pictures/Slide3_final.jpg" alt="Responsive image">
                  </div>
                </div>
              
                <!-- Left and right controls -->
                <a class="carousel-control-prev" href="#demo" data-slide="prev">
                  <span class="carousel-control-prev-icon"></span>
                </a>
                <a class="carousel-control-next" href="#demo" data-slide="next">
                  <span class="carousel-control-next-icon"></span>
                </a>
            </div>
              </div>
            </div>
            <br>
            <br>

            <div class="container">
                
            <div class="d-flex justify-content-center">
                <div class="row">
                    <div class="col-lg-12">
                    <div class="input-group mt-3 mb-4">
                        <div class="input-group-prepend ml-3">
                        <form class="searchform" id="searchform0">
                                <select onchange="getValue()" name="doctors_spec" id="doctors" class="custom-select">
                                <option selected>Choose Doctor Specialty</option>
                                <option value="PCP">Primary Care Specialist</option>
                                <option value="Derm">Dermatologist</option>
                                <option value="Eye">EyeDoctor</option>
                                </select>
                                <div id="showValue">
                            </div>
                        </form>
                        <form onchange="getValue()" class="searchform" id="searchform2">
                            <select  name="states" id="state" class="custom-select">
                            <option selected>State</option>
                            <option value="Texas">Texas</option>
                            <option value="PA">Pennsylvania</option>
                            <option value="NY">New York</option>
                            </select>
                            <div id="showValue2">
                            </div>
                        </form>
                        <form onchange="getValue()"  class="searchform" id="searchform3">
                            <select name="city" id="city" class="custom-select">
                            <option selected>Choose City</option>
                            <option value="Dallas">Dallas</option>
                            <option value="Philadelphia">Philadelphia</option>
                            <option value="NYC">New York City</option>
                            </select>
                            <div id="showValue3">
                            </div>
                         </form>
              
                        <form onchange="getValue()" class="searchform" id="searchform4">
                        <select name="insurance" id="ins" class="custom-select">
                        <option selected>Choose your insurance</option>
                        <option value="BlueCross">Independent Blue Cross</option>
                        <option value="PAHW">PA Heath and Wellness</option>
                        <option value="Health partners">Health partners</option>
                        </select>
                        <div id="showValue4">
                        </div>
                        
                        </form>
                        
                    </div>
                    <div class="mx-auto">
                    <button type="button" class="btn btn-secondary">Search</button>
                </div>
                </div>
                </div>
            </div>
        </div>
            </div>
            <br>
            <div class="d-flex justify-content-center">
                <div class="row">
                    <a href="doctors">Search from table by Name, Phone, Email</a>

                </div>
            </div>
            <br>
            <br>
            <br>
            <br>
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
            <div class="d-flex justify-content-center text-center">
                <div>
                    <p>Have you ever lost your documents?</p>
                    <img class="mx-auto w-100 text-center" src="https://www.qmswrapper.com/files/Pictures/blog/Doc_in_a_paper_office/documents_in_a_paperless_office_cover2.gif" alt="Responsive image" />
             </div>
            </div>
            <br>
            <div class="d-flex mx-auto justify-content-center text-center">
                <u>It would never happen again with us!</u>
            </div>
        </div>
          </div>
        </div>
        </br>
    </br>
            <div class="container text-center mt-5">
                <div>
                    <form onsubmit="feedback()">
                    <h6>What do you like about our page?</h6>
                    <input type="checkbox" name="checker" class="fb" value="Good Design"> Good Design </br>
                    <input type="checkbox" name="checker" class="fb" value="Interesting Idea"> Interesting Idea </br>
                    <input type="checkbox" name="checker" class="fb" value="Nice colors"> Nice colors</br>
                    <input type="checkbox" name="checker" class="fb" value="Good Font choice"> Good Font choice </br>
                    <input type="checkbox" name="checker" class="fb" value="Fast Performance"> Fast Performance </br>
                    <input type="button"   onclick="selectAll()" value="Select All" />
                    <input type="button"  onclick="unselectAll()" value="UnSelect All" /></br>
                    <button type="submit" class="btn btn-secondary mt-2">Submit feedback</button>
                </form>     
            </div>
              </div>
            <br>
            
            <footer>
                <p>@ This web site made by Anatoly in 2021</p>
            </footer>

        </body>
   
</html>