package paris8.thyp.cinemaBox.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import paris8.thyp.cinemaBox.entities.Film;

@Repository
public class FilmDAOImpl implements IFilmDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Film> getListFilms(){
		Session session = this.sessionFactory.getCurrentSession();
		List<Film> filmsList = session.createQuery("select f from Film f").list();
		return filmsList;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Film> getListFilmsPref(String categorie){
		Session session = this.sessionFactory.getCurrentSession();
		List<Film> filmsListPref = session.createQuery("select f from Film f where f.categorie.nomCategorie =:categorie order by rand()").setParameter("categorie", categorie).list();
		return filmsListPref;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Film> getListFilmsSearch(String name){
		Session session = this.sessionFactory.getCurrentSession();
		name = "%"+name+"%";
		List<Film> filmsListSearch = session.createQuery("select f from Film f where f.nomFilm like :name").setParameter("name", name).list();
		return filmsListSearch;
	}
	
	
	@Override
	public Film getFilmById(int idFilm) {
		Session session = this.sessionFactory.getCurrentSession();
		Film film = (Film) session.createQuery("select f from Film f where f.idFilm =:idFilm").
				setParameter("idFilm", idFilm).list().get(0);
		return film;
	}
	
	@Override
	public void ajouterFilm(Film film) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(film);
	}
	
	@Override
	public void modifierFilm(Film film) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(film);		
	}
	
	@Override
	public void supprimerFilm(int idFilm) {
		Session session = this.sessionFactory.getCurrentSession();
		Film film = (Film) session.load(Film.class, new Integer(idFilm));
		if (film != null)
			session.delete(film);
	}

}
