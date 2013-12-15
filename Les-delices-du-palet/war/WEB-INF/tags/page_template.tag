<%@ tag pageEncoding="UTF-8"%>
<%@ attribute name="headextra" fragment="true"%>
<%@ attribute name="content" fragment="true"%>
<!DOCTYPE html>

<html>
<head>
<!-- Place Common CSS here -->
<!-- Common JS here -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="icon" type="image/x-icon" href="/images/favicon.ico">
<link rel="stylesheet" href="/styles/main.css" type="text/css">

<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>

<jsp:invoke fragment="headextra" />
</head>

<body>
	<header>
		<!-- TODO : mettre en dur le titre dans l'image -->
		<div class="logo">Les délices du palet</div>

		<div class="menu">
			<ul class="left-menu">
				<li><a href="index.jsp">Accueil</a></li>
				<li><a href="ranking.jsp">Classement</a></li>
				<li><a href="calendar.jsp">Calendrier</a></li>
			</ul>
			<ul class="right-menu">
				<li><a href="subscribe.jsp">Inscription</a></li>
				<li><a href="login.jsp">Connexion</a></li>
			</ul>
		</div>
	</header>

	<div id="main-content">
		<jsp:invoke fragment="content" />
	</div>

	<footer>&copy; mes couilles</footer>
</body>
</html>