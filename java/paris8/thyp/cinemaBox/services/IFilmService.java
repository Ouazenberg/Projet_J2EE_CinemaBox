package paris8.thyp.cinemaBox.services;

import java.util.List;

import paris8.thyp.cinemaBox.entities.Film;

public interface IFilmService {

	public List<Film> getListFilms();
	public List<Film> getListFilmsPref(String categorie);
	public Film getFilmById(int idFilm);
	public void ajouterFilm(Film film);
	public void modifierFilm(Film film);
	public void supprimerFilm(int idFilm);
	public List<Film> getListFilmsSearch(String name);
	
}
