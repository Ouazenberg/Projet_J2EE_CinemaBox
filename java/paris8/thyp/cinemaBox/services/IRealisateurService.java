package paris8.thyp.cinemaBox.services;

import java.util.List;

import paris8.thyp.cinemaBox.entities.Realisateur;

public interface IRealisateurService {

	public List<Realisateur> getListRealisateurs();
	public Realisateur getRealisateurById(int idRealisateur);
	public void ajouterRealisateur(Realisateur realisateur);
	public void modifierRealisateur(Realisateur realisateur);
	public void supprimerRealisateur(int idRealisateur);
	
}
