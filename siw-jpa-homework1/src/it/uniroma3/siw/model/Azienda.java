package it.uniroma3.siw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Azienda {
	
	//l'idea è quella che nella realtà non ci possano essere due aziende con lo stesso nome 
	//non sono riuscito a trovare un metodo migliore per garantire l'unicità dell'azienda
	@Id
	@Column(unique=true ,nullable=false)
	private String nome;
	
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
