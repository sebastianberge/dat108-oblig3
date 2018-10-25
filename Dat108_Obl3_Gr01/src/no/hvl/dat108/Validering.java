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
	private String kj�nn;
	private String kj�nnFeil;
	
	public String getKj�nnFeil() {
		return kj�nnFeil;
	}

	public void setKj�nnFeil(String kj�nnFeil) {
		this.kj�nnFeil = kj�nnFeil;
	}

	public Validering(HttpServletRequest request) {
		this.fornavn = request.getParameter("fornavn");
		this.etternavn = request.getParameter("etternavn");
		this.mobil = request.getParameter("mobil");
		this.passord = request.getParameter("passord");
		this.passord2 = request.getParameter("passordRepetert");
		this.kj�nn = request.getParameter("kjonn");
	}
	
	public boolean isAllInputGyldig() {
		return isFornavnGyldig() && 
				isEtternavnGylig() && 
				isMobilGyldig() && 
				isPassordGyldig() &&
				isPassord2Gyldig() &&
				isKj�nnGyldig();
	}

	private boolean isKj�nnGyldig() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isPassord2Gyldig() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isPassordGyldig() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isMobilGyldig() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isEtternavnGylig() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isFornavnGyldig() {
		// TODO Auto-generated method stub
		return false;
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

	public String getKj�nn() {
		return kj�nn;
	}

	public void setKj�nn(String kj�nn) {
		this.kj�nn = kj�nn;
	}

}
