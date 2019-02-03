package paris8.thyp.cinemaBox.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Acteur {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idActeur;
	private String nomActeur;
	private String prenomActeur;
	private String nationaliteActeur;
	private double anneeNaissaneActeur;
	private boolean oscarActeur;
	
	@OneToMany (mappedBy ="acteur" )
	private Collection <Film> films;
	
	@OneToMany (mappedBy ="acteur" )
	private Collection <Serie> series;
	

	public Acteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Acteur(String nomActeur, String prenomActeur, String nationaliteActeur, double anneeNaissaneActeur,
			boolean oscarActeur) {
		super();
		this.nomActeur = nomActeur;
		this.prenomActeur = prenomActeur;
		this.nationaliteActeur = nationaliteActeur;
		this.anneeNaissaneActeur = anneeNaissaneActeur;
		this.oscarActeur = oscarActeur;
	}

	public int getIdActeur() {
		return idActeur;
	}

	public void setIdActeur(int idActeur) {
		this.idActeur = idActeur;
	}

	public String getNomActeur() {
		return nomActeur;
	}

	public void setNomActeur(String nomActeur) {
		this.nomActeur = nomActeur;
	}

	public String getPrenomActeur() {
		return prenomActeur;
	}

	public void setPrenomActeur(String prenomActeur) {
		this.prenomActeur = prenomActeur;
	}

	public String getNationaliteActeur() {
		return nationaliteActeur;
	}

	public void setNationaliteActeur(String nationaliteActeur) {
		this.nationaliteActeur = nationaliteActeur;
	}

	public double getAnneeNaissaneActeur() {
		return anneeNaissaneActeur;
	}

	public void setAnneeNaissaneActeur(double anneeNaissaneActeur) {
		this.anneeNaissaneActeur = anneeNaissaneActeur;
	}

	public boolean isOscarActeur() {
		return oscarActeur;
	}

	public void setOscarActeur(boolean oscarActeur) {
		this.oscarActeur = oscarActeur;
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
	
	
	
}