package it.uniroma3.siw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Azienda {
	
	@Id
	@Column(nullable=false)
	private String ragioneSociale;
	
	@Column(nullable =false)
	private String Via;
	
	@Column
	private int civico;
	
	@Column(nullable = false)
	private String comune;
	
	@Column(nullable =false)
	private int cap;
	
	@Column(nullable = false)
	private String provincia;
	
	@Column(nullable =false)
	private int numeroTelefono;

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getVia() {
		return Via;
	}

	public void setVia(String via) {
		Via = via;
	}

	public int getCivico() {
		return civico;
	}

	public void setCivico(int civico) {
		this.civico = civico;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	
	

}
