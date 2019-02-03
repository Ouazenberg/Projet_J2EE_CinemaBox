package paris8.thyp.cinemaBox.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paris8.thyp.cinemaBox.DAO.IUtilisateurDAO;
import paris8.thyp.cinemaBox.entities.Utilisateur;

@Service
public class UtilisateurServiceImpl implements IUtilisateurService {
	
	@Autowired
	private IUtilisateurDAO utilisateurDAO;
	
	@Override
	@Transactional
	public List<Utilisateur> getListUtilisateurs(){
		return this.utilisateurDAO.getListUtilisateurs();
	}
	
	@Override
	@Transactional
	public Utilisateur getUtilisateurById(int idUtilisateur) {
		return this.utilisateurDAO.getUtilisateurById(idUtilisateur);
	}
	
	@Override
	@Transactional
	public void ajouterUtilisateur(Utilisateur utilisateur) {
		this.utilisateurDAO.ajouterUtilisateur(utilisateur);
	}
	
	@Override
	@Transactional
	public void modifierUtilisateur(Utilisateur utilisateur) {
		this.utilisateurDAO.modifierUtilisateur(utilisateur);
	}

	@Override
	@Transactional
	public void supprimerUtilisateur(int idUtilisateur) {
		this.utilisateurDAO.supprimerUtilisateur(idUtilisateur);
	}

	@Override
	@Transactional
	public Utilisateur LoginUtilisateur(String email, String pwd) {
		return this.utilisateurDAO.LoginUtilisateur(email, pwd);
	}
	
	@Override
	@Transactional
	public String recommandation (Utilisateur user) {
		return this.utilisateurDAO.recommandation(user);
	}
}
