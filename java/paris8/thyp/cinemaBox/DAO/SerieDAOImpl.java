package paris8.thyp.cinemaBox.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import paris8.thyp.cinemaBox.entities.Serie;

@Repository
public class SerieDAOImpl implements ISerieDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Serie> getListSeries(){
		Session session = this.sessionFactory.getCurrentSession();
		List<Serie> seriesList = session.createQuery("select s from Serie s").list();
		return seriesList;
	}
	
	@Override
	public Serie getSerieById(int idSerie) {
		Session session = this.sessionFactory.getCurrentSession();
		Serie serie = (Serie) session.load(Serie.class, new Integer(idSerie));
		return serie;
	}
	
	@Override
	public void ajouterSerie(Serie serie) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(serie);
	}
	
	@Override
	public void modifierSerie(Serie serie) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(serie);		
	}
	
	@Override
	public void supprimerSerie(int idSerie) {
		Session session = this.sessionFactory.getCurrentSession();
		Serie serie = (Serie) session.load(Serie.class, new Integer(idSerie));
		if (serie != null)
			session.delete(serie);
	}


}
