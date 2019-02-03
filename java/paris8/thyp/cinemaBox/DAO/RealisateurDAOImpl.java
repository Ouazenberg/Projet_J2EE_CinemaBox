package paris8.thyp.cinemaBox.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import paris8.thyp.cinemaBox.entities.Realisateur;

@Repository
public class RealisateurDAOImpl implements IRealisateurDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Realisateur> getListRealisateurs(){
		Session session = this.sessionFactory.getCurrentSession();
		List<Realisateur> realisateursList = session.createQuery("select r from Realisateur r").list();
		return realisateursList;
	}
	
	@Override
	public Realisateur getRealisateurById(int idRealisateur) {
		Session session = this.sessionFactory.getCurrentSession();
		Realisateur realisateur = (Realisateur) session.load(Realisateur.class, new Integer(idRealisateur));
		return realisateur;
	}
	
	@Override
	public void ajouterRealisateur(Realisateur realisateur) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(realisateur);
	}
	
	@Override
	public void modifierRealisateur(Realisateur realisateur) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(realisateur);		
	}
	
	@Override
	public void supprimerRealisateur(int idRealisateur) {
		Session session = this.sessionFactory.getCurrentSession();
		Realisateur realisateur = (Realisateur) session.load(Realisateur.class, new Integer(idRealisateur));
		if (realisateur != null)
			session.delete(realisateur);
	}

}
