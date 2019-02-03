package paris8.thyp.cinemaBox.DAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import paris8.thyp.cinemaBox.entities.Film;
import paris8.thyp.cinemaBox.entities.Utilisateur;

@Repository
public class UtilisateurDAOImpl implements IUtilisateurDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Utilisateur> getListUtilisateurs(){
		Session session = this.sessionFactory.getCurrentSession();
		List<Utilisateur> utilisateursList = session.createQuery("select u from Utilisateur u").list();
		return utilisateursList;
	}
	
	@Override
	public Utilisateur getUtilisateurById(int idUtilisateur) {
		Session session = this.sessionFactory.getCurrentSession();
		Utilisateur utilisateur = (Utilisateur) session.createQuery("select u from Utilisateur u where u.idUtilisateur =:idUtilisateur").
				setParameter("idUtilisateur", idUtilisateur).list().get(0);
		return utilisateur;
	}
	
	@Override
	public void ajouterUtilisateur(Utilisateur utilisateur) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(utilisateur);
	}
	
	@Override
	public void modifierUtilisateur(Utilisateur utilisateur) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(utilisateur);		
	}
	
	@Override
	public void supprimerUtilisateur(int idUtilisateur) {
		Session session = this.sessionFactory.getCurrentSession();
		Utilisateur utilisateur = (Utilisateur) session.load(Utilisateur.class, new Integer(idUtilisateur));
		if (utilisateur != null)
			session.delete(utilisateur);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Utilisateur LoginUtilisateur(String email, String pwd) {
		Session session = this.sessionFactory.getCurrentSession();
		List<Utilisateur> utilisateursList = session.createQuery("select u from Utilisateur u where u.email=:email and u.password=:pwd")
				.setParameter("email", email)
				.setParameter("pwd", pwd).list();
		
		if (utilisateursList.size()!=0) {
			return utilisateursList.get(0);
		}else {
			return null;
		}
	}


	@Override
	public String recommandation (Utilisateur user) {
		ArrayList<Integer> categories = new ArrayList<Integer>();
		int max = 0;
		
		categories.add(user.getAction());
		categories.add(user.getComedie());
		categories.add(user.getRomance());
		categories.add(user.getGuerre());
		
		max = Collections.max(categories);
		
		if (max == categories.get(0))
		return "Action";
		else if (max == categories.get(1))
		return "Comedie";
		else if (max == categories.get(2))
		return "Romance";
		else
		return "Guerre";
		
	}

}