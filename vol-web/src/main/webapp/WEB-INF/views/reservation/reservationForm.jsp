<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<title>Modification de la reservation</title>
<meta charset="UTF-8" />
<base href="/vol-web/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<header class="header">

			<h1>Modification de la reservation</h1>

		</header>

		<section>
			<form action="reservation/save" method="post">
				<input type="hidden" name="id" id="id" value="${maReservation.id}" /> <input
					type="hidden" name="version" id="version"
					value="${maReservation.version}" />

				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Code</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="code" id="code"
							placeholder="code" required value="${maReservation.code}" />
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Date de reservation</label>
					<div class="col-sm-10">
						<input type="date" step="1" class="form-control"
							name="dtResa" id="dtResa"
							placeholder="date de reservation"
							value="${maReservation.dtResa}" />
					</div>
				</div>

				
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Vol</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="vol"
							placeholder="vol"
							value="${maReservation.vol.id}" />
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Client</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="client"
							placeholder="client" value="${maReservation.client.nom}"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Passager</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="prenom" id="prenom"
							placeholder="Le prénom" required value="${maReservation.passager.nom}" />
					</div>
				</div>
				
								
				<div class="form-group row">
					<div class="col-sm-2"></div>
					<div class="col-sm-7">
						<button type="submit" class="btn btn-primary col-sm-12">Envoyer</button>
					</div>
					<div class="col-sm-3">
						<a href="reservation/list" class="btn btn-warning col-sm-12">Annuler</a>
					</div>
				</div>
			</form>
		</section>
	</div>
	

</body>
</html>