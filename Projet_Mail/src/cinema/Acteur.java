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
	
	/**
	 * Affiche l'ensemble des prix remportés par l'acteur
	 */
	public void affichePrix(){
		System.out.println("==========================================================");
		System.out.println("Prix gagnés par l'acteur " + this.getPrenom() + " " + this.getNom());
		System.out.println("==========================================================");
		System.out.println(" ");
		Prix p;
		
		for(int i = 0; i<listePrix.size();i++){
			p = listePrix.get(i);
			System.out.println("=========================");
			System.out.println("Année : " + p.getAnnee());
			System.out.println("-------------------------");
			System.out.println("Cérémonie : " + p.getCeremoniePrix().getNomCeremonie());
			System.out.println("-------------------------");
			System.out.println("Titre du prix : " + p.getTitrePrix());
			System.out.println("=========================");
		}
	}
}
