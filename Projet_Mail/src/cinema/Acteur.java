package cinema;

public class Acteur extends Personne{
	
	
	public Acteur(String n, String p, String a, String nat) {
		super(n, p, a, nat);
		// TODO Auto-generated constructor stub
	}
	private String nom;
	private String prenom;
	private String nationalite;
	
	
	
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}