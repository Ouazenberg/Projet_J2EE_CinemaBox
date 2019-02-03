package paris8.thyp.cinemaBox.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paris8.thyp.cinemaBox.DAO.IActeurDAO;
import paris8.thyp.cinemaBox.entities.Acteur;



@Service
public class ActeurServiceImpl implements IActeurService {
	
	@Autowired
	private IActeurDAO acteurDAO;
	
	@Override
	@Transactional
	public List<Acteur> getListActeurs(){
		return this.acteurDAO.getListActeurs();
	}
	
	@Override
	@Transactional
	public Acteur getActeurById(int idActeur) {
		return this.acteurDAO.getActeurById(idActeur);
	}
	
	@Override
	@Transactional
	public void ajouterActeur(Acteur acteur) {
		this.acteurDAO.ajouterActeur(acteur);
	}
	
	@Override
	@Transactional
	public void modifierActeur(Acteur acteur) {
		this.acteurDAO.modifierActeur(acteur);
	}

	@Override
	@Transactional
	public void supprimerActeur(int idActeur) {
		this.acteurDAO.supprimerActeur(idActeur);
	}

}
