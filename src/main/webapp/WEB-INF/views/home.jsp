<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="application/javascript"
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script type="text/javascript"
	src="//ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-route.js"></script>
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC3io-ZOFhgJx4HwpIPpXYlT6cE_Y8ROu4&callback=initMap"></script>
<script type="text/javascript"
	src="<spring:url value="/resources/scripts/google.js"/>"></script>
<script type="text/javascript"
	src="<spring:url value="/resources/AngularJS/Route.js"/>"></script>

<style>
.navbar {
    margin-bottom: 0;
    background-color: #000000;
   }


</style>	

<title>Pioneer Solution</title>
</head>
<body ng-app="pioneerApp">

 	<div id="header">
		<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Pioneer Solutions</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li><a href="#/"><span class="glyphicon glyphicon-home"></span>
								Home</a></li>
					<li><a href="#"><span class="glyphicon glyphicon-book"></span>
								CoursesOffered</a></li>
					<li><a href="#"><span class="glyphicon glyphicon-knight"></span>
							Clients</a></li>
					<li><a href="#"><span class="glyphicon glyphicon-user"></span>
							Students</a></li>
					<li><a href="#"><span class="glyphicon glyphicon-wrench"></span>
							Management</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-user"></span>
							Sign Up</a></li>
					<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
							Login</a></li>
				</ul>
			</div>
		</div>
		</nav>

	</div>
	
	<div ng-view></div>


<div>
<div class="container-fluid bg-grey">
  <h2 class="text-center">CONTACT</h2>
  <div class="row">
    <div class="col-sm-5">
      <p>Contact us and we'll get back to you within 24 hours.</p>
      <p><span class="glyphicon glyphicon-map-marker"></span> Irving,Texas, US</p>
      <p><span class="glyphicon glyphicon-phone"></span> +1800-878-PION</p>
      <p><span class="glyphicon glyphicon-envelope"></span> careers@pioneertech.com</p> 
    </div>
   	<div class="col-sm-7">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea><br>
      <div class="row">
        <div class="col-sm-12 form-group">
          <button class="btn btn-default pull-right" type="submit">Send</button>
        </div>
      </div> 
    </div>
  </div>
</div>
<div id="googleMap" style="height:200px;width:100%;"></div>

</div>
</body>
</html>