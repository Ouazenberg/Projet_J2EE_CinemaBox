package paris8.thyp.cinemaBox.services;

import java.util.List;

import paris8.thyp.cinemaBox.entities.Serie;

public interface ISerieService {
	
	public List<Serie> getListSeries();
	public Serie getSerieById(int idSerie);
	public void ajouterSerie(Serie serie);
	public void modifierSerie(Serie serie);
	public void supprimerSerie(int idSerie);
	
}
