package cinema;

import java.util.ArrayList;

public class Realisateur extends Personne{
	private ArrayList<Film> listeFilms;
	private ArrayList<Prix> listePrix;
	private ArrayList<Ceremonie> listeCeremonies;

	public Realisateur(String n, String p, String a, String nat) {
		super(n, p, a, nat);
		// TODO Auto-generated constructor stub
		listeFilms = new ArrayList<Film>();
		listePrix = new ArrayList<Prix> ();
		listeCeremonies = new ArrayList<Ceremonie>();
	}
	
	// todo : ajouter des méthodes pour accepter/refuser cérémonie
	public void ajouterFilm(Film f){
		listeFilms.add(f);
	}
	
	public void ajouterPrix(Prix p){
		listePrix.add(p);
	}
	
	public void ajouterCeremonie(Ceremonie c){
		listeCeremonies.add(c);
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
