package paris8.thyp.cinemaBox;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import paris8.thyp.cinemaBox.entities.Acteur;
import paris8.thyp.cinemaBox.entities.Categorie;
import paris8.thyp.cinemaBox.entities.Film;
import paris8.thyp.cinemaBox.entities.Realisateur;
import paris8.thyp.cinemaBox.entities.Utilisateur;
import paris8.thyp.cinemaBox.services.IActeurService;
import paris8.thyp.cinemaBox.services.ICategorieService;
import paris8.thyp.cinemaBox.services.IFilmService;
import paris8.thyp.cinemaBox.services.IRealisateurService;
import paris8.thyp.cinemaBox.services.IUtilisateurService;

@Controller
public class HomeController {
	
	@Autowired
	private IUtilisateurService utilisateurService;
	
	@Autowired
	private IFilmService filmService;
	
	@Autowired
	private IActeurService acteurService;
	
	@Autowired
	private IRealisateurService realisateurService;
	
	@Autowired
	private ICategorieService categorieService;
	
	Utilisateur userr;
	String recommandation;
	Utilisateur userEdit;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
Utilisateur utilisateur = new Utilisateur(27, "OUAZENE", "Ferhat", "ferhatouaz@hotmail.com", "pass1991", true, "Comedie", 0, 0, 0, 0, 0);
this.utilisateurService.ajouterUtilisateur(utilisateur);

//--------------------Categories--------------------
Categorie action = new Categorie("Action");
this.categorieService.ajouterCategorie(action);
Categorie comedie = new Categorie("Comedie");
this.categorieService.ajouterCategorie(comedie);
Categorie romance = new Categorie("Romance");
this.categorieService.ajouterCategorie(romance);
Categorie guerre = new Categorie("Guerre");
this.categorieService.ajouterCategorie(guerre);
Categorie drama = new Categorie("Drama");
this.categorieService.ajouterCategorie(drama);

//--------------------Actors--------------------
//---Action---
Acteur brolin = new Acteur("BROLIN", "Josh", "Americain", 1968, true);
this.acteurService.ajouterActeur(brolin);
Acteur reynolds = new Acteur("REYNOLDS", "Rayan", "Canadien", 1973, false);
this.acteurService.ajouterActeur(reynolds);
Acteur reeves = new Acteur("REEVES", "Keanu", "Canadien", 1964, false);
this.acteurService.ajouterActeur(reeves);
Acteur bale = new Acteur("BALE", "Christian", "Anglais", 1968, true);
this.acteurService.ajouterActeur(bale);
Acteur downey = new Acteur("DOWNEY", "Robert", "Americain", 1973, false);
this.acteurService.ajouterActeur(downey);
//---Comedie---
Acteur hart = new Acteur("HART", "Kevin", "Americain", 1979, false);
this.acteurService.ajouterActeur(hart);
Acteur ferrel = new Acteur("FERREL", "Will", "Americain", 1967, false);
this.acteurService.ajouterActeur(ferrel);
Acteur aniston = new Acteur("ANISTON", "Jennifer", "Amercain", 1969, false);
this.acteurService.ajouterActeur(aniston);
Acteur carrey = new Acteur("CARREY", "Jim", "canadien", 1962, false);
this.acteurService.ajouterActeur(carrey);
Acteur baron = new Acteur("BARON", "Sasha", "Anglais", 1971, false);
this.acteurService.ajouterActeur(baron);
//---Romance---
Acteur winslet = new Acteur("WINSLET", "Kate", "Anglaise", 1975, true);
this.acteurService.ajouterActeur(winslet);
Acteur gosling = new Acteur("GOSLING", "Rayan", "Canadien", 1980, true);
this.acteurService.ajouterActeur(gosling);
Acteur dicaprio = new Acteur("DICAPRIO", "Leonardo", "Amercain", 1974, true);
this.acteurService.ajouterActeur(dicaprio);
//---Guerre---
Acteur ganz = new Acteur("GANZ", "Bruno", "Suisse", 1941, false);
this.acteurService.ajouterActeur(ganz);
Acteur brad = new Acteur("PITT", "Brad", "Americain", 1963, false);
this.acteurService.ajouterActeur(brad);
Acteur cooper = new Acteur("COOPER", "Bradley", "Amercain", 1975, false);
this.acteurService.ajouterActeur(cooper);
Acteur hardy = new Acteur("HARDY", "Tom", "canadien", 1962, false);
this.acteurService.ajouterActeur(hardy);
Acteur garfield = new Acteur("GARFIELD", "Andrew", "Anglais", 1983, false);
this.acteurService.ajouterActeur(garfield);

//--------------------Realisateurs--------------------
Realisateur denis = new Realisateur("VILLENEUVE", "Denis", "Canadien", 1960, false);
this.realisateurService.ajouterRealisateur(denis);
Realisateur bay = new Realisateur("BAY", "Michael", "Canadien", 1960, true);
this.realisateurService.ajouterRealisateur(bay);
Realisateur wolf = new Realisateur("WOLF", "Dick", "Americain", 1954, false);
this.realisateurService.ajouterRealisateur(wolf);
Realisateur lee = new Realisateur("LEE", "Tommy", "Australien", 1959, false);
this.realisateurService.ajouterRealisateur(lee);
Realisateur spielberg = new Realisateur("SPIELBERG", "Steven", "Americain", 1960, true);
this.realisateurService.ajouterRealisateur(spielberg);
Realisateur spader = new Realisateur("SPADER", "James", "Canadien", 1960, false);
this.realisateurService.ajouterRealisateur(spader);
Realisateur carter = new Realisateur("CARTER", "James", "Canadien", 1960, false);
this.realisateurService.ajouterRealisateur(carter);

//--------------------Films--------------------
//---Action---
Film sicario = new Film("Sicario", "An idealistic FBI agent is enlisted by a government task force to aid in the escalating war against drugs at the border area between the U.S. and Mexico. ", "resources/images/films/action/sicario.jpg", "resources/images/films/action/sicarioLarge.jpg","https://www.youtube.com/embed/G8tlEcnrGnU", 2015, action, denis, brolin);
this.filmService.ajouterFilm(sicario);
Film deadpool = new Film("Deadpool", "A fast-talking mercenary with a morbid sense of humor is subjected to a rogue experiment that leaves him with accelerated healing powers and a quest for revenge. ", "resources/images/films/action/deadpool.jpg", "resources/images/films/action/deadpoolLarge.jpg","https://www.youtube.com/embed/FyKWUTwSYAs", 2015, action, bay, reynolds);
this.filmService.ajouterFilm(deadpool);
Film johnWick = new Film("John Wick", "An ex-hit-man comes out of retirement to track down the gangsters that killed his dog and took everything from him. ", "resources/images/films/action/johnwick.jpg", "resources/images/films/action/johnwickLarge.jpg","https://www.youtube.com/embed/2AUmvWm5ZDQ", 2015, action, spielberg, reeves);
this.filmService.ajouterFilm(johnWick);
Film batman = new Film("Batman", "The Dark Knight of Gotham City begins his war on crime with his first major enemy being the clownishly homicidal Joker. ", "resources/images/films/action/batman.jpg", "resources/images/films/action/batmanLarge.jpg","https://www.youtube.com/embed/EXeTwQWrcwY", 2015, action, bay, bale);
this.filmService.ajouterFilm(batman);
Film avengers = new Film("Avengers", "Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity. ", "resources/images/films/action/avengers.jpg", "resources/images/films/action/avengersLarge.jpg","https://www.youtube.com/embed/eOrNdBpGMv8", 2015, action, spielberg, downey);
this.filmService.ajouterFilm(avengers);
//---Comedy---
Film anchorman = new Film("Anchorman", "Ron Burgundy is San Diego's top-rated newsman in the male-dominated broadcasting of the 1970s, but that's all about to change for Ron and his cronies when an ambitious woman is hired as a new anchor. ", "resources/images/films/comedy/anchorman.jpg", "resources/images/films/comedy/anchormanLarge.jpg","https://www.youtube.com/embed/-T3wnP91OnI", 2015, comedie, wolf, ferrel);
this.filmService.ajouterFilm(anchorman);
Film dictator = new Film("The Dictator", "The heroic story of a dictator who risked his life to ensure that democracy would never come to the country he so lovingly oppressed. ", "resources/images/films/comedy/dictator.jpg", "resources/images/films/comedy/dictatorLarge.jpg","https://www.youtube.com/embed/cYplvwBvGA4", 2015, comedie, bay, baron);
this.filmService.ajouterFilm(dictator);
Film nightschool = new Film("Night School", "A group of troublemakers are forced to attend night school in hope that they'll pass the GED exam to finish high school. ", "resources/images/films/comedy/nightschool.jpg", "resources/images/films/comedy/nightschoolLarge.jpg","https://www.youtube.com/embed/t9QtXGirWf0", 2015, comedie, spielberg, hart);
this.filmService.ajouterFilm(nightschool);
Film dumb = new Film("Dumb and Dumber", "The cross-country adventures of 2 good-hearted but incredibly stupid friends.", "resources/images/films/comedy/dumb.jpg", "resources/images/films/comedy/dumbLarge.jpg","https://www.youtube.com/embed/l13yPhimE3o", 2015, comedie, spader, carrey);
this.filmService.ajouterFilm(dumb);
Film millers = new Film("We're the Millers", "A veteran pot dealer creates a fake family as part of his plan to move a huge shipment of weed into the U.S. from Mexico. ", "resources/images/films/comedy/millers.jpg", "resources/images/films/comedy/millersLarge.jpg","https://www.youtube.com/embed/0Vsy5KzsieQ", 2015, comedie, carter, aniston);
this.filmService.ajouterFilm(millers);
//---Romance---
Film holiday = new Film("Holiday", "Two women troubled with guy-problems swap homes in each other's countries, where they each meet a local guy and fall in love. ", "resources/images/films/romance/holiday.jpg", "resources/images/films/romance/holidayLarge.jpg","https://www.youtube.com/embed/BDi5zH18vxU", 2015, romance, wolf, winslet);
this.filmService.ajouterFilm(holiday);
Film lalaland = new Film("La la land", "While navigating their careers in Los Angeles, a pianist and an actress fall in love while attempting to reconcile their aspirations for the future.", "resources/images/films/romance/lalaland.jpg", "resources/images/films/romance/lalalandLarge.jpg","https://www.youtube.com/embed/0pdqf4P9MB8", 2015, romance, bay, gosling);
this.filmService.ajouterFilm(lalaland);
Film titanic = new Film("Titanic", "A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.", "resources/images/films/romance/titanic.jpg", "resources/images/films/romance/titanicLarge.jpg","https://www.youtube.com/embed/zCy5WQ9S4c0", 2015, romance, spielberg, dicaprio);
this.filmService.ajouterFilm(titanic);
Film proposal = new Film("The Proposal", "A pushy boss forces her young assistant to marry her in order to keep her visa status in the U.S. and avoid deportation to Canada. ", "resources/images/films/romance/proposal.jpg", "resources/images/films/romance/proposalLarge.jpg","https://www.youtube.com/embed/RFL8b1p1ELY", 2015, romance, spader, reynolds);
this.filmService.ajouterFilm(proposal);
Film notebook = new Film("The Notebook", "A poor yet passionate young man falls in love with a rich young woman, giving her a sense of freedom, but they are soon separated because of their social differences. ", "resources/images/films/romance/notebook.jpg", "resources/images/films/romance/notebookLarge.jpg","https://www.youtube.com/embed/FC6biTjEyZw", 2015, romance, carter, gosling);
this.filmService.ajouterFilm(notebook);
//---Guerre---
Film fury = new Film("Fury", "A grizzled tank commander makes tough decisions as he and his crew fight their way across Germany in April, 1945. ", "resources/images/films/war/fury.jpg", "resources/images/films/war/furyLarge.jpg","https://www.youtube.com/embed/DNHuK1rteF4", 2015, guerre, wolf, brad);
this.filmService.ajouterFilm(fury);
Film dunkirk = new Film("Dunkirk", "Allied soldiers from Belgium, the British Empire, and France are surrounded by the German Army, and evacuated during a fierce battle in World War II. ", "resources/images/films/war/dunkirk.jpg", "resources/images/films/war/dunkirkLarge.jpg","https://www.youtube.com/embed/F-eMt3SrfFU", 2015, guerre, bay, hardy);
this.filmService.ajouterFilm(dunkirk);
Film downfall = new Film("Downfall", "Traudl Junge, the final secretary for Adolf Hitler, tells of the Nazi dictator's final days in his Berlin bunker at the end of WWII.", "resources/images/films/war/downfall.jpg", "resources/images/films/war/downfallLarge.jpg","https://www.youtube.com/embed/Bp1RXmM1-60", 2015, guerre, spielberg, ganz);
this.filmService.ajouterFilm(downfall);
Film sniper = new Film("American Sniper", "Navy S.E.A.L. sniper Chris Kyle's pinpoint accuracy saves countless lives on the battlefield and turns him into a legend. Back home to his wife and kids after four tours of duty, however, Chris finds that it is the war he can't leave behind. ", "resources/images/films/war/sniper.jpg", "resources/images/films/war/sniperLarge.jpg","https://www.youtube.com/embed/99k3u9ay1gs", 2015, guerre, spader, cooper);
this.filmService.ajouterFilm(sniper);
Film ridge = new Film("Ridge", "World War II American Army Medic Desmond T. Doss, who served during the Battle of Okinawa, refuses to kill people, and becomes the first man in American history to receive the Medal of Honor without firing a shot. ", "resources/images/films/war/ridge.jpg", "resources/images/films/war/ridgeLarge.jpg","https://www.youtube.com/embed/s2-1hz1juBI", 2015, guerre, carter, garfield);
this.filmService.ajouterFilm(ridge);
		
		model.addAttribute("newUser",new Utilisateur());
		return "login";
	}
	
	
	
	@RequestMapping(value = "/validate", method = RequestMethod.POST)
     public String validateUsr(@RequestParam("email")String username, @RequestParam("pswd")String password,Model model,ModelMap modelMap,HttpServletRequest request) {

		userr = this.utilisateurService.LoginUtilisateur(username, password);
	
		if(userr !=null) {
			recommandation = this.utilisateurService.recommandation(userr);
			return "redirect:/Films";
			
		}else{
			return "redirect:/Login";
		}	
	}
	
	@RequestMapping(value = "/Films", method = RequestMethod.GET)
	public String films(Locale locale, Model model){
		model.addAttribute("films",this.filmService.getListFilms());
		model.addAttribute("filmsRecom", this.filmService.getListFilmsPref(recommandation));
		model.addAttribute("filmsPref", this.filmService.getListFilmsPref(userr.getCategoriePreferee()));
		model.addAttribute("user",userr);		
		
		return "films";
	}
	
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String login(Locale locale, Model model){	

		model.addAttribute("text","User ou Password incorrect !!");
		model.addAttribute("newUser",new Utilisateur());
		return "login";
	}
	
	@RequestMapping(value = "/Details", method = RequestMethod.GET)
	public String detailsFilm(@RequestParam("idFilm") int idFilm, Model model){
		
		model.addAttribute("filmsPref", this.filmService.getListFilmsPref(userr.getCategoriePreferee()));
		model.addAttribute("fil", this.filmService.getFilmById(idFilm));
		model.addAttribute("user",userr);
		
		return "filmDetails";
	}
	
	@RequestMapping(value = "/Admin", method = RequestMethod.GET)
	public String admin(Locale locale, Model model){
		
		model.addAttribute("listUsers",this.utilisateurService.getListUtilisateurs());
		model.addAttribute("newActeur",new Acteur());
		model.addAttribute("newUser",new Utilisateur());
		model.addAttribute("user",userr);	
		
		return "admin";
	}
	
	@RequestMapping(value = "/SupprimerUtilisateur", method = RequestMethod.GET)
	public String deleteUser(@RequestParam("idUtilisateur") int idUtilisateur, Model model){
		
		this.utilisateurService.supprimerUtilisateur(idUtilisateur);
		return "redirect:/Admin";
	}
	
	
	@RequestMapping(value = "/PreModifierUtilisateur", method = RequestMethod.GET)
	public String preUpdateUser(@RequestParam("idUtilisateur") int idUtilisateur, Model model){
		Utilisateur utilisateur = this.utilisateurService.getUtilisateurById(idUtilisateur);
		model.addAttribute("userEdit",utilisateur);
		model.addAttribute("listUsers",this.utilisateurService.getListUtilisateurs());
		model.addAttribute("newActeur",new Acteur());
		model.addAttribute("newUser",new Utilisateur());
		return "admin";
	}
	
	@RequestMapping(value= "/ModifierUtilisateur", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute("userEdit") Utilisateur utilisateur){
		
		if(utilisateur.getIdUtilisateur()== 0){
			//new person, add it
			this.utilisateurService.ajouterUtilisateur(utilisateur); ;
		}else{
			//existing person, call update
			this.utilisateurService.modifierUtilisateur(utilisateur); ;
		}
		
		return "redirect:/Admin";
		
	}
	
	@RequestMapping(value= "/SearchResults")
	public String recherche(@RequestParam("search") String name, Model model){
		
		model.addAttribute("searchResults", this.filmService.getListFilmsSearch(name));
		model.addAttribute("filmsPref", this.filmService.getListFilmsPref(userr.getCategoriePreferee()));
		model.addAttribute("user",userr);		
		return "results";
		
	}
	
	@RequestMapping(value= "/Admin/AjouterFilm", method = RequestMethod.POST)
	public String ajouterFilm(@ModelAttribute("newActeur") Acteur acteur){
		
		if(acteur.getIdActeur() == 0){
			//new person, add it
			this.acteurService.ajouterActeur(acteur);
		}else{
			//existing person, call update
			this.acteurService.modifierActeur(acteur);
		}
		
		return "redirect:/Admin";
		
	}
	
	@RequestMapping(value= "/User/AjouterUser", method = RequestMethod.POST)
	public String ajouterUserUser(@ModelAttribute("newUser") Utilisateur utilisateur){
		
		if(utilisateur.getIdUtilisateur() == 0){
			//new person, add it
			this.utilisateurService.ajouterUtilisateur(utilisateur);
		}else{
			//existing person, call update
			this.utilisateurService.modifierUtilisateur(utilisateur);;
		}
		
		return "redirect:/";
		
	}
	
	@RequestMapping(value= "/Admin/AjouterUser", method = RequestMethod.POST)
	public String ajouterUser(@ModelAttribute("newUser") Utilisateur utilisateur){
		
		if(utilisateur.getIdUtilisateur() == 0){
			this.utilisateurService.ajouterUtilisateur(utilisateur);
		}
		else{
			this.utilisateurService.modifierUtilisateur(utilisateur);;
		}
		
		return "redirect:/Admin";
		
	}
	
	@RequestMapping(value = "/Like", method = RequestMethod.GET)
	public String likeFilm(@RequestParam("idFilm") int idFilm, Model model){
		Film film = this.filmService.getFilmById(idFilm);
		
		if (film.getCategorie().getNomCategorie().equals("Action")) {
			userr.setAction(userr.getAction()+1);}
		else if (film.getCategorie().getNomCategorie().equals("Comedie"))
			userr.setComedie(userr.getComedie()+1);
		else if (film.getCategorie().getNomCategorie().equals("Romance"))
			userr.setRomance(userr.getRomance()+1);
		else if (film.getCategorie().getNomCategorie().equals("Guerre"))
			userr.setGuerre(userr.getGuerre()+1);
		else if (film.getCategorie().getNomCategorie().equals("Drama"))
			userr.setDrama(userr.getDrama()+1);
		
		this.utilisateurService.modifierUtilisateur(userr);
		userr = this.utilisateurService.LoginUtilisateur(userr.getEmail(), userr.getPassword());
		
		recommandation = this.utilisateurService.recommandation(userr);
		
		return "redirect:/Details?idFilm="+idFilm;
	}
	
	
}
