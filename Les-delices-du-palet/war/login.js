var loginHtml =
	"<h1>Connexion</h1>" +
	"Login : <input type=\"text\" id=\"loginPseudo\">" +
	"Password : <input type=\"text\" id=\"loginPwd\">" +
	"<button onclick=\"sendLogin()\">Send</button>";

var subscribeHtml =
	"<h1>Inscription</h1>" +
	"Login : <input type=\"text\" id=\"subscribePseudo\"><br>" +
	"Password : <input type=\"text\" id=\"subscribePwd\"><br>" +
	"Mail : <input type=\"text\" id=\"subscribeMail\"><br>" +
	"<button onclick=\"sendSubscribe()\">Send</button>";
	
function getXMLHttpRequest() {
    var xhr = null;
    
    if (window.XMLHttpRequest || window.ActiveXObject) {
        if (window.ActiveXObject) {
            try {
                xhr = new ActiveXObject("Msxml2.XMLHTTP");
            } catch(e) {
                xhr = new ActiveXObject("Microsoft.XMLHTTP");
            }
        } else {
            xhr = new XMLHttpRequest(); 
        }
    } else {
        alert("Votre navigateur ne supporte pas l'objet XMLHTTPRequest...");
        return null;
    }
    
    return xhr;
}

function receiveLogin (xhr, login, pwd) {
	if (xhr.readyState == 4 && (xhr.status == 200 || xhr.status == 0)) {
		alert(xhr.responseText); // Données textuelles récupérées
		login.value="";
		pwd.value="";
	}
}

function sendLogin () {
	
	var login = document.getElementById("loginPseudo");
	var pwd = document.getElementById("loginPwd");
	var xhr = getXMLHttpRequest();
	xhr.onreadystatechange = function () {
		receiveLogin (xhr, login, pwd);
	}
	var url = "/login?login=" + login.value + "&pwd=" + pwd.value;
	xhr.open("GET",url,true);
	xhr.send(null);
}

function login () {
	switchContent(loginHtml);
}


function receiveSubscribe (xhr, login, pwd, mail) {
	if (xhr.readyState == 4 && (xhr.status == 200 || xhr.status == 0)) {
		alert(xhr.responseText); // Données textuelles récupérées
		login.value="";
		pwd.value="";
		mail.value="";
	}
}

function sendSubscribe () {
	
	var login = document.getElementById("subscribePseudo");
	var pwd = document.getElementById("subscribePwd");
	var mail = document.getElementById("subscribeMail");
	
	var xhr = getXMLHttpRequest();
	xhr.onreadystatechange = function () {
		receiveSubscribe (xhr, login, pwd, mail);
	}
	var url = "/subscribe?login=" + login.value + "&pwd=" + pwd.value
		+ "&mail=" + mail.value;
	xhr.open("GET",url,true);
	xhr.send(null);
}

function subscribe () {
	switchContent(subscribeHtml);
}

