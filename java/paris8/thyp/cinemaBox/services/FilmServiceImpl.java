package paris8.thyp.cinemaBox.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paris8.thyp.cinemaBox.DAO.IFilmDAO;
import paris8.thyp.cinemaBox.entities.Film;

@Service
public class FilmServiceImpl implements IFilmService {
	
	@Autowired
	private IFilmDAO filmDAO;
	
	@Override
	@Transactional
	public List<Film> getListFilms(){
		return this.filmDAO.getListFilms();
	}
	
	@Override
	@Transactional
	public List<Film> getListFilmsPref(String categorie){
		return this.filmDAO.getListFilmsPref(categorie);
	}
	
	@Override
	@Transactional
	public List<Film> getListFilmsSearch(String name){
		return this.filmDAO.getListFilmsSearch(name);
	}
	
	@Override
	@Transactional
	public Film getFilmById(int idFilm) {
		return this.filmDAO.getFilmById(idFilm);
	}
	
	@Override
	@Transactional
	public void ajouterFilm(Film film) {
		this.filmDAO.ajouterFilm(film);
	}
	
	@Override
	@Transactional
	public void modifierFilm(Film film) {
		this.filmDAO.modifierFilm(film);
	}

	@Override
	@Transactional
	public void supprimerFilm(int idFilm) {
		this.filmDAO.supprimerFilm(idFilm);
	}
}
