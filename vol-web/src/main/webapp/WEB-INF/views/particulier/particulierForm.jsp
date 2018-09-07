<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Edition de Particulier</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=devide-width, initial-scale=1" />
		<base href="/vol-web/" />
		<link rel="stylesheet"
			href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	</head>
	<body>
		<div class="container">
			<header class="header">
	
				<h1>Edition de Particulier</h1>
	
			</header>
			<section>
				<form action="particulier/save" method="post">
					<input type="hidden" name="id" id="id" value="${monParticulier.id}" /> <input
						type="hidden" name="version" id="version"
						value="${monParticulier.version}" />
	
					<div class="form-group row">
						<label class="col-sm-2 col-form-label">Civilité</label>
						<div class="col-sm-10">
							<select class="custom-select" name="civilite" id="civilite">
								<option value=""></option>
								<c:forEach items="${civilites}" var="civ">
									<option value="${civ}" ${monParticulier.civilite eq civ?'selected':''}>${civ.label}</option>
								</c:forEach>
							</select>
						</div>
					</div>
	
					<div class="form-group row">
						<label class="col-sm-2 col-form-label">Nom</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="nom" id="nom"
								placeholder="Nom" required value="${monParticulier.nom}" />
						</div>
					</div>
	
					<div class="form-group row">
						<label class="col-sm-2 col-form-label">Prénom</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="prenom" id="prenom" placeholder="Prénom" 
							required value="${monParticulier.prenom}" />
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-2 col-form-label" for="email">Adresse mail</label>
						<div class="col-sm-10">
	     					<input type="email" class="form-control" name="email" id="email" placeholder="Adresse mail" 
	     					required value="${monParticulier.email}">
	   					</div>
	   				</div>
	   				<div class="form-group row">
						<label class="col-sm-2 col-form-label">Numéro de Téléphone</label>
						<div class="col-sm-10">
	     					<input type="text" class="form-control" name="numeroTel" id="numeroTel" placeholder="Numéro de téléphone" 
	     					required value="${monParticulier.numeroTel}">
	   					</div>
	   				</div>
					<div class="form-group row">
						<label class="col-sm-2 col-form-label">Rue</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="adresse.rue"
								placeholder="N° et Rue" value="${monParticulier.adresse.rue}" />
						</div>
					</div>
	
					<div class="form-group row">
						<label class="col-sm-2 col-form-label">Code postal</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="adresse.codePostal"
								placeholder="Code Postal"
								value="${monParticulier.adresse.codePostal}" />
						</div>
					</div>
	
					<div class="form-group row">
						<label class="col-sm-2 col-form-label">Ville</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="adresse.ville"
								placeholder="Ville" value="${monParticulier.adresse.ville}" />
						</div>
					</div>
	
					<div class="form-group row">
						<label class="col-sm-2 col-form-label">Pays</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="adresse.pays"
								placeholder="Pays" value="${monParticulier.adresse.pays}" />
						</div>
					</div>
					<div class="form-group row">
						<div class="col-sm-2"></div>
						<div class="col-sm-7">
							<button type="submit" class="btn btn-primary col-sm-12">Envoyer</button>
						</div>
						<div class="col-sm-3">
							<a href="particulier/list" class="btn btn-warning col-sm-12">Annuler</a>
						</div>
					</div>
				</form>
			</section>
		</div>
	</body>
</html>