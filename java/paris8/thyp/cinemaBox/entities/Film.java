package paris8.thyp.cinemaBox.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Film {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idFilm;
	private String nomFilm;
	private String descriptionFilm;
	private String posterFilm;
	private String posterFilmLarge;
	private String bandeAnnonceFilm;
	private double anneeSortieFilm;
	
	
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private Categorie categorie;

	@ManyToOne
	@JoinColumn(name="idRealisateur")
	private Realisateur realisateur;

	@ManyToOne
	@JoinColumn(name="idActeur")
	private Acteur acteur;
	
	
	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Film(String nomFilm, String descriptionFilm, String posterFilm, String posterFilmLarge,
			String bandeAnnonceFilm, double anneeSortieFilm, Categorie categorie, Realisateur realisateur,
			Acteur acteur) {
		super();
		this.nomFilm = nomFilm;
		this.descriptionFilm = descriptionFilm;
		this.posterFilm = posterFilm;
		this.posterFilmLarge = posterFilmLarge;
		this.bandeAnnonceFilm = bandeAnnonceFilm;
		this.anneeSortieFilm = anneeSortieFilm;
		this.categorie = categorie;
		this.realisateur = realisateur;
		this.acteur = acteur;
	}



	public String getPosterFilmLarge() {
		return posterFilmLarge;
	}


	public void setPosterFilmLarge(String posterFilmLarge) {
		this.posterFilmLarge = posterFilmLarge;
	}


	public int getIdFilm() {
		return idFilm;
	}

	public void setIdFilm(int idFilm) {
		this.idFilm = idFilm;
	}

	public String getNomFilm() {
		return nomFilm;
	}

	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}

	public String getDescriptionFilm() {
		return descriptionFilm;
	}

	public void setDescriptionFilm(String descriptionFilm) {
		this.descriptionFilm = descriptionFilm;
	}

	public String getPosterFilm() {
		return posterFilm;
	}

	public void setPosterFilm(String posterFilm) {
		this.posterFilm = posterFilm;
	}

	public String getBandeAnnonceFilm() {
		return bandeAnnonceFilm;
	}

	public void setBandeAnnonceFilm(String bandeAnnonceFilm) {
		this.bandeAnnonceFilm = bandeAnnonceFilm;
	}

	public double getAnneeSortieFilm() {
		return anneeSortieFilm;
	}

	public void setAnneeSortieFilm(double anneeSortieFilm) {
		this.anneeSortieFilm = anneeSortieFilm;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Realisateur getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Realisateur realisateur) {
		this.realisateur = realisateur;
	}

	public Acteur getActeur() {
		return acteur;
	}

	public void setActeur(Acteur acteur) {
		this.acteur = acteur;
	}
		

}