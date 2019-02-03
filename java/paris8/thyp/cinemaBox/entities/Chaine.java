package paris8.thyp.cinemaBox.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Chaine {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idChaine;
	private String nomChaine;
	
	@OneToMany (mappedBy ="chaine" )
	private Collection <Serie> series;
	
	@OneToMany ( mappedBy ="realisateur" )
	private Collection <Documentaire> documentaires;

	public Chaine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chaine(String nomChaine, Collection<Serie> series, Collection<Documentaire> documentaires) {
		super();
		this.nomChaine = nomChaine;
		this.series = series;
		this.documentaires = documentaires;
	}

	public int getIdChaine() {
		return idChaine;
	}

	public void setIdChaine(int idChaine) {
		this.idChaine = idChaine;
	}

	public String getNomChaine() {
		return nomChaine;
	}

	public void setNomChaine(String nomChaine) {
		this.nomChaine = nomChaine;
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