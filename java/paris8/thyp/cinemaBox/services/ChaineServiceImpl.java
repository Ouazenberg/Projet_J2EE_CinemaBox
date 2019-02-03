package paris8.thyp.cinemaBox.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paris8.thyp.cinemaBox.DAO.IChaineDAO;
import paris8.thyp.cinemaBox.entities.Chaine;


@Service
public class ChaineServiceImpl implements IChaineService {
	
	@Autowired
	private IChaineDAO chaineDAO;
	
	@Override
	@Transactional
	public List<Chaine> getListChaines(){
		return this.chaineDAO.getListChaines();
	}
	
	@Override
	@Transactional
	public Chaine getChaineById(int idChaine) {
		return this.chaineDAO.getChaineById(idChaine);
	}
	
	@Override
	@Transactional
	public void ajouterChaine(Chaine chaine) {
		this.chaineDAO.ajouterChaine(chaine);
	}
	
	@Override
	@Transactional
	public void modifierChaine(Chaine chaine) {
		this.chaineDAO.modifierChaine(chaine);
	}

	@Override
	@Transactional
	public void supprimerChaine(int idChaine) {
		this.chaineDAO.supprimerChaine(idChaine);
	}

}

