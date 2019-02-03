package paris8.thyp.cinemaBox.services;

import java.util.List;

import paris8.thyp.cinemaBox.entities.Chaine;

public interface IChaineService {

	public List<Chaine> getListChaines();
	public Chaine getChaineById(int idChaine);
	public void ajouterChaine(Chaine chaine);
	public void modifierChaine(Chaine chaine);
	public void supprimerChaine(int idChaine);
	
}
