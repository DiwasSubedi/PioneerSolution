<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="http://getbootstrap.com/dist/css/bootstrap.css" rel="stylesheet">
<link href="http://getbootstrap.com/examples/jumbotron/jumbotron.css"	rel="stylesheet">
<title>Login</title>
</head>
<body>

<div class="jumbotron">

<h3>PLease Login in the system</h3>
</div>
<div class="container">

		<c:if test="${not empty error }">
    	<div class="alert alert-danger">
    	<strong> Login Failed!!!</strong></br>
    	Caused By: ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
    	</div> 
    	</c:if>
    	<c:if test="${not empty out}">
    	<div class="alert alert-success">
    	<strong> Successfully logged out of the system. Thank you. </strong></br>
    	</div>    	
    	
    	</c:if>
    	<div class="row">    	
    	
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="login-form" action="j_spring_security_check" method="post" role="form" style="display: block;">
									<div class="form-group">
										<input type="text" name="j_username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
									</div>
									<div class="form-group">
										<input type="password" name="j_password" id="password" tabindex="2" class="form-control" placeholder="Password">
									</div>
									<div class="form-group text-center">
										<input type="checkbox" tabindex="3" class="" name="remember" id="remember">
										<label for="remember"> Remember Me</label>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<div class="text-center">
													<a href="/recover" tabindex="5" class="forgot-password">Forgot Password?</a>
												</div>
											</div>
										</div>
									</div>
								</form>								
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>