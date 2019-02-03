package paris8.thyp.cinemaBox.DAO ;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import paris8.thyp.cinemaBox.entities.*; 

@Repository
public class ActeurDAOImpl implements IActeurDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Acteur> getListActeurs(){
		Session session = this.sessionFactory.getCurrentSession();
		List<Acteur> acteursList = session.createQuery("select a from Acteur a").list();
		
		return acteursList;
	}
	
	@Override
	public Acteur getActeurById(int idActeur) {
		Session session = this.sessionFactory.getCurrentSession();
		Acteur acteur = (Acteur) session.load(Acteur.class, new Integer(idActeur));
		
		return acteur;
	}
	
	@Override
	public void ajouterActeur(Acteur acteur) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(acteur);
		
	}
	
	@Override
	public void modifierActeur(Acteur acteur) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(acteur);
		
	}
	
	@Override
	public void supprimerActeur(int idActeur) {
		Session session = this.sessionFactory.getCurrentSession();
		Acteur acteur = (Acteur) session.load(Acteur.class, new Integer(idActeur));
		if(acteur!= null)
			session.delete(acteur);
			
	}
	
	
}
