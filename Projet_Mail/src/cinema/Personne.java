package cinema;

public class Personne {
	private String nom;
	private String prenom;
	private String age;
	private String nationalite;
	
	public Personne(String n, String p, String a, String nat){
		setNom(n);
		setPrenom(p);
		setAge(a);
		setNationalite(nat);
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

	public void setNationalite(String nationalité) {
		this.nationalite = nationalité;
	}
}
