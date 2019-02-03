package paris8.thyp.cinemaBox.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paris8.thyp.cinemaBox.DAO.ISerieDAO;
import paris8.thyp.cinemaBox.entities.Serie;

@Service
public class SerieServiceImpl implements ISerieService {
	
	@Autowired
	private ISerieDAO serieDAO;
	
	@Override
	@Transactional
	public List<Serie> getListSeries(){
		return this.serieDAO.getListSeries();
	}
	
	@Override
	@Transactional
	public Serie getSerieById(int idSerie) {
		return this.serieDAO.getSerieById(idSerie);
	}
	
	@Override
	@Transactional
	public void ajouterSerie(Serie serie) {
		this.serieDAO.ajouterSerie(serie);
	}
	
	@Override
	@Transactional
	public void modifierSerie(Serie serie) {
		this.serieDAO.modifierSerie(serie);
	}

	@Override
	@Transactional
	public void supprimerSerie(int idSerie) {
		this.serieDAO.supprimerSerie(idSerie);
	}
}
