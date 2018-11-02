"use strict";

let inputLast = document.getElementById("lastName").value;
let inputPhone = document.getElementById("phone").value;
let inputPass = document.getElementById("pass").value;
let inputPassConf = document.getElementById("passConf").value;
let inputMann = document.getElementById("mann").value;
let inputKvinne = document.getElementById("kvinne").value;

let fornavn = document.getElementById("fornavn");
let etternavn = document.getElementById("etternavn");
let mobil = document.getElementById("mobil");
let passord = document.getElementById("passord");
let passord2 = document.getElementById("passord2");
let kjonn = document.getElementById("kjonn");

//validasjon();
testFornavn();
testEtternavn();
testTelefon();
testPassord();
testPassordConfirmation();
testKjonn();

/* Validering fornavn */
function testFornavn() {
	var inputFornavn = document.getElementById("firstName").value;
	if (inputFornavn[0] !== inputFornavn[0].toUpperCase()) {
		fornavnRed();
		fornavnFeilmelding();
	} else {
		fornavnGreen();
		fornavnGodkjent();
	}
}

function fornavnRed() {
	document.getElementById("firstName").style.color = "red";
}

function fornavnGreen() {
	document.getElementById("firstName").style.color = "green";
}

function fornavnFeilmelding() {
	document.getElementById("fornavn").style.color = "red";
	document.getElementById("fornavn").innerHTML = "Fornavn maa begynne med stor bokstav!";
}

function fornavnGodkjent() {
	document.getElementById("fornavn").style.color = "green";
	document.getElementById("fornavn").innerHTML = "Herlig, fortsett med dette!";
}

/* Validering etternavn */
function testEtternavn() {
	var inputEtternavn = document.getElementById("lastName").value;
	if (inputEtternavn[0] !== inputEtternavn[0].toUpperCase()) {
		etternavnRed();
		etternavnFeilmelding();
	} else {
		etternavnGreen();
		etternavnGodkjent();
	}
}

function etternavnRed() {
	document.getElementById("lastName").style.color = "red";
}

function etternavnGreen() {
	document.getElementById("lastName").style.color = "green";
}

function etternavnFeilmelding() {
	document.getElementById("etternavn").style.color = "red";
	document.getElementById("etternavn").innerHTML = "Fornavn maa begynne med stor bokstav!";
}

function etternavnGodkjent() {
	document.getElementById("etternavn").style.color = "green";
	document.getElementById("etternavn").innerHTML = "Herlig, fortsett med dette!";
}

/* Validering telefon */
function testTelefon() {
	var inputTelefon = document.getElementById("phone").value;
	if (inputTelefon !== f[0].toUpperCase()) {
		document.getElementById("firstName").style.color = "red";
		skrivFeilmelding();
	} else {
		changeColorGreen();
		skrivOk();
	}
}

function telefonRed() {
	document.getElementById("lastName").style.color = "red";
}

function telefonGreen() {
	document.getElementById("lastName").style.color = "green";
}

function telefonFeilmelding() {
	document.getElementById("etternavn").style.color = "red";
	document.getElementById("etternavn").innerHTML = "Fornavn maa begynne med stor bokstav!";
}

function telefonGodkjent() {
	document.getElementById("etternavn").style.color = "green";
	document.getElementById("etternavn").innerHTML = "Herlig, fortsett med dette!";
}

/* Validering passord */
function testPassord() {
	var f = document.getElementById("firstName").value;
	if (f[0] !== f[0].toUpperCase()) {
		changeColorRed();
		skrivFeilmelding();
	} else {
		changeColorGreen();
		skrivOk();
	}
}

/* Validering passord2 */
function testPassordConfirmation() {
	var f = document.getElementById("firstName").value;
	if (f[0] !== f[0].toUpperCase()) {
		changeColorRed();
		skrivFeilmelding();
	} else {
		changeColorGreen();
		skrivOk();
	}
}

/* Validering av kjonn */
function testKjonn() {
	var f = document.getElementById("firstName").value;
	if (f[0] !== f[0].toUpperCase()) {
		changeColorRed();
		skrivFeilmelding();
	} else {
		changeColorGreen();
		skrivOk();
	}
}






/* GAMMEL KODE */
/*
function validasjon() {
	if((inputFirst !== "") && (inputFirst[0] !== inputFirst[0].toUpperCase())) {
		fornavn.innerHTML = "Fornavn maa begynne med stor bokstav!";
	}
	if((inputLast !== "") && (inputLast[0] !== inputLast[0].toUpperCase())) {
		etternavn.innerHTML = "Etternavn maa begynne med stor bokstav!";
	}
	if((inputPhone !== "")) {
		mobil.innerHTML = "Maa vaere et gyldig telefonnummer!";
	}
	if((inputPass !== "")) {
		passord.innerHTML = "Passord maa vaere lengre enn 4 bokstaver!";
	}
	if((inputPassConf !== "")) {
		passord2.innerHTML = "Maa vaere to like passord!";
	}
	if((inputMann !== "") && (inputKvinne !== "")) {
		kjonn.innerHTML = "Vennligst velg et kjonn!";
	}
}
*/