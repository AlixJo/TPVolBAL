<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Passager</title>
<base href="/vol-web/" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

	<div class="container-fluid">

		<header class="header">

		<h1>Edition de passager</h1>

		</header>

		<section>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Identifiant</th>
					<th>Version</th>
					<th>Nom</th>
					<th>Pr�nom</th>
					<th>Date de naissance</th>
					<th>Piece d'identit�</th>
					<td>Reservation</td>
					<th>Rue</th>
					<th>Code postal</th>
					<th>Ville</th>
					<th>Pays</th>

					<th></th>
				</tr>
			</thead>

			<tbody>

				<c:forEach items="${passagers}" var="pass">
					<tr>
						<td>${pass.id}</td>
						<td>${pass.version}</td>
						<td>${pass.nom}</td>
						<td>${pass.prenom}</td>
						<td><fmt:formatDate value="${pass.dtNaissance}"
								pattern="dd/MM/yyyy" />
						<td>${pass.pieceIdentite}</td>
						<td>${pass.reservation.code}</td>
						<td>${pass.adresse.rue}</td>
						<td>${pass.adresse.codePostal}</td>
						<td>${pass.adresse.ville}</td>
						<td>${pass.adresse.pays}</td>
						<td><a href="passager/edit/${pass.id}"
							class="btn btn-info btn-sm">Editer</a> <a
							href="passager/delete/${pass.id}" class="btn btn-danger btn-sm">Supprimer</a></td>
					</tr>

				</c:forEach>





			</tbody>
		</table>
		<a href="passager/add" class="btn btn-success">Ajouter</a> </section>
	</div>
</body>
</html>