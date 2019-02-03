package paris8.thyp.cinemaBox.DAO;

import java.util.List;

import paris8.thyp.cinemaBox.entities.Film;

public interface IFilmDAO {
	
	public List<Film> getListFilms();
	public Film getFilmById(int idFilm);
	public List<Film> getListFilmsPref(String categorie);
	public void ajouterFilm(Film film);
	public void modifierFilm(Film film);
	public void supprimerFilm(int idFilm);
	public List<Film> getListFilmsSearch(String name);

}
