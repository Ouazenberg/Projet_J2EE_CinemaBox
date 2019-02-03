<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Cinema Box</title>

    <!-- Bootstrap core CSS -->
    <link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Plugin CSS -->
    <link href="resources/vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="resources/css/creative.min.css" rel="stylesheet">

	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>

  <body id="page-top">

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
      <div class="container">
        <a class="navbar-brand js-scroll-trigger" href="#page-top">Cinéma Box</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#inscription">s'inscrire</a>
            </li>
			<li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#about">A propos</a>
            </li>
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#contact">Contact</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <header class="masthead text-center text-white d-flex">
      <div class="container my-auto">
        <div class="row">
          <div class="col-lg-10 mx-auto" >
          <a class="brand-logo"><img src="resources/images/logoo.PNG"></a>
            <h1>
				<strong class="text-faded mb-5"></strong>		  
				<p class="text-faded mb-2">Bring The Movie Home</p>
				<p class="text-faded mb-2"><b>Ferhat OUAZENE</b></p>
            </h1>
            <hr>
          </div>
          <div class="col-lg-8 mx-auto">
            <p class="text-faded mb-5">Your favorite source of Movies</p>
            <button class="btn btn-primary btn-xl js-scroll-trigger" data-toggle="modal" data-target="#myModal">Se Connecter</button>
          </div>
        </div>
        <br><br>
        <div > <font color="red" ><b>${text}</b></font></div>
      </div>
    </header>

    <section class="bg-secondary" id="about">
      <div class="container">
        <div class="row">
          <div class="col-lg-8 mx-auto text-center">
            <h2 class="section-heading text-white">On a ce dont vous avez besoin!</h2>
            <hr class="light my-4">
            <p class="text-faded mb-4">Ceci est un site web CINEMA BOX dans le cadre du projet de validation du cours "Théorie, conception, normes et standard des Hypermedia en Master II THYP!</p>
            <p>Supervisé par Mr:</p>
			<a class="btn btn-light btn-xl js-scroll-trigger" href="http://www.isaleh.univ-paris8.fr/Accueil-home">Imad SALEH</a>
          </div>
        </div>
      </div>
    </section>
    
<section class=" text-white bg-dark"  id="inscription">
<div align="center">
<h1>Inscription</h1><br>
<c:url var="addAction" value="/User/AjouterUser" ></c:url>

<form:form action="${addAction}" commandName="newUser" class="table table-sm ">
<table>
	<tr>
		<td>
			<form:label path="nomUtilisateur">
				<spring:message text="Nom:"/>
			</form:label>
		</td>
		<td>
			<form:input path="nomUtilisateur" class="form-control" placeholder="Nom" minlength="3" required="required"/>
		</td> 
	</tr>

	<tr>
		<td>
			<form:label path="prenomUtilisateur">
				<spring:message text="Prénom:"/>
			</form:label>
		</td>
		<td>
			<form:input path="prenomUtilisateur" class="form-control" placeholder="Prénom" minlength="3" required="required"/>
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label path="ageUtilisateur">
				<spring:message text="Age:"/>
			</form:label>
		</td>
		<td>
			<form:input path="ageUtilisateur" class="form-control" placeholder="Age" minlength="2" required="required"/>
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label path="email">
				<spring:message text="E-mail:"/>
			</form:label>
		</td>
		<td>
			<form:input type="email" path="email" class="form-control" placeholder="E-mail" required="required"/>
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label path="password">
				<spring:message text="Password:"/>
			</form:label>
		</td>
		<td>
			<form:input type="password" path="password" class="form-control" placeholder="4 characters minimum" minlength="4" required="required"/>
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label path="admin"></form:label>
		</td>
		<td>
				<form:hidden path="admin" value="false" />
		</td>	
	</tr>
	<tr>
		<td>
			<form:label path="categoriePreferee">
				<spring:message text="Préfération:"/>
			</form:label>
		</td>
		<td>
				<select id="categoriePreferee" name="categoriePreferee" class="form-control" >
   					<option value="Action">Action</option>
   					<option value="Comedie">Comedie</option>
   					<option value="Romance">Romance</option>
   					<option value="Guerre">Guerre</option>
  				</select> 
		</td>	
	</tr>
	
	<tr>
		<td align="right"  colspan="2">
		<input type="submit" class="btn btn-primary"value="<spring:message text="Ajouter"/>" />
		</td>
	</tr>
</table>	
</form:form>
</div>    
    </section>

    <section id="contact">
      <div class="container">
        <div class="row">
          <div class="col-lg-8 mx-auto text-center">
            <h2 class="section-heading">Restons en contact!</h2>
            <hr class="my-4">
            <p class="mb-5">Partagez vos idées avec nous pour améliorer cette plateforme... Contactez nous par téléphone ou par email et nous reviendrons vers vous dés que possible!</p>
          </div>
        </div>
        <div class="row">
          <div class="col-lg-4 ml-auto text-center">
            <i class="fas fa-phone fa-3x mb-3 sr-contact-1"></i>
            <p>123-456-6789</p>
          </div>
          <div class="col-lg-4 mr-auto text-center">
            <i class="fas fa-envelope fa-3x mb-3 sr-contact-2"></i>
            <p>
              <a href="mailto:ferhat.ouazene91@gmail.com">Nous contacter par email</a>
            </p>
          </div>
        </div>
      </div>
	  
	   <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog" >
    <div class="modal-dialog" >
    
      <!-- Modal content-->
      <div class="modal-content">
      
        <div class="modal-header">
          <h2 class="modal-title">Cinema Box</h2>
        </div>
        <div class="modal-body">
       <div class="container">
       
  <h4><center><b>Authentification</b></center> </h4>
  <form action="/cinemaBox/validate" method="post">
  
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="login" placeholder="Enter email" name="email">
    </div>
    
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
    </div>
    
    <div class="form-group form-check">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="remember"> Remember me
      </label>
    </div>
    
    <button type="submit" class="btn btn-primary">Submit</button>
    
    <br><br>
  </form>
</div>

        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
</div>



    </section>

    <!-- Bootstrap core JavaScript -->
    <script src="resources/vendor/jquery/jquery.min.js"></script>
    <script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="resources/vendor/jquery-easing/jquery.easing.min.js"></script>
    <script src="resources/vendor/scrollreveal/scrollreveal.min.js"></script>
    <script src="resources/vendor/magnific-popup/jquery.magnific-popup.min.js"></script>

    <!-- Custom scripts for this template -->
    <script src="resources/js/creative.min.js"></script>

  </body>

</html>

