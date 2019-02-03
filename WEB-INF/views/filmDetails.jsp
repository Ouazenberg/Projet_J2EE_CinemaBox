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
 

  <title> Cinema Box</title>
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
    <div class="nav-wrapper grey darken-4 ">
    	<div class="container">
			<div class="container">
				<nav>
				    <div class=" nav-wrapper grey darken-4">
				      <a href="/cinemaBox/Films" class="brand-logo"><img src="resources/images/logo.PNG"></a>
				      <ul id="nav-mobile" class="right hide-on-med-and-down">
				         <li><a href="/cinemaBox/Admin"><b><c:if test="${user.admin == 'true'}"> Espace Admin</c:if></b></a></li>
				        <li><a><b><font color="green">${user.prenomUtilisateur}</font></b></a></li>
				        <li><a href="/cinemaBox/" title="Déconnexion"><b><font color="red"><i class="material-icons">power_settings_new</i></font></b></a></li>
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
    
    
    <li><div class="divider"></div></li>
    <div class="center"> <br>
    <a><img class="divo" src="${fil.posterFilm}"></a> </div>
</ul>

<ul class="sidenav sidenav-fixed right-aligned center">
    <a class="fontt" ><font color="red"><h4>Suggestions</h4></font></a><br>
    <a href="<c:url value='/Details?idFilm=${filmsPref[0].idFilm}' />"><img class="divo" src="${filmsPref[0].posterFilm}"></a> <br><br>
    <a href="<c:url value='/Details?idFilm=${filmsPref[1].idFilm}' />"><img class="divo" src="${filmsPref[1].posterFilm}"></a> <br><br>
</ul>

<br><br>
<div class="container">
	<div class="container">
		<div class="row">
   			<div class="col s12 ">
      			<div class="card blue-grey darken-1">
        			<div class="card-content white-text">
          			  	<a><center><img  width="670" height="370" src="${fil.posterFilmLarge}"></center></a>
			            <span class="card-title"><h4>${fil.nomFilm}</h4></span>
			          	<p>${fil.descriptionFilm}</p>
			          	<p><h6><b>Catégorie: </b>${fil.categorie.nomCategorie}</p>
			          	<p><h6><b>Réalisateur: </b>${fil.realisateur.prenomRealisateur} ${fil.realisateur.nomRealisateur}</p>
			          	<p><h6><b>Star: </b>${fil.acteur.prenomActeur} ${fil.acteur.nomActeur}</p>
        			  <br>
        			  <span class="card-title"><h5>Watch Me !!</h5></span>
        			  	<iframe width="670" height="370" src="${fil.bandeAnnonceFilm}" frameborder="0" 
        			  	allowfullscreen></iframe>
        			</div>
			        
			        <div class="card-action">
			          <a> <font style="color:red" >Acheter</font></a>
			          <a href="<c:url value='/Like?idFilm=${fil.idFilm}'/>">Like</a>
			        </div>
      			</div>
    		</div>
		</div>
	</div>
</div>
</body>
</html>