package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Allievo {
	

	@Column(nullable=false)
	private String cognome;
	
	@Column(nullable = false)
	private String nome;
	
	@Id 
	@Column(nullable = false)
	private int matricola;
	
	@Column(nullable = false)
	private LocalDate dataNascita;

	@Column(nullable = false)
	private String LuogoNascita;
	
	@Column(nullable = false)
	private String postaElettronica;
	
	@ManyToMany(mappedBy="allievi")
	private List<Corso> corsi;
	
	@ManyToOne
	private Azienda azienda;
	
	
	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return LuogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		LuogoNascita = luogoNascita;
	}

	public String getPostaElettronica() {
		return postaElettronica;
	}

	public void setPostaElettronica(String postaElettronica) {
		this.postaElettronica = postaElettronica;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}

	public Azienda getAzienda() {
		return azienda;
	}

	public void setAzienda(Azienda azienda) {
		this.azienda = azienda;
	}


}
