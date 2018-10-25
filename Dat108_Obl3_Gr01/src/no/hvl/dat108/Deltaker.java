package no.hvl.dat108;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "dat108_oblig3", name = "deltaker")
public class Deltaker {
	
	
	private String kjonn;
	private String navn;
	private String hashpassord;
	@Id
	@Column(name = "tlfnr")
	private String mobil;
	
	public Deltaker() {
		
	}
	
	public Deltaker(String kjonn, String navn, String hashpassord, String mobil) {
		super();
		this.kjonn = kjonn;
		this.navn = navn;
		this.hashpassord = hashpassord;
		this.mobil = mobil;
	}

	public String getKjonn() {
		return kjonn;
	}

	public void setKjonn(String kjonn) {
		this.kjonn = kjonn;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getHashpassord() {
		return hashpassord;
	}

	public void setHashpassord(String hashpassord) {
		this.hashpassord = hashpassord;
	}

	public String getMobil() {
		return mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}

}
