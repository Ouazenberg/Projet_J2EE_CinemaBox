package paris8.thyp.cinemaBox.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Serie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSerie;
	private int nomSerie;
	private String descriptionSerie;
	private String posterSerie;
	private String bandeAnnonceSerie;
	private double anneeSortieSerie;
	private int nbrSaisonsSerie;
	private int nbrEpisodesSerie;
	
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private Categorie categorie;
	
	@ManyToOne
	@JoinColumn(name="idRealisateur")
	private Realisateur realisateur;
	
	@ManyToOne
	@JoinColumn(name="idChaine")
	private Chaine chaine;
	
	@ManyToOne
	@JoinColumn(name="idActeur")
	private Acteur acteur;


	public Serie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Serie(int nomSerie, String descriptionSerie, String posterSerie, String bandeAnnonceSerie,
			double anneeSortieSerie, int nbrSaisonsSerie, int nbrEpisodesSerie, Categorie categorie,
			Realisateur realisateur, Chaine chaine, Acteur acteur) {
		super();
		this.nomSerie = nomSerie;
		this.descriptionSerie = descriptionSerie;
		this.posterSerie = posterSerie;
		this.bandeAnnonceSerie = bandeAnnonceSerie;
		this.anneeSortieSerie = anneeSortieSerie;
		this.nbrSaisonsSerie = nbrSaisonsSerie;
		this.nbrEpisodesSerie = nbrEpisodesSerie;
		this.categorie = categorie;
		this.realisateur = realisateur;
		this.chaine = chaine;
		this.acteur = acteur;
	}

	public int getIdSerie() {
		return idSerie;
	}

	public void setIdSerie(int idSerie) {
		this.idSerie = idSerie;
	}

	public int getNomSerie() {
		return nomSerie;
	}

	public void setNomSerie(int nomSerie) {
		this.nomSerie = nomSerie;
	}

	public String getDescriptionSerie() {
		return descriptionSerie;
	}

	public void setDescriptionSerie(String descriptionSerie) {
		this.descriptionSerie = descriptionSerie;
	}

	public String getPosterSerie() {
		return posterSerie;
	}

	public void setPosterSerie(String posterSerie) {
		this.posterSerie = posterSerie;
	}

	public String getBandeAnnonceSerie() {
		return bandeAnnonceSerie;
	}

	public void setBandeAnnonceSerie(String bandeAnnonceSerie) {
		this.bandeAnnonceSerie = bandeAnnonceSerie;
	}

	public double getAnneeSortieSerie() {
		return anneeSortieSerie;
	}

	public void setAnneeSortieSerie(double anneeSortieSerie) {
		this.anneeSortieSerie = anneeSortieSerie;
	}

	public int getNbrSaisonsSerie() {
		return nbrSaisonsSerie;
	}

	public void setNbrSaisonsSerie(int nbrSaisonsSerie) {
		this.nbrSaisonsSerie = nbrSaisonsSerie;
	}

	public int getNbrEpisodesSerie() {
		return nbrEpisodesSerie;
	}

	public void setNbrEpisodesSerie(int nbrEpisodesSerie) {
		this.nbrEpisodesSerie = nbrEpisodesSerie;
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

	public Chaine getChaine() {
		return chaine;
	}

	public void setChaine(Chaine chaine) {
		this.chaine = chaine;
	}

	public Acteur getActeur() {
		return acteur;
	}

	public void setActeur(Acteur acteur) {
		this.acteur = acteur;
	}
	
}