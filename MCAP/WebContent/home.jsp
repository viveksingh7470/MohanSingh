<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="css/animate.css"/>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="css/main.css"/>
<link rel="stylesheet" type="text/css" href="css/responsive.css"/>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/jquery-3.1.1.slim.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/animate js.js"></script>
<script type="text/javascript" src="js/wow-spec.js"></script>
<style>
.button
 {
  background-color: #034f84; 
  border: none;
  color: white;
  padding: 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
    text-shadow: 1px 1px 2px black, 0 0 25px blue, 0 0 5px darkblue;
}
.button4:hover {
  background:rgba(0,0,0,0.5);
  color: white;
}
.button4 {border-radius: 12px;}
#myVideo {
  position: fixed;
  right: 0;
  bottom: 0;
  min-width: 100%; 
  min-height: 100%;
}
h1 {
  color: white;
  text-shadow: 1px 1px 2px black, 0 0 25px blue, 0 0 5px darkblue;
}
</style>
</head>
<body>
<video autoplay muted loop id="myVideo">
  <source src="kk.mov">
 
</video>
   <div class="container" >
                     
                     <div class="row">
                     <div class="col-md-3">
                     </div>
    	<div class="col-md-6"">
        <h1 style="margin-top:30px">&nbsp;&nbsp;&nbsp;&nbsp;Welcome to BankApp</h1></h1>
        </div>
        <div class="col-md-1"">
                     </div>
                     <div class="col-md-2"">
                     <a href="Logout" ><img src="log out.png"></a>
                         &nbsp;&nbsp;  &nbsp;&nbsp;
                     </div>
    </div>
  </div>
  <br>
  <br>
   
   <!---------------------------------Second row Start---------------------------------------->
<div class="container"  ;">

	<div class="row wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms"">
    	<div class="col-md-3">
        	
        </div>
        <div class="col-md-6 "style="background-color:#000; background:rgba(0,0,0,0.7);box-shadow:0px 0px 10px 10px #CCC">
         <br>
         <br>
&nbsp;&nbsp;&nbsp;&nbsp; <a href="CheckBalance" ><button class="button button4">Balance check</button></a>
  &nbsp;&nbsp;  &nbsp;&nbsp;
 <a href="transferMony.jsp" ><button class="button button4">Tranfer Mony</button></a>
 &nbsp;&nbsp;  &nbsp;&nbsp;
 <a href="applyLoan.jsp" ><button class="button button4">
 &nbsp; &nbsp;&nbsp; Apply Loan&nbsp;&nbsp;&nbsp;&nbsp;</button></a>
 &nbsp;&nbsp;  &nbsp;&nbsp;
 <br>

  &nbsp;&nbsp;&nbsp;&nbsp;<a href="GetStetment" ><button class="button button4">Get statement</button></a>
  &nbsp;&nbsp;  &nbsp;&nbsp;
 <a href="resetPwd.jsp" ><button class="button button4">Rest Password</button></a>
 &nbsp;&nbsp;  &nbsp;&nbsp;
 <a href="#" ><button class="button button4">Forget Password</button></a>
 <br>
 <br>
<br>

  </div>
 
        </div>
        	<div class="col-md-3" >
        
           </div>
           
    </div>
    
</div>
<!---------------------------------Second row end---------------------------------------->

</body>
</html>