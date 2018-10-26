package no.hvl.dat108;

import javax.servlet.http.HttpServletRequest;

public class Validering {
	
	private String fornavn;
	private String fornavnFeil;
	private String etternavn;
	private String etternavnFeil;
	private String mobil;
	private String mobilFeil;
	private String passord;
	private String passordFeil;
	private String passord2;
	private String passord2Feil;
	private String kjonn;
	private String kjonnFeil;

	public Validering(HttpServletRequest request) {
		this.fornavn = request.getParameter("fornavn");
		this.etternavn = request.getParameter("etternavn");
		this.mobil = request.getParameter("mobil");
		this.passord = request.getParameter("passord");
		this.passord2 = request.getParameter("passordRepetert");
		this.kjonn = request.getParameter("kjonn");
	}
	
	public boolean isAllInputGyldig() {
		return isFornavnGyldig() && 
				isEtternavnGylig() && 
				isMobilGyldig() && 
				isPassordGyldig() &&
				isPassord2Gyldig() &&
				isKjonnGyldig();
	}

	public boolean isKjonnGyldig() {
		if(kjonn == null) {
			kjonnFeil = "Er du usikker?";
		}
		return kjonn != null;
	}

	public boolean isPassord2Gyldig() {
		if (passord2.equals(passord)) {
			return true;
		} else {
			passord2Feil = "Samsvarer ikke med forste passord.";
			return false;
		}
	}

	public boolean isPassordGyldig() {
		if (passord.isEmpty()) {
			passordFeil = "Try again sir";
			return false;
		} else {
			return true;
		}
	}

	public boolean isMobilGyldig() {
		if (mobil != null && mobil.matches("^\\d{8}$")) {
			return true;
		} else {
			mobilFeil = "Mobilnummer ikke riktig";
			return false;
		}
	}

	public boolean isEtternavnGylig() {
		if(etternavn.isEmpty()) {
			etternavnFeil = "Ikke gyldig";
			return false;
		} else {
			return true;
		}
	}

	public boolean isFornavnGyldig() {
		if(fornavn.isEmpty()) {
			fornavnFeil = "Ikke gyldig";
			return false;
		} else {
			return true;
		}
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getFornavnFeil() {
		return fornavnFeil;
	}

	public void setFornavnFeil(String fornavnFeil) {
		this.fornavnFeil = fornavnFeil;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getEtternavnFeil() {
		return etternavnFeil;
	}

	public void setEtternavnFeil(String etternavnFeil) {
		this.etternavnFeil = etternavnFeil;
	}

	public String getMobil() {
		return mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}

	public String getMobilFeil() {
		return mobilFeil;
	}

	public void setMobilFeil(String mobilFeil) {
		this.mobilFeil = mobilFeil;
	}

	public String getPassord() {
		return passord;
	}

	public void setPassord(String passord) {
		this.passord = passord;
	}

	public String getPassordFeil() {
		return passordFeil;
	}

	public void setPassordFeil(String passordFeil) {
		this.passordFeil = passordFeil;
	}

	public String getPassord2() {
		return passord2;
	}

	public void setPassord2(String passord2) {
		this.passord2 = passord2;
	}

	public String getPassord2Feil() {
		return passord2Feil;
	}

	public void setPassord2Feil(String passord2Feil) {
		this.passord2Feil = passord2Feil;
	}

	public String getKjonn() {
		return kjonn;
	}

	public void setKjonn(String kjonn) {
		this.kjonn = kjonn;
	}
	
	public String getKjonnFeil() {
		return kjonnFeil;
	}

	public void setKjonnFeil(String kjonnFeil) {
		this.kjonnFeil = kjonnFeil;
	}

}
