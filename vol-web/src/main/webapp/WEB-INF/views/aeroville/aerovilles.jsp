<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Villes et aéroports</title>
<meta charset="UTF-8" />
<base href="/vol-web/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<header class="header">

		<h1>Associer une ville à un aéroport</h1>

		</header>

		<section>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Identifiant</th>
					<th>Aeroport(s)</th>
					<th>Ville(s)</th>
					<th></th>
				</tr>
			</thead>

			<tbody>

				<c:forEach items="${mesAerovilles}" var="aevill">
					<tr>
						<td>${aevill.id}</td>
						<td>${aevill.aeroport.code}</td>
						<td>${aevill.ville.nom}</td>
						<td><a href="aeroville/delete/${aevill.id}"
							class="btn btn-danger btn-sm">Supprimer</a>
							
						</td>
					</tr>

				</c:forEach>

			</tbody>
		</table>
		<a href="aeroville/add" class="btn btn-success">Ajouter</a> 
		</section>
	</div>

</body>
</html>