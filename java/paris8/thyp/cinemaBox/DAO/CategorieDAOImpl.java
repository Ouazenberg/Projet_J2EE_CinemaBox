package paris8.thyp.cinemaBox.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import paris8.thyp.cinemaBox.entities.Categorie;

@Repository
public class CategorieDAOImpl implements ICategorieDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Categorie> getListCategories(){
		Session session = this.sessionFactory.getCurrentSession();
		List<Categorie> categoriesList = session.createQuery("select c from categorie c").list();
		return categoriesList;
	}
	
	@Override
	public Categorie getCategorieById(int idCategorie) {
		Session session = this.sessionFactory.getCurrentSession();
		Categorie categorie = (Categorie) session.load(Categorie.class, new Integer(idCategorie));
		return categorie;
	}
	
	@Override
	public void ajouterCategorie(Categorie categorie) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(categorie);
	}
	
	@Override
	public void modifierCategorie(Categorie categorie) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(categorie);		
	}
	
	@Override
	public void supprimerCategorie(int idCategorie) {
		Session session = this.sessionFactory.getCurrentSession();
		Categorie categorie = (Categorie) session.load(Categorie.class, new Integer(idCategorie));
		if (categorie != null)
			session.delete(categorie);
	}
}
