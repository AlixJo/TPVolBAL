<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="sopra.promo404.vol.model.Ville"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Edition / ajout de villes</title>
<meta charset="UTF-8" />
<base href="/vol-web/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<header class="header">

		<h1>Edition / ajout de villes</h1>

		</header>

		<section>
		<form action="ville" method="post">
			<input type="hidden" name="action" value="save" /> 
			<input type="hidden" name="id" id="id" value="${maVille.id}" /> 
			<input type="hidden" name="version" id="version" value="${maVille.version}" />
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">Nom</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="nom" id="nom"
						placeholder="Le nom" required value="${maVille.nom}" />
				</div>
			</div>


			<div class="form-group row">
				<label class="col-sm-2 col-form-label">codePostal</label>
				<div class="col-sm-10">
					<input type="text" step="1" class="form-control" name="codePostal"
						id="codePostal" placeholder="Le code postal" required
						value="${maVille.codePostal}" />
				</div>
			</div>

			<div class="form-group row">
				<label class="col-sm-2 col-form-label">pays</label>
				<div class="col-sm-10">
					<input type="text" step="1" class="form-control" name="pays"
						id="pays" placeholder="Le pays" required
						value="${maVille.pays}" />
				</div>
			</div>

			<div class="form-group row">
				<div class="col-sm-2"></div>
				<div class="col-sm-7">
					<button type="submit" class="btn btn-primary col-sm-12">Envoyer</button>
				</div>
				<div class="col-sm-3">
					<a href="ville/list" class="btn btn-warning col-sm-12">Annuler</a>
				</div>
			</div>
		</form>
		</section>
	</div>

</body>
</html>