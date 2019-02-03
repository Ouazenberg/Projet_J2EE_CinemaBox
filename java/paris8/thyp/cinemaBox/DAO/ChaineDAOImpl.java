package paris8.thyp.cinemaBox.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import paris8.thyp.cinemaBox.entities.Chaine;

@Repository
public class ChaineDAOImpl implements IChaineDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Chaine> getListChaines(){
		Session session = this.sessionFactory.getCurrentSession();
		List<Chaine> chainesList = session.createQuery("select c from Chaine c").list();
		return chainesList;
	}
	
	@Override
	public Chaine getChaineById(int idChaine) {
		Session session = this.sessionFactory.getCurrentSession();
		Chaine chaine = (Chaine) session.load(Chaine.class, new Integer(idChaine));
		return chaine;
	}
	
	@Override
	public void ajouterChaine(Chaine chaine) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(chaine);
	}
	
	@Override
	public void modifierChaine(Chaine chaine) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(chaine);		
	}
	
	@Override
	public void supprimerChaine(int idChaine) {
		Session session = this.sessionFactory.getCurrentSession();
		Chaine chaine = (Chaine) session.load(Chaine.class, new Integer(idChaine));
		if (chaine != null)
			session.delete(chaine);
	}

}
