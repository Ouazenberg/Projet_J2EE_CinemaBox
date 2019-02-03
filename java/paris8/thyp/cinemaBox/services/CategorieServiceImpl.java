package paris8.thyp.cinemaBox.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paris8.thyp.cinemaBox.DAO.ICategorieDAO;
import paris8.thyp.cinemaBox.entities.Categorie;

@Service
public class CategorieServiceImpl implements ICategorieService {
	
	@Autowired
	private ICategorieDAO categorieDAO;
	
	@Override
	@Transactional
	public List<Categorie> getListCategories(){
		return this.categorieDAO.getListCategories();
	}
	
	@Override
	@Transactional
	public Categorie getCategorieById(int idCategorie) {
		return this.categorieDAO.getCategorieById(idCategorie);
	}
	
	@Override
	@Transactional
	public void ajouterCategorie(Categorie categorie) {
		this.categorieDAO.ajouterCategorie(categorie);
	}
	
	@Override
	@Transactional
	public void modifierCategorie(Categorie categorie) {
		this.categorieDAO.modifierCategorie(categorie);
	}

	@Override
	@Transactional
	public void supprimerCategorie(int idCategorie) {
		this.categorieDAO.supprimerCategorie(idCategorie);
	}

}
