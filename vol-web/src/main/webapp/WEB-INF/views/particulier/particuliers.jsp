<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html>
	<head>
		<title>La page des Particuliers</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=devide-width, initial-scale=1" />
		<base href="/vol-web/"/>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	</head>
	<body>
		<div class="containers">
			<header class="header">
				<h1>Les Particuliers</h1>
			</header>
			<section>
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Identifiant</th>
							<th>Version</th>
							<th>Civilité</th>
							<th>Nom</th>
							<th>Prénom</th>
							<th>Numéro de Téléphone</th>
							<th>Adresse mail</th>
							<th>Rue</th>
							<th>Code postal</th>
							<th>Ville</th>
							<th>Pays</th>
							<th></th>
						</tr>
					</thead>
		
					<tbody>
						
						<c:forEach items="${particuliers}" var="particulier">
							<tr>
								<td>${particulier.id}</td>
								<td>${particulier.version}</td>
								<td>${particulier.civilite}</td>
								<td>${particulier.nom}</td>
								<td>${particulier.prenom}</td>
								<td>${particulier.numeroTel}</td>
								<td>${particulier.email}</td>
								<td>${particulier.adresse.rue}</td>
								<td>${particulier.adresse.codePostal}</td>
								<td>${particulier.adresse.ville}</td>
								<td>${particulier.adresse.pays}</td>
								<td><a href="particulier/edit/${particulier.id}" class="btn btn-info btn-sm">Editer</a>
									<a href="particulier/delete/${particulier.id}" class="btn btn-danger btn-sm">Supprimer</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<a href="particulier/add" class="btn btn-success">Ajouter</a>
			</section>
		</div>
	</body>
</html>