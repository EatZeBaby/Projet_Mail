package cinema;

import java.util.ArrayList;

public class Acteur extends Personne{
	
	

	public Acteur(String n, String p, String a, String nat) {
		super(n, p, a, nat);
		
		
	}
	
	public void ajouterFilm(Film f){
		super.ajouterFilm(f);
	}
	
	public void ajouterPrix(Prix p){
		super.ajouterPrix(p);
	}

	public ArrayList<Film> getListeFilms() {
		return super.getListeFilms();
	}

	public void setListeFilms(ArrayList<Film> listeFilms) {
		super.setListeFilms(listeFilms);
	}

	public ArrayList<Prix> getListePrix() {
		return super.getListePrix();
	}

	public void setListePrix(ArrayList<Prix> listePrix) {
		super.setListePrix(listePrix);
	}
	
	/**
	 * Affiche l'ensemble des prix remport�s par l'acteur
	 */
	
}
