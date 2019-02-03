package paris8.thyp.cinemaBox.services;

import java.util.List;

import paris8.thyp.cinemaBox.entities.Utilisateur;

public interface IUtilisateurService {

	public List<Utilisateur> getListUtilisateurs();
	public Utilisateur getUtilisateurById(int idUtilisateur);
	public void ajouterUtilisateur(Utilisateur utilisateur);
	public void modifierUtilisateur(Utilisateur utilisateur);
	public void supprimerUtilisateur(int idUtilisateur);
	public Utilisateur LoginUtilisateur(String email,String pwd);
	public String recommandation (Utilisateur user);
	
}
