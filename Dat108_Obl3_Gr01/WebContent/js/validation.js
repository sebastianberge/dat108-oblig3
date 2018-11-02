"use strict";

let inputFirst = document.getElementById("firstName").value;
let inputLast = document.getElementById("lastName").value;
let inputPhone = document.getElementById("phone").value;
let inputPass = document.getElementById("pass").value;
let inputPassConf = document.getElementById("passConf").value;
let inputMann = document.getElementById("mann").value;
let inputKvinne = document.getElementById("kvinne").value;

let fornavn = document.getElementById("fornavn");
let eternavn = document.getElementById("etternavn");
let mobil = document.getElementById("mobil");
let passord = document.getElementById("passord");
let passord2 = document.getElementById("passord2");
let kjonn = document.getElementById("kjonn");

validasjon();

function validasjon() {
	if((inputFirst !== "") && (inputFirst[0] !== inputFirst[0].toUpperCase())) {
		fornavn.innerHTML = "Stor forbokstav!";
	}
	if((inputLast !== "") && (inputLast[0] !== inputLast[0].toUpperCase())) {
		etternavn.innerHTML = "Stor forbokstav!";
	}
	if((inputPhone !== "") && (inputPhone.length !== 8)) {
		mobil.innerHTML = "Skriv 8 siffer!";
	}
	if((inputPass !== "") && (inputPass.length < 5)) {
		passord.innerHTML = "Mer enn 4 bokstaver!";
	}
	if((inputPassConf !== "") (inputPassConf !== inputPass)) {
		passord2.innerHTML = "Ikke like passord!";
	}
	if((inputMann !== "") && (inputKvinne !== "")) {
		kjonn.innerHTML = "Usikker?";
	}
}