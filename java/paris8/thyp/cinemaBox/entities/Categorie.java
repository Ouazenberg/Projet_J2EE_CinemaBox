package paris8.thyp.cinemaBox.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCategorie;
	private String nomCategorie;
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy="categorie")
	private Collection<Film> films;
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy="categorie")
	private Collection<Serie> series;
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy="categorie")
	private Collection<Documentaire> documentaires;

	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Categorie(String nomCategorie) {
		super();
		this.nomCategorie = nomCategorie;
		}


	public int getIdCategorie() {
		return idCategorie;
	}


	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}


	public String getNomCategorie() {
		return nomCategorie;
	}


	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}


	public Collection<Film> getFilms() {
		return films;
	}


	public void setFilms(Collection<Film> films) {
		this.films = films;
	}


	public Collection<Serie> getSeries() {
		return series;
	}


	public void setSeries(Collection<Serie> series) {
		this.series = series;
	}


	public Collection<Documentaire> getDocumentaires() {
		return documentaires;
	}


	public void setDocumentaires(Collection<Documentaire> documentaires) {
		this.documentaires = documentaires;
	}
	
}