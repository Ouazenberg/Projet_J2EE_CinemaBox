package paris8.thyp.cinemaBox.DAO;

import java.util.List;

import paris8.thyp.cinemaBox.entities.Serie;

public interface ISerieDAO {
	
	public List<Serie> getListSeries();
	public Serie getSerieById(int idSerie);
	public void ajouterSerie(Serie serie);
	public void modifierSerie(Serie serie);
	public void supprimerSerie(int idSerie);

}
