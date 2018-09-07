<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="sopra.promo404.vol.model.Ville"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Edition / ajout de villes et aéroport</title>
<meta charset="UTF-8" />
<base href="/vol-web/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<header class="header">

		<h1>Edition / ajout de villes et aéroport</h1>

		</header>

		<section>
		<form action="aeroville/save" method="post">
			<input type="hidden" name="action" value="save" /> 
			<input type="hidden" name="id" id="id" value="${monAeroville.id}" /> 
			<input type="hidden" name="version" id="version" value="${monAeroville.version}" />
			
			<div class="form-group row">
					<label class="col-sm-2 col-form-label">Aéroport</label>
					<div class="col-sm-10">
						<select class="custom-select" name="formateur.id" required>
							<option value=""></option>
							<c:forEach items="${aeroports}" var="aero">
								<option value="${aero.id}" ${monAeroville.aeroport.id eq aero.id?'selected':''}>${aero.code}</option>
							</c:forEach>
						</select>
					</div>
				</div>
			
			<div class="form-group row">
					<label class="col-sm-2 col-form-label">Ville</label>
					<div class="col-sm-10">
						<select class="custom-select" name="formateur.id" required>
							<option value=""></option>
							<c:forEach items="${villes}" var="vill">
								<option value="${vill.id}" ${monAeroville.ville.id eq vill.id?'selected':''}>${vill.nom} ${vill.pays}</option>
							</c:forEach>
						</select>
					</div>
				</div>


			<div class="form-group row">
				<div class="col-sm-2"></div>
				<div class="col-sm-7">
					<button type="submit" class="btn btn-primary col-sm-12">Envoyer</button>
				</div>
				<div class="col-sm-3">
					<a href="aeroville/list" class="btn btn-warning col-sm-12">Annuler</a>
				</div>
			</div>
		</form>
		</section>
	</div>

</body>
</html>