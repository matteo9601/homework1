package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Corso {
	
	//ho reputato necessario creare la variabile id per specificare il corso 
	@Id
	@Column(nullable= false)
	private int id;
	
	@Column(nullable= false)
	private String nome;
	
	@Column(nullable=false)
	private int durataCorso;
	
	@Column(nullable=false)
	private LocalDate dataInizio;
	
	@ManyToMany
	private List<Allievo> allievi;

	@ManyToOne(cascade = {CascadeType.PERSIST})
	private Docente docente;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDurataCorso() {
		return durataCorso;
	}

	public void setDurataCorso(int durataCorso) {
		this.durataCorso = durataCorso;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public List<Allievo> getAllievi() {
		return allievi;
	}

	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	
	
	
}
