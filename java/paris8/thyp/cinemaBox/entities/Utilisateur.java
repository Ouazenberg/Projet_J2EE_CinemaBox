package paris8.thyp.cinemaBox.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUtilisateur;
	private int ageUtilisateur;
	private String nomUtilisateur;
	private String prenomUtilisateur;
	private String email;
	private String password;
	private Boolean admin;
	private String categoriePreferee;
	private int action;
	private int comedie; 
	private int guerre;
	private int romance;
	private int drama;
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Utilisateur(int ageUtilisateur, String nomUtilisateur, String prenomUtilisateur, String email,
			String password, Boolean admin, String categoriePreferee, int action, int comedie, int guerre, int romance,
			int drama) {
		super();
		this.ageUtilisateur = ageUtilisateur;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.email = email;
		this.password = password;
		this.admin = admin;
		this.categoriePreferee = categoriePreferee;
		this.action = action;
		this.comedie = comedie;
		this.guerre = guerre;
		this.romance = romance;
		this.drama = drama;
	}


	

	public int getAction() {
		return action;
	}

	public void setAction(int action) {
		this.action = action;
	}

	public int getComedie() {
		return comedie;
	}

	public void setComedie(int comedie) {
		this.comedie = comedie;
	}

	public int getGuerre() {
		return guerre;
	}

	public void setGuerre(int guerre) {
		this.guerre = guerre;
	}

	public int getRomance() {
		return romance;
	}

	public void setRomance(int romance) {
		this.romance = romance;
	}

	public int getDrama() {
		return drama;
	}

	public void setDrama(int drama) {
		this.drama = drama;
	}

	public int getAgeUtilisateur() {
		return ageUtilisateur;
	}

	public void setAgeUtilisateur(int ageUtilisateur) {
		this.ageUtilisateur = ageUtilisateur;
	}


	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public String getCategoriePreferee() {
		return categoriePreferee;
	}

	public void setCategoriePreferee(String categoriePreferee) {
		this.categoriePreferee = categoriePreferee;
	}

}
