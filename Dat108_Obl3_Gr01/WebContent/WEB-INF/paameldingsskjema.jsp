<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/index.css">
<meta charset="ISO-8859-1">
<!-- Fra https://purecss.io/ -->
<link rel="stylesheet"
	href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">
<title>Paamelding</title>
</head>
<body>
	<h2>Paamelding</h2>
	<form method="post" class="pure-form pure-form-aligned">
		<fieldset>
			<div class="pure-control-group">
				<label for="fornavn">Fornavn:</label> <input id="firstName" type="text"
					name="fornavn" value="${validering.fornavn}" />
					<label id="fornavn"><font color="red"></font></label> 
			</div>
			<div class="pure-control-group">
				<label for="etternavn">Etternavn:</label> <input id="lastName" type="text"
					name="etternavn" value="${validering.etternavn}" /> 
					<label id="etternavn"><font color="red"></font></label> 
			</div>
			<div class="pure-control-group">
				<label for="mobil">Mobil (8 siffer):</label> <input id="phone" type="text"
					name="mobil" value="${validering.mobil}" /> 
					<label id="mobil"><font color="red"></font></label> 
			</div>
			<div class="pure-control-group">
				<label for="password">Passord:</label> <input id="pass" type="password"
					name="passord" value="${validering.passord}" /> 
					<label id="passord"><font color="red"></font></label> 
			</div>
			<div class="pure-control-group">
				<label for="passordRepetert">Passord repetert:</label> <input id="passConf"
					type="password" name="passordRepetert"
					value="${validering.passord2}" /> 
					<label id="passord2"><font color="red"></font></label> 
			</div>
			<div class="pure-control-group">
				<label for="kjonn">Kjonn:</label> <input type="radio" name="kjonn"
					value="mann" id="mann"
					 />mann
				<input type="radio" name="kjonn" value="kvinne" id="kvinne"
					 />kvinne
				<label id="kjonn"><font color="red"></font></label> 
			</div>
			<div class="pure-controls">
				<button type="submit" class="pure-button pure-button-primary" name="Meldpaa">Meld
					meg paa</button>
			</div>
		</fieldset>
	</form>
		<form action="LoggInnServlet" class="pure-form pure-form-aligned">
			<div class="pure-controls">
		    	<button type="submit" class="pure-button pure-button-primary">Logg inn</button>
		    </div>
		</form>	
	<script src="js/validation.js"></script>
</body>
</html>