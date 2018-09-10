<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reservation</title>
<base href="/vol-web/" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

	<div class="container-fluid">

		<header class="header">

		<h1>Mes reservations</h1>

		</header>

		<section>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Identifiant</th>
					<th>Version</th>
					<th>Code</th>
					<th>Date de reservation</th>
					<th>Confirmation</th>
					<th>Annulation</th>
					<th>Passager</th>
					<th>Vol</th>
					<th>Client</th>
					<th></th>
				</tr>
			</thead>

			<tbody>

				<c:forEach items="${reservations}" var="resa">
					<tr>
						<td>${resa.id}</td>
						<td>${resa.version}</td>
						<td>${resa.code}</td>
						<td><fmt:formatDate value="${resa.dtResa}"
								pattern="dd/MM/yyyy" />
						<td>${resa.confirmee}</td>
						<td>${resa.annulee}</td>
						<td>${resa.passager.nom}</td>
						<td>${resa.vol.id}</td>
						<td>${resa.client.nom}</td>
						<td><a href="reservation/edit/${resa.id}"
							class="btn btn-info btn-sm">Editer</a> <a
							href="reservation/delete/${resa.id}"
							class="btn btn-danger btn-sm">Supprimer</a></td>
					</tr>

				</c:forEach>





			</tbody>
		</table>
		<a href="reservation/add" class="btn btn-success">Ajouter</a> </section>
	</div>
</body>
</html>