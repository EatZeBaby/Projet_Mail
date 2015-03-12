package cinema;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Film {
	
	 // instance variables - replace the example below with your own
    private String nomFilm;
    private int budgetFilm;
    private List<Acteur> listeActeurs;
    private List<Realisateur> listeRealisateurs;
    private List<Prix> listePrix;
    private Date dateFilm;

    /**
     * Constructor for objects of class Film
     */
    public Film(String NomFilm, int BudgetFilm, List<Acteur> listeActeurs, List<Realisateur> listeRealisateurs, Date dateFilm)
    {
       this.nomFilm = NomFilm;
       this.budgetFilm = BudgetFilm;
       this.listeActeurs = listeActeurs;
       this.listeRealisateurs = listeRealisateurs;
       this.listePrix = new ArrayList<Prix>();
       this.dateFilm = dateFilm;
    }
    public Film(String NomFilm)
    {
       this.nomFilm = NomFilm;
       this.budgetFilm = -1;
       this.listeActeurs = new ArrayList<Acteur>();
       this.listeRealisateurs = new ArrayList<Realisateur>();
       this.listePrix = new ArrayList<Prix>();
       
    }

   
    public void testFixture()
    {
        System.out.println("Je suis une méthode");
    }
    
    // Getter et Setter
    
	public String getNomFilm() {
		return nomFilm;
	}


	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}


	public int getBudgetFilm() {
		return budgetFilm;
	}


	public void setBudgetFilm(int budgetFilm) {
		this.budgetFilm = budgetFilm;
	}


	public List<Acteur> getListeActeurs() {
		return listeActeurs;
	}


	public void setListeActeurs(List<Acteur> listeActeurs) {
		this.listeActeurs = listeActeurs;
	}


	public List<Realisateur> getListeRealisateurs() {
		return listeRealisateurs;
	}


	public void setListeRealisateurs(List<Realisateur> listeRealisateurs) {
		this.listeRealisateurs = listeRealisateurs;
	}


	public List<Prix> getListePrix() {
		return listePrix;
	}


	public void setListePrix(List<Prix> listePrix) {
		this.listePrix = listePrix;
	}


	public Date getDateFilm() {
		return dateFilm;
	}


	public void setDateFilm(Date dateFilm) {
		this.dateFilm = dateFilm;
	}
    
    
    
 
    
    // Méthode retournant les informations générales du film
    public void infoFilms()
    {
        System.out.println("Titre : " + this.nomFilm + " Budget : " + this.budgetFilm);
    }
    
    // Ajouter un acteur
    public void ajouterActeur(Acteur UnActeur)
    {
    	this.listeActeurs.add(UnActeur);
    }
    
    // Ajouter un Réalisateur
    public void ajouterRealisateur(Realisateur UnRealisateur)
    {
    	this.listeRealisateurs.add(UnRealisateur);
    }
    
    
    // Afficher la liste des acteurs
    public void afficherActeurs()
    {
    	 for  (Acteur unActeur : listeActeurs)
         {
                 System.out.println(" Acteur : " + unActeur.getNom() + " " + unActeur.getPrenom());  
         }
    }

    
	//Afficher la liste des acteurs
	public void afficherRealisateurs()
	{
		 for  (Realisateur unRealisateur : listeRealisateurs)
	     {
	             System.out.println(" Realisateur : " + unRealisateur.getNom() + " " + unRealisateur.getPrenom());
	     }
	}



    

}
