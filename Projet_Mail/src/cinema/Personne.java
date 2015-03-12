package cinema;

import java.util.ArrayList;

public class Personne {
	private ArrayList<Film> listeFilms;
	private ArrayList<Prix> listePrix;
	private String nom;
	private String prenom;
	private String age;
	private String nationalite;
	private ArrayList<Ceremonie> listeCeremonies;
	
	public Personne(String nom, String prenom, String age, String nationalite){
		setNom(nom);
		setPrenom(prenom);
		setAge(age);
		setNationalite(nationalite);
		listeCeremonies = new ArrayList<Ceremonie>();
		listeFilms = new ArrayList<Film>();
		listePrix = new ArrayList<Prix> ();
	}

	public void accepterInvitation(Ceremonie c){
		ajouterCeremonie(c);
		c.accepterInvitation(this);
	}
	
	public void ajouterCeremonie(Ceremonie c){
		listeCeremonies.add(c);
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
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
	
	public void ajouterFilm(Film f){
		listeFilms.add(f);
	}
	
	public void ajouterPrix(Prix p){
		listePrix.add(p);
	}


}
