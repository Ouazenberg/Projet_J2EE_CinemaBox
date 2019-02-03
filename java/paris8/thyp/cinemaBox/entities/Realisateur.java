package paris8.thyp.cinemaBox.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Realisateur {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRealisateur;
	private String nomRealisateur;
	private String prenomRealisateur;
	private String nationaliteRealisateur;
	private double anneeNaissaneRealisateur;
	private boolean oscarRealisateur;
	
	
	@OneToMany (mappedBy ="realisateur" )
	private Collection <Film> films;
	
	@OneToMany (mappedBy ="realisateur" )
	private Collection <Documentaire> documentaires;
	
	@OneToMany (mappedBy ="realisateur" )
	private Collection <Serie> series;

	public Realisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Realisateur(String nomRealisateur, String prenomRealisateur, String nationaliteRealisateur,
			double anneeNaissaneRealisateur, boolean oscarRealisateur) {
		super();
		this.nomRealisateur = nomRealisateur;
		this.prenomRealisateur = prenomRealisateur;
		this.nationaliteRealisateur = nationaliteRealisateur;
		this.anneeNaissaneRealisateur = anneeNaissaneRealisateur;
		this.oscarRealisateur = oscarRealisateur;
	}

	public int getIdRealisateur() {
		return idRealisateur;
	}

	public void setIdRealisateur(int idRealisateur) {
		this.idRealisateur = idRealisateur;
	}

	public String getNomRealisateur() {
		return nomRealisateur;
	}

	public void setNomRealisateur(String nomRealisateur) {
		this.nomRealisateur = nomRealisateur;
	}

	public String getPrenomRealisateur() {
		return prenomRealisateur;
	}

	public void setPrenomRealisateur(String prenomRealisateur) {
		this.prenomRealisateur = prenomRealisateur;
	}

	public String getNationaliteRealisateur() {
		return nationaliteRealisateur;
	}

	public void setNationaliteRealisateur(String nationaliteRealisateur) {
		this.nationaliteRealisateur = nationaliteRealisateur;
	}

	public double getAnneeNaissaneRealisateur() {
		return anneeNaissaneRealisateur;
	}

	public void setAnneeNaissaneRealisateur(double anneeNaissaneRealisateur) {
		this.anneeNaissaneRealisateur = anneeNaissaneRealisateur;
	}

	public boolean isOscarRealisateur() {
		return oscarRealisateur;
	}

	public void setOscarRealisateur(boolean oscarRealisateur) {
		this.oscarRealisateur = oscarRealisateur;
	}

	public Collection<Film> getFilms() {
		return films;
	}

	public void setFilms(Collection<Film> films) {
		this.films = films;
	}

	public Collection<Documentaire> getDocumentaires() {
		return documentaires;
	}

	public void setDocumentaires(Collection<Documentaire> documentaires) {
		this.documentaires = documentaires;
	}

	public Collection<Serie> getSeries() {
		return series;
	}

	public void setSeries(Collection<Serie> series) {
		this.series = series;
	}
	
	
	
}