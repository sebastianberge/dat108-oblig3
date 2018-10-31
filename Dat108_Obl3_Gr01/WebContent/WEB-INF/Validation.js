function validateName() {
	var txt = "";
	if (document.getElementById("firstName").validity.rangeOverflow) {
		txt = "Prøv igjen";
	} else {
		txt = "Validated!";
	}
	document.getElementById("demo").innerHTML = txt;
}