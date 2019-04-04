<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check Balanace Display</title>
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
.button {
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
</style>
</head>
<body>
<!---------------------------------Second row Start---------------------------------------->
<!---------------------------------Second row Start---------------------------------------->
<div class="container"  ;">

	<div class="row wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms"">
    	<div class="col-md-3">
        	
        </div>
        
        <div class="col-md-6 "style="background-color:#000; background:rgba(0,0,0,0.7);box-shadow:0px 0px 10px 10px #CCC">
         <br>
         <br>
         <font color="white" >
         <h2>
         <%
out.println("Balance is :");
out.println(session.getAttribute("balance"));
%>
</h2>
</font>
<br>

<a href="home.jsp" ><button class="button button4">Back</button></a>

  </div>
 
        </div>
        	<div class="col-md-3" >
        
           </div>
           
    </div>
    
</div>
<!---------------------------------Second row end---------------------------------------->

</body>
</html>