<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="css/animate.css"/>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
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
<link rel="stylesheet" type="text/css" href="css/responsive.css"/>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/jquery-3.1.1.slim.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/animate js.js"></script>
<script type="text/javascript" src="js/wow-spec.js"></script>
</head>
<body>
<div class="container" style="margin-top:140px;">
    	<div class="row">
    	<div class="col-md-4 col-md-offset-4">
    	
    	</div>
        	<div class="col-md-4 col-md-offset-4">
            	<div class="panel panel-default">
                	<h4> Login With</h4><br />
                    	<span><i class="fa fa-facebook fa-2x"></i></span>
                        <span><i class="fa fa-twitter fa-2x"></i></span>
                        <span><i class="fa fa-google-plus fa-2x"></i></span>
                        <br /><br />
                        <h4>Ro</h4><hr />
                	<div class="panel-body">
                    	<form action="Login">
                        	<div class="form-group">
                            	<input type="text" name="custid" class="form-control" placeholder="Enter the user id" />
                            </div><!-----------form group----------->
                            <div class="form-group">
                            <input type="password" name="pw" class="form-control" placeholder="Enter the user password" />
                            </div><!-----------form group----------->
                            <div class="form-group">
                            	<input type="submit" name="submit"class="btn btn-success btn-lg btn-block" value="Login" />
                            	 <a href="/MCAP/emailDisp.jsp" ><button class="button button4">Forget Password</button></a>
                            </div><!-----------form group----------->
                        </form><!----------Form action--------->
                    </div><!----------------Panel-body----------->
                    	<div class="lock">
                        	<i class="fa fa-lock fa-5x"></i>
                        </div>
                        <div class="label">Login Form</div>
                         <div class="label2"></div>
                </div><!------------------Panel-default------>
            </div><!--------------Col------------>
        </div><!--------------------Row-------->
    </div><!-----------Container-------------->
</body>
</html>