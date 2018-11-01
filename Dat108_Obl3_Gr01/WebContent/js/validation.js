"use strict";

let inputFirst = document.getElementById("firstName");
let inputLast = document.getElementById("lastName");
let inputPhone = document.getElementById("phone");
let inputPass = document.getElementById("pass");
let inputPassConf = document.getElementById("passConf");
let inputMann = document.getElementById("mann");
let inputKvinne = document.getElementById("kvinne");

let fornavn = document.getElementById("fornavn");
let eternavn = document.getElementById("etternavn");
let mobil = document.getElementById("mobil");
let passord = document.getElementById("passord");
let passord2 = document.getElementById("passord2");
let kjonn = document.getElementById("kjonn");

validasjon();

function validasjon() {
	fornavn.innerHTML = "Fornavn maa begynne med stor bokstav!";
	etternavn.innerHTML = "Etternavn maa begynne med stor bokstav!";
	mobil.innerHTML = "Maa vaere et gyldig telefonnummer!";
	passord.innerHTML = "Passord maa vaere lengre enn 4 bokstaver!";
	fornavn2.innerHTML = "Maa vaere to like passord!";
	kjonn.innerHTML = "Vennligst velg et kjonn!";
}