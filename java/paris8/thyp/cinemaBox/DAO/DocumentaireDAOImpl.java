package paris8.thyp.cinemaBox.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import paris8.thyp.cinemaBox.entities.Documentaire;

@Repository
public class DocumentaireDAOImpl implements IDocumentaireDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Documentaire> getListDocumentaires(){
		Session session = this.sessionFactory.getCurrentSession();
		List<Documentaire> documentairesList = session.createQuery("select d from Documentaire d").list();
		return documentairesList;
	}
	
	@Override
	public Documentaire getDocumentaireById(int idDocumentaire) {
		Session session = this.sessionFactory.getCurrentSession();
		Documentaire documentaire = (Documentaire) session.load(Documentaire.class, new Integer(idDocumentaire));
		return documentaire;
	}
	
	@Override
	public void ajouterDocumentaire(Documentaire documentaire) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(documentaire);
	}
	
	@Override
	public void modifierDocumentaire(Documentaire documentaire) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(documentaire);		
	}
	
	@Override
	public void supprimerDocumentaire(int idDocumentaire) {
		Session session = this.sessionFactory.getCurrentSession();
		Documentaire documentaire = (Documentaire) session.load(Documentaire.class, new Integer(idDocumentaire));
		if (documentaire != null)
			session.delete(documentaire);
	}
	
}
