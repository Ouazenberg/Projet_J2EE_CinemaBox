package paris8.thyp.cinemaBox.DAO;

import java.util.List;

import paris8.thyp.cinemaBox.entities.Documentaire;

public interface IDocumentaireDAO {

	public List<Documentaire> getListDocumentaires();
	public Documentaire getDocumentaireById(int idDocumentaire);
	public void ajouterDocumentaire(Documentaire documentaire);
	public void modifierDocumentaire(Documentaire documentaire);
	public void supprimerDocumentaire(int idDocumentaire);
	
}
