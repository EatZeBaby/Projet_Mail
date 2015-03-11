package cinema;

import java.util.ArrayList;

public class Realisateur extends Personne{
	private ArrayList<Film> listeFilms;
	private ArrayList<Prix> listePrix;

	public Realisateur(String n, String p, String a, String nat) {
		super(n, p, a, nat);
		// TODO Auto-generated constructor stub
		listeFilms = new ArrayList<Film>();
		listePrix = new ArrayList<Prix> ();
	}
	
	// todo : ajouter des m�thodes pour accepter/refuser c�r�monie
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
	
	public void affichePrix(){
		System.out.println("===============================================================");
		System.out.println("Prix gagn�s par le r�alisateur " + this.getPrenom() + " " + this.getNom());
		System.out.println("===============================================================");
		System.out.println(" ");
		Prix p;
		
		for(int i = 0; i<listePrix.size();i++){
			p = listePrix.get(i);
			System.out.println("=========================");
			System.out.println("Ann�e : " + p.getAnnee());
			System.out.println("-------------------------");
			System.out.println("C�r�monie : " + p.getCeremoniePrix().getNomCeremonie());
			System.out.println("-------------------------");
			System.out.println("Titre du prix : " + p.getTitrePrix());
			System.out.println("=========================");
		}
	}

}
