var homeHtml = "<p>Page d\'accueil</p>";
var rankingHtml = "<p>Page de classement</p>";
var calendarHtml = "<p>Page de calendrier</p>";


function switchContent (newHtml) {
    var content = document.getElementById('content');
    content.innerHTML = newHtml;
}

function home () {
    switchContent(homeHtml);
}

function ranking () {
    switchContent(rankingHtml);
}

function calendar () {
    switchContent(calendarHtml);
}

