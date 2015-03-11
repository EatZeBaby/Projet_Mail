package cinema;

import java.util.ArrayList;

public class Acteur extends Personne{
	private ArrayList<Film> listeFilms;
	private ArrayList<Prix> listePrix;
	

	public Acteur(String n, String p, String a, String nat) {
		super(n, p, a, nat);
		listeFilms = new ArrayList<Film>();
		listePrix = new ArrayList<Prix> ();
		
	}
	
	public void ajouterFilm(Film f){
		listeFilms.add(f);
	}
	
	public void ajouterPrix(Prix p){
		listePrix.add(p);
	}

	public ArrayList<Film> getListeFilms() {
		return listeFilms;
	}

	public void setListeFilms(ArrayList<Film> listeFilms) {
		this.listeFilms = listeFilms;
	}

	public ArrayList<Prix> getListePrix() {
		return listePrix;
	}

	public void setListePrix(ArrayList<Prix> listePrix) {
		this.listePrix = listePrix;
	}
}
