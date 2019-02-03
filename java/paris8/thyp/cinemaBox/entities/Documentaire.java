package paris8.thyp.cinemaBox.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Documentaire {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDocumentaire;
	private int nomDocumentaire;
	private String descriptionDocumentaire;
	private String posterDocumentaire;
	private String bandeAnnonceDocumentaire;
	private double anneeSortieDocumentaire;
	
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private Categorie categorie;
	
	@ManyToOne
	@JoinColumn(name="idRealisateur")
	private Realisateur realisateur;

	
	public Documentaire() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Documentaire(int nomDocumentaire, String descriptionDocumentaire, String posterDocumentaire,
			String bandeAnnonceDocumentaire, double anneeSortieDocumentaire, Categorie categorie,
			Realisateur realisateur) {
		super();
		this.nomDocumentaire = nomDocumentaire;
		this.descriptionDocumentaire = descriptionDocumentaire;
		this.posterDocumentaire = posterDocumentaire;
		this.bandeAnnonceDocumentaire = bandeAnnonceDocumentaire;
		this.anneeSortieDocumentaire = anneeSortieDocumentaire;
		this.categorie = categorie;
		this.realisateur = realisateur;
	}


	public int getIdDocumentaire() {
		return idDocumentaire;
	}


	public void setIdDocumentaire(int idDocumentaire) {
		this.idDocumentaire = idDocumentaire;
	}


	public int getNomDocumentaire() {
		return nomDocumentaire;
	}


	public void setNomDocumentaire(int nomDocumentaire) {
		this.nomDocumentaire = nomDocumentaire;
	}


	public String getDescriptionDocumentaire() {
		return descriptionDocumentaire;
	}


	public void setDescriptionDocumentaire(String descriptionDocumentaire) {
		this.descriptionDocumentaire = descriptionDocumentaire;
	}


	public String getPosterDocumentaire() {
		return posterDocumentaire;
	}


	public void setPosterDocumentaire(String posterDocumentaire) {
		this.posterDocumentaire = posterDocumentaire;
	}


	public String getBandeAnnonceDocumentaire() {
		return bandeAnnonceDocumentaire;
	}


	public void setBandeAnnonceDocumentaire(String bandeAnnonceDocumentaire) {
		this.bandeAnnonceDocumentaire = bandeAnnonceDocumentaire;
	}


	public double getAnneeSortieDocumentaire() {
		return anneeSortieDocumentaire;
	}


	public void setAnneeSortieDocumentaire(double anneeSortieDocumentaire) {
		this.anneeSortieDocumentaire = anneeSortieDocumentaire;
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
	
	

}