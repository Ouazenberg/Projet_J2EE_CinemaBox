package paris8.thyp.cinemaBox.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paris8.thyp.cinemaBox.DAO.IRealisateurDAO;
import paris8.thyp.cinemaBox.entities.Realisateur;

@Service
public class RealisateurServiceImpl implements IRealisateurService {
	
	@Autowired
	private IRealisateurDAO realisateurDAO;
	
	@Override
	@Transactional
	public List<Realisateur> getListRealisateurs(){
		return this.realisateurDAO.getListRealisateurs();
	}
	
	@Override
	@Transactional
	public Realisateur getRealisateurById(int idRealisateur) {
		return this.realisateurDAO.getRealisateurById(idRealisateur);
	}
	
	@Override
	@Transactional
	public void ajouterRealisateur(Realisateur realisateur) {
		this.realisateurDAO.ajouterRealisateur(realisateur);
	}
	
	@Override
	@Transactional
	public void modifierRealisateur(Realisateur realisateur) {
		this.realisateurDAO.modifierRealisateur(realisateur);
	}

	@Override
	@Transactional
	public void supprimerRealisateur(int idRealisateur) {
		this.realisateurDAO.supprimerRealisateur(idRealisateur);
	}
}
