<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Les villes</title>
<meta charset="UTF-8" />
<base href="/vol-web/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<header class="header">

		<h1>Les villes</h1>

		</header>

		<section>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Identifiant</th>
					<th>Version</th>
					<th>Nom</th>
					<th>Code Postal</th>
					<th>Pays</th>
					<th></th>
				</tr>
			</thead>

			<tbody>

				<c:forEach items="${mesVilles}" var="vill">
					<tr>
						<td>${vill.id}</td>
						<td>${vill.version}</td>
						<td>${vill.nom}</td>
						<td>${vill.codePostal}</td>
						<td>${vill.pays}</td>
						<td><a href="ville/edit/${vill.id}"
							class="btn btn-info btn-sm">Editer</a> 
							
							<a href="ville/delete/${vill.id}"
							class="btn btn-danger btn-sm">Supprimer</a>
							
						</td>
					</tr>

				</c:forEach>

			</tbody>
		</table>
		<a href="ville/add" class="btn btn-success">Ajouter</a> 
		</section>
	</div>

</body>
</html>