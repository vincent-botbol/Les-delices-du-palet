//Voilà comment se passe la création d'un service web dans les grandes lignes. Petit exemple:
//Typiquement, on a:

////////////////////////
//Une page html:

<form action="javascript:(function(){return;})()" method ="post" onSubmit="javascript:connecte(this)">
     <div id="formulaire">
       <div class="ids">
       <span>Login</span>
       <input type="text" name="login">
     </div>
     
     <div class="ids">
       <span>Mot de Passe</span>
       <input type="password" name="password">
     </div>
     
     <div class="buttons">
       <input type="submit" value="Connexion" />
       <input type="button" value="Annuler" onClick="window.location.href='index.html'" />
     </div>
     
     </div>
</form>
     

///////////////
//Un script js:

function connecte(formulaire){
     var login=formulaire.login.value;
     var password=formulaire.password.value;
     var ok=verif_formulaire_connexion(login,password);
     if (ok){
	 connexion(login,password);
     }
}

function connexion(login, password){
    $.ajax({
	    type: "GET", //méthode d'envoi au serveur
		url: "http://132.227.201.134:8080/lesdelicesdupalet/servlet/Login", 
		//url = addresse du serveur, là j'ai mis un truc
		//random et "Login" est le nom de la servlet
		data: "login="+login+"&password="+password, //comment ça apparait après l'url
		dataType: "jsonp",//le p de jsonp sert à éviter les
				  //cas de cross domain car la servlet
				  //n'est pas à la meme adresse
		success: traiteReponseConnexion, 
		//quand on aura une réponse du serveur, on appellera
		//cette fonction avec en paramètre la réponse du
		//serveur qui sera un json
		error: function (jhi, status, exception){ //2eme paramètre = code d'erreur, 3eme = exception le premier je sais plus
		  alert("Problème communication "+status+" "+exception);
		  deconnexion();//deconnexion de l'utilisateur si erreur 
	        }
	   });
}

/////////////////////////////////
//Une servlet qui contient entre autres le code suivant:

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    JSONObject json = Users.connectUser(request.getParameter("login"), request.getParameter("password"));
    //je parle de la classe Users dans la suite de l'exemple
    response.getWriter().println(json.toString());//On met la réponse dans le json pour que le client la récupère
	}

////////////////////////////////
//Une classe Users qui gère toutes les fonctions utilisateur comme la
//connexion, l'enregistrement, la déconnexion etc... Dans cette classe
//on retrouve la fonction précédente ConnectUser:

public static JSONObject connectUser(String login, String password){
    if (BDUser.verifLoginPassword(login, password)){
	//Là on fait appelle à une classe qui gère la BD, faut que je vois comment ça fonctionne avec les JDO
	JSONObject json = new JSONObject();
	try {
	    json.put ("output" ,"OK" );//Juste un message pour dire
				       //que tout s'est bien passé,
				       //pas besoin d'infos
				       //pertinentes dans ce json
	} catch ( JSONException e ) {
	    return Tools.erreur(e.getMessage());
	}
	return json;
    }
    else
	return Tools.erreur("Login ou mot de pass incorrect");
}

//Reste donc à voir la BD comment ça se passe concrètement

