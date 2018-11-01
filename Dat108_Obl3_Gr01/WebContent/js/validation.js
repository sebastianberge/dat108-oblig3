var inputFirst = document.getElementById("firstName");
var inputLast = document.getElementById("lastName");
var inputPhone = document.getElementById("phone");
var inputPass = document.getElementById("pass");
var inputPassConf = document.getElementById("passConf");

validerNavn();

function validerNavn() {
	if (inputFirst !== null) {
		document.getElementById("test").innerHtml = "Feil";
	}
}