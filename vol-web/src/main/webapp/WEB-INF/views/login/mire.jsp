<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Connexion</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<base href="/vol-web/"/>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	</head>
	<body>
		<div class="container">
			<form action="login/connect" method="post">
				<br>
				<div>
				    <label for="identifiant"><b>Nom d'utilisateur</b></label>
				    <br>
				    <input type="text" placeholder="Nom d'utilisateur" name="identifiant" required>
				</div>
				<br>
				<div>
				    <label for="motDePasse"><b>Mot de Passe</b></label>
				    <br>
				    <input type="password" placeholder="Mot de Passe" name="motDePasse" required>
			    </div>
			    <div>
			    <br>
			   		<button type="submit" class="btn btn-info">Se Connecter</button>
			    </div>
		    </form>
	    </div>
	</body>
</html>