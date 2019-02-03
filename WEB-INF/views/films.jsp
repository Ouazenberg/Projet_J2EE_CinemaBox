<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
 <head>
 
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.css" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.js"></script>
  <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=Bungee" rel="stylesheet"> 
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  
  <title> Cinéma Box</title>
 </head>

<body class="white"> 

<style>
.diva {
  height: 250px;
  width: 70%;
}
.divo {
  height: 250px;
  width: 60%;
}
.fontt{
	font-family: 'Bungee', cursive;
}
</style>

<nav>
    <div class="nav-wrapper grey darken-4">
    	<div class="container">
			<div class="container">
				<nav>
				    <div class="nav-wrapper grey darken-4">
				      <a href="/cinemaBox/Films" class="brand-logo"><img src="resources/images/logo.PNG"></a>
				      <ul id="nav-mobile" class="right hide-on-med-and-down">
				        <li><a href="/cinemaBox/Admin"><b><c:if test="${user.admin == 'true'}"> Espace Admin</c:if></b></a></li>
				        <li><a><b><font color="green">${user.prenomUtilisateur}</font></b></a></li>
				        <li><a href="/cinemaBox" title="Déconnexion"><b><font color="red"><i class="material-icons">power_settings_new</i></font></b></a></li>
				      </ul>
				    </div>
				</nav>
			</div>
		</div>   
	</div>
</nav>



<ul class="sidenav sidenav-fixed">
    <li><div class="user-view">
      <div class="background teal darken-4">
      </div>
      <a><span class="white-text name"> <b>${user.prenomUtilisateur} ${user.nomUtilisateur}</b></span></a>
      <a ><span class="white-text email">${user.email}</span></a><hr>
      <a class="fontt" ><h4>Cinema Box</h4></a>
      <a class="fontt" href="<c:url value='/Films' />"><font color="orange"><h5>Films</h5></font></a><br>
    </div></li>
    <li>
    <form method="get" action="SearchResults" >
    <div class="row">
      <div class="col s0.5"></div>
      <div class="col s9">
      <input type="search" name="search" id="autocomplete-input" class="validate autocomplete" placeholder="Search" >
      </div>
      <div class="col s1"><button type="submit"style="background-color: Transparent; border: none;" class="waves-effect" ><i class="small material-icons left">search</i></button></div>
     </div> 
     </form>
    </li>
   <hr><br>
   
    <li><a class="subheader"><h6><b>Categories</b></h6></a></li>
    <li><a class="waves-effect" href="#demo-carousel1"><h6>Action</h6></a></li>
    <li><a class="waves-effect" href="#demo-carousel2"><h6>Comédie</h6></a></li>
    <li><a class="waves-effect" href="#demo-carousel3"><h6>Romance</h6></a></li>
    <li><a class="waves-effect" href="#demo-carousel4"><h6>Guerre</h6></a></li>
</ul>

<ul class="sidenav sidenav-fixed right-aligned center">
    <center> <a class="fontt" ><font color="red"><h4>Suggestions</h4></font></a> </center><br><br>
    <a href="<c:url value='/Details?idFilm=${filmsPref[0].idFilm}' />"><img class="divo" src="${filmsPref[0].posterFilm}"></a> <br><br>
    <a href="<c:url value='/Details?idFilm=${filmsPref[1].idFilm}' />"><img class="divo" src="${filmsPref[1].posterFilm}"></a> <br><br>
</ul>

<br>
<div class="container diva">
<div class="container ">
<div class="carousel carousel-slider" id="demo-carousel-auto" data-indicators="true">
	<c:forEach items="${filmsRecom}" var="film">
    <a class="carousel-item" href="<c:url value='/Details?idFilm=${film.idFilm}' />"><img src="${film.posterFilmLarge}"></a>
    </c:forEach>
</div>
</div>
</div>

<br><br>

	<div class="container">
		
		<div class="carousel white" id="demo-carousel1" >
			<c:forEach items="${films}" var="film">
			<c:if test="${film.categorie.nomCategorie == 'Action'}">
		    <a class="carousel-item" href="<c:url value='/Details?idFilm=${film.idFilm}' />"><img src="${film.posterFilm}"></a>
		    </c:if>
		    </c:forEach>
		    <center> <a class="fontt" ><font color="red"><h4>Action</h4></font></a> </center>
		</div>
		 <div class="carousel white" id="demo-carousel2" >
			<c:forEach items="${films}" var="film">
			<c:if test="${film.categorie.nomCategorie == 'Comedie'}">
		    <a class="carousel-item" href="<c:url value='/Details?idFilm=${film.idFilm}' />"><img src="${film.posterFilm}"></a>
		    </c:if>
		    </c:forEach>
		    <center> <a class="fontt" ><font color="red"><h4>Comedie</h4></font></a> </center>
		</div>
		 <div class="carousel white" id="demo-carousel3" >
			<c:forEach items="${films}" var="film">
			<c:if test="${film.categorie.nomCategorie == 'Romance'}">
		    <a class="carousel-item" href="<c:url value='/Details?idFilm=${film.idFilm}' />"><img src="${film.posterFilm}"></a>
		    </c:if>
		    </c:forEach>
		    <center> <a class="fontt" ><font color="red"><h4>Romance</h4></font></a> </center>
   		</div>
   		<c:if test="${user.ageUtilisateur < 16}"><div class="carousel white" style="display:none" id="demo-carousel4" ></c:if>
		<c:if test="${user.ageUtilisateur >= 16}"><div class="carousel white" id="demo-carousel4" ></c:if>
			<c:forEach items="${films}" var="film">
			<c:if test="${film.categorie.nomCategorie == 'Guerre'}">
		    <a class="carousel-item" href="<c:url value='/Details?idFilm=${film.idFilm}' />"><img src="${film.posterFilm}"></a>
		    </c:if>
		    </c:forEach>
		    <center> <a class="fontt" ><font color="red"><h4>Guerre</h4></font></a> </center>
		</div>
	
		
	</div>

</body>   
<script>
$('#demo-carousel2').carousel({
	 duration: 200, // 600
	    dist: -100, // -50 // -200 // 100
	    shift: 0, // 50
	    padding: 0, // 100
	    numVisible: 7, // 1 // 3 // 7
	    fullWidth: false, // true // not working!
	    indicators: false, // not working!
	    noWrap: false, // not working!
	    onCycleTo: null // not working!
	});

$(document).ready(function(){
    $('#demo-carousel1').carousel();
  });
  
$(document).ready(function(){
    $('#demo-carousel2').carousel();
  });
$(document).ready(function(){
    $('#demo-carousel3').carousel();
  });
$(document).ready(function(){
    $('#demo-carousel4').carousel();
  });
</script>

<script>
$(document).ready(function(){
 $('#demo-carousel-auto').carousel();
  setInterval(function() {
    $('#demo-carousel-auto').carousel('next');
  }, 3000);    
    
});


</script>

</html>

