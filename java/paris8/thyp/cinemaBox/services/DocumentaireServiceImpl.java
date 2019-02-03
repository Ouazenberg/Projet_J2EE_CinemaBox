package paris8.thyp.cinemaBox.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paris8.thyp.cinemaBox.DAO.IDocumentaireDAO;
import paris8.thyp.cinemaBox.entities.Documentaire;

@Service
public class DocumentaireServiceImpl implements IDocumentaireService {
	
	@Autowired
	private IDocumentaireDAO documentaireDAO;
	
	@Override
	@Transactional
	public List<Documentaire> getListDocumentaires(){
		return this.documentaireDAO.getListDocumentaires();
	}
	
	@Override
	@Transactional
	public Documentaire getDocumentaireById(int idDocumentaire) {
		return this.documentaireDAO.getDocumentaireById(idDocumentaire);
	}
	
	@Override
	@Transactional
	public void ajouterDocumentaire(Documentaire documentaire) {
		this.documentaireDAO.ajouterDocumentaire(documentaire);
	}
	
	@Override
	@Transactional
	public void modifierDocumentaire(Documentaire documentaire) {
		this.documentaireDAO.modifierDocumentaire(documentaire);
	}

	@Override
	@Transactional
	public void supprimerDocumentaire(int idDocumentaire) {
		this.documentaireDAO.supprimerDocumentaire(idDocumentaire);
	}
}
