package cinema;

import java.util.List;
import java.util.ArrayList;

public class Film {
	
	 // instance variables - replace the example below with your own
    private String nomFilm;
    private int budgetFilm;
    private List<Acteur> listeActeurs;

    /**
     * Constructor for objects of class Film
     */
    public Film(String NomFilm, int BudgetFilm, List<Acteur> listeActeurs)
    {
       this.nomFilm = NomFilm;
       this.budgetFilm = BudgetFilm;
       this.listeActeurs = listeActeurs;
    }

   
    public void testFixture()
    {
        System.out.println("Je suis une méthode");
    }
    
    // Getter
    public String getNomFilm()
    {
        return this.nomFilm;
    }
    
    public int getBudgetFilm()
    {
        return this.budgetFilm;
    }
    
   public List getListeActeurs()
    {
        return this.listeActeurs;
    }
    
    // Méthode retournant les informations générales du film
    public void infoFilms()
    {
        System.out.println("Titre : " + this.nomFilm + " Budget : " + this.budgetFilm);
    }
    

}
