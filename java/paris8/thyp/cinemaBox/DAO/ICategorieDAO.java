package paris8.thyp.cinemaBox.DAO;

import java.util.List;

import paris8.thyp.cinemaBox.entities.Categorie;

public interface ICategorieDAO {

	public List<Categorie> getListCategories();
	public Categorie getCategorieById(int idCategorie);
	public void ajouterCategorie(Categorie categorie);
	public void modifierCategorie(Categorie categorie);
	public void supprimerCategorie(int idCategorie);
	
}
