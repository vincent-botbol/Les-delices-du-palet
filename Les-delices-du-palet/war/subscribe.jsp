<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t"%>

<t:page_template>
	<jsp:attribute name="headextra">
	<title>Les Délices du Palet - Inscription</title>
	<link rel="stylesheet" href="/styles/form.css" type="text/css">
  </jsp:attribute>
	<jsp:attribute name="content">
  	<form method="get" action="/subscribe">
		<fieldset>
		<legend>Inscription</legend>
			<label for="login">Identifiant</label> <input type="text" id="login"
					name="login" /> 
					
			<label for="pwd">Mot de passe</label> <input type="password" id="pwd"
					name="pwd" /> 
				
			<label for="mail">Adresse Mail</label> <input type="email"
					name="mail" />
					
			<input class="unlabeled" type="submit" value="Envoyer"/>
			</fieldset>
		</form>
  </jsp:attribute>
</t:page_template>