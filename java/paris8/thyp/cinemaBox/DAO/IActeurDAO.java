package paris8.thyp.cinemaBox.DAO;

import java.util.List;

import paris8.thyp.cinemaBox.entities.Acteur;

public interface IActeurDAO {
	
	public List<Acteur> getListActeurs();
	public Acteur getActeurById(int idActeur);
	public void ajouterActeur(Acteur acteur);
	public void modifierActeur(Acteur acteur);
	public void supprimerActeur(int idActeur);

}
