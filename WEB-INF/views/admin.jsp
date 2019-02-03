<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="https://fonts.googleapis.com/css?family=PT+Serif" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-alpha.4/css/materialize.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

  <script type = "text/javascript" src = "https://code.jquery.com/jquery-2.1.1.min.js"></script>           
   <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-alpha.4/js/materialize.min.js"></script>
           
<style>
.collapsible-header {
  display: -webkit-box;
  display: -webkit-flex;
  display: -ms-flexbox;
  display: flex;
  cursor: pointer;
  -webkit-tap-highlight-color: transparent;
  line-height: 1.5;
  padding: 1rem;
  background-color: #455a64;
  border-bottom: 1px solid #ffa726;
  color: #fff;
}
.collapsible-body {
  display: none;
  border-bottom: 1px solid #ddd;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  padding: 2rem;
  
}
</style>

<title>Espace Admin</title>
</head>
<body>

	<nav>
	    <div class="nav-wrapper grey darken-4">
	      <a href="/cinemaBox/Films" class="brand-logo"><img src="resources/images/logo.PNG"></a>
	      <ul id="nav-mobile" class="right hide-on-med-and-down">
	      	 <li><a ><b> Espace Admin </b></a></li>
	        <li><a><b><font color="green">${user.prenomUtilisateur}</font></b></a></li>
	        <li><a href="/cinemaBox" title="Déconnexion"><b><font color="red"><i class="material-icons">power_settings_new</i></font></b></a></li>
	      </ul>
	    </div>
	</nav>

<br><br>

<div class="container">
<h5 align="center" style=" font-family: 'PT Serif', serif;" >Espace Administrateur</h5>
  <ul class="collapsible">
   <li class="active">
      <div class="collapsible-header"><i class="material-icons">people_outline</i>Liste des utilisateurs</div>
      <div class="collapsible-body"><span>
      <table border="1" class="table table-sm table-dark">
<tr>
<th scope="col">
#
</th>

<th scope="col">
Nom
</th>

<th scope="col">
Prénom
</th>

<th scope="col">
Email
</th>

<th scope="col">
Statut
</th>

<th class="center" scope="col">
Modifier
</th>

<th class="center" scope="col">
Supprimer
</th>

</tr>

<c:forEach items="${listUsers}" var="user">
<tr>
<th scope="row"> ${user.idUtilisateur} </th>
<td>${user.nomUtilisateur} </td>
<td>${user.prenomUtilisateur }</td>
<td>${user.email }</td>
<td><c:if test="${user.admin == true}"><font color = "orange">Administrateur</font></c:if>
<c:if test="${user.admin == false}"><font color = "green">Utilisateur</font></c:if>
</td>
<td class="center" > <a href="<c:url value='/PreModifierUtilisateur?idUtilisateur=${user.idUtilisateur}' />" class="material-icons"><font color = "orange">create</font></a> </td>
<td class="center" > <a href="<c:url value='/SupprimerUtilisateur?idUtilisateur=${user.idUtilisateur}' />" class="material-icons"><font color = "red">delete_forever</font></a> </td> 
<tr>
</c:forEach>
</table>

<c:if test="${userEdit.ageUtilisateur > 0}">
      <c:url var="addAction" value="/ModifierUtilisateur" ></c:url>

<form:form action="${addAction}" commandName="userEdit" class="table table-sm ">
<table >

<tr>
		<td>
			<form:label style="color:black; font-size:15px" path="idUtilisateur" ></form:label>
		</td>
		<td>
			<form:hidden path="idUtilisateur" value="${userEdit.idUtilisateur}" />	
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label style="color:black; font-size:15px" path="nomUtilisateur" >
				<spring:message text="Nom:"/>
			</form:label>
		</td>
		<td>
			<form:input path="nomUtilisateur" class="form-control" placeholder="Nom" value="${userEdit.nomUtilisateur}" required="required" minlength="3"/>
		</td> 
	</tr>

	<tr>
		<td>
			<form:label style="color:black; font-size:15px"  path="prenomUtilisateur">
				<spring:message text="Prénom:"/>
			</form:label>
		</td>
		<td>
			<form:input path="prenomUtilisateur" class="form-control" placeholder="Prénom" value="${userEdit.prenomUtilisateur}" minlength="3" required="required"/>
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label style="color:black; font-size:15px"  path="ageUtilisateur">
				<spring:message text="Age:"/>
			</form:label>
		</td>
		<td>
			<form:input path="ageUtilisateur" class="form-control" placeholder="Age" value="${userEdit.ageUtilisateur}" minlength="2" required="required"/>
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label style="color:black; font-size:15px"  path="email">
				<spring:message text="E-mail:"/>
			</form:label>
		</td>
		<td>
			<form:input type="email" path="email" class="form-control" placeholder="E-mail" value="${userEdit.email}" required="required"/>
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label style="color:black; font-size:15px"  path="password">
				<spring:message text="Password:"/>
			</form:label>
		</td>
		<td>
			<form:input path="password" class="form-control" placeholder="Mot de passe" value="${userEdit.password}" minlength="4" required="required"/>
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label style="color:black; font-size:15px"  path="admin">
				<spring:message text="Statut:"/>
			</form:label>
		</td>
		<td>
				<select id="admin" name="admin" class="form-control" >
   					<option value="true">Administrateur</option>
   					<option value="false">Utilisateur</option>
  				</select> 
		</td>	
	</tr>
	<tr>
		<td>
			<form:label style="color:black; font-size:15px"  path="categoriePreferee">
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
		<td align="center" colspan="2">
		<input type="submit" class="btn btn-primary"value="<spring:message text="Modifier"/>" />
		</td>
	</tr>
	
</table>	
</form:form>
      </c:if>
      </span></div>
    </li>
    <li>
      <div class="collapsible-header"><i class="material-icons">account_box</i>Ajouter un Utilisateur</div>
      <div class="collapsible-body"><span >
      <c:url var="addAction" value="/Admin/AjouterUser" ></c:url>

<form:form action="${addAction}" commandName="newUser" class="table table-sm ">
<table >
	<tr>
		<td>
			<form:label style="color:black; font-size:15px" path="nomUtilisateur">
				<spring:message text="Nom:"/>
			</form:label>
		</td>
		<td>
			<form:input path="nomUtilisateur" class="form-control" placeholder="Nom" required="required" minlength="3"/>
		</td> 
	</tr>

	<tr>
		<td>
			<form:label style="color:black; font-size:15px"  path="prenomUtilisateur">
				<spring:message text="Prénom:"/>
			</form:label>
		</td>
		<td>
			<form:input path="prenomUtilisateur" class="form-control" placeholder="Prénom" minlength="3" required="required"/>
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label style="color:black; font-size:15px"  path="ageUtilisateur">
				<spring:message text="Age:"/>
			</form:label>
		</td>
		<td>
			<form:input path="ageUtilisateur" class="form-control" placeholder="Age" minlength="2" required="required"/>
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label style="color:black; font-size:15px"  path="email">
				<spring:message text="E-mail:"/>
			</form:label>
		</td>
		<td>
			<form:input type="email" path="email" class="form-control" placeholder="E-mail" required="required"/>
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label style="color:black; font-size:15px"  path="password">
				<spring:message text="Password:"/>
			</form:label>
		</td>
		<td>
			<form:input path="password" class="form-control" placeholder="Mot de passe" minlength="4" required="required"/>
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label style="color:black; font-size:15px"  path="admin">
				<spring:message text="Statut:"/>
			</form:label>
		</td>
		<td>
				<select id="admin" name="admin" class="form-control" >
   					<option value="true">Administrateur</option>
   					<option value="false">Utilisateur</option>
  				</select> 
		</td>	
	</tr>
	<tr>
		<td>
			<form:label style="color:black; font-size:15px"  path="categoriePreferee">
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
		<td align="center" colspan="2">
		<input type="submit" class="btn btn-primary"value="<spring:message text="Ajouter"/>" />
		</td>
	</tr>
	
</table>	
</form:form>
</span></div>
    </li>
    
    
    <li >
      <div class="collapsible-header"><i class="material-icons">people</i>Ajouter un Acteur</div>
      <div class="collapsible-body"><span>
      
      <c:url var="addAction" value="/Admin/AjouterFilm" ></c:url>

<form:form action="${addAction}" commandName="newActeur" class="table table-sm ">
<table>
<br>
	<tr>
		<td>
			<form:label style="color:black; font-size:15px"  path="nomActeur">
				<spring:message text="Nom:"/>
			</form:label>
		</td>
		<td>
			<form:input path="nomActeur" class="form-control" placeholder="Nom" minlength="3" required="required"/>
		</td> 
	</tr>

	<tr>
		<td>
			<form:label style="color:black; font-size:15px"  path="prenomActeur">
				<spring:message text="Prénom:"/>
			</form:label>
		</td>
		<td>
			<form:input path="prenomActeur" class="form-control" placeholder="Prénom" minlength="3" required="required"/>
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label style="color:black; font-size:15px"  path="nationaliteActeur">
				<spring:message text="Nationalité:"/>
			</form:label>
		</td>
		<td>
			<form:input path="nationaliteActeur" class="form-control" placeholder="Nationalité" minlength="3" required="required"/>
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label style="color:black; font-size:15px"  path="anneeNaissaneActeur">
				<spring:message text="Naissance:"/>
			</form:label>
		</td>
		<td>
			<form:input path="anneeNaissaneActeur" class="form-control" placeholder="Année" minlength="4" required="required"/>
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label style="color:black; font-size:15px"  path="oscarActeur">
				<spring:message text="Oscar:"/>
			</form:label>
		</td>
		<td>
				<select id="oscarActeur" name="oscarActeur" class="form-control" >
   					<option value="true">Oscar</option>
   					<option value="false">Pas d'Oscar</option>
  				</select> 
		</td>	
	</tr>
	
	<tr >
		<td align="right">
				<input type="submit" class="btn btn-primary" value="<spring:message text="Ajouter"/>" />
		</td>
	</tr>
</table>	
</form:form>
      </span></div>
    </li>
    
  </ul>
</div>

<script>
  $(document).ready(function(){
    $('.collapsible').collapsible();
  });
</script>

</body>
</html>