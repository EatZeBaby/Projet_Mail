package cinema;


import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.lang.Exception;

public class Ceremonie {
	

	    // Attributs
	   
	    
	    private String nomCeremonie;
	    private String lieuxCeremonie;
	    private Date dateDebutCeremonie;
	    private Date dateFinCeremonie;
	    private List<Acteur> listeActeursPresents;
	    
	    // Liste contenant toutes les cérémonies
	    private static List<Ceremonie> listeCeremonies = new ArrayList<Ceremonie>();
	    
	    
	    
	    // Getter Setters
	    
	    public String getNomCeremonie() {
	        return nomCeremonie;
	    }

	    public void setNomCeremonie(String nomCeremonie) {
	        this.nomCeremonie = nomCeremonie;
	    }

	    public String getLieuxCeremonie() {
	        return lieuxCeremonie;
	    }

	    public void setLieuxCeremonie(String lieuxCeremonie) {
	        this.lieuxCeremonie = lieuxCeremonie;
	    }

	    public Date getDateDebutCeremonie() {
	        return dateDebutCeremonie;
	    }

	    public void setDateDebutCeremonie(Date dateDebutCeremonie) {
	        this.dateDebutCeremonie = dateDebutCeremonie;
	    }

	    public Date getDateFinCeremonie() {
	        return dateFinCeremonie;
	    }

	    public void setDateFinCeremonie(Date dateFinCeremonie) {
	        this.dateFinCeremonie = dateFinCeremonie;
	    }

	    public List<Acteur> getListeActeursPresents() {
	        return listeActeursPresents;
	    }

	    // instance variables - replace the example below with your own
	    public void setListeActeursPresents(List<Acteur> listeActeursPresents) {
	        this.listeActeursPresents = listeActeursPresents;
	    }
	    
	    
	    // Constructeurs
	    
	    // Les constructeurs ne permettent pas de créer une cérémonie incorrecte (sans lieux, date etc)
	    
	    // Sans invités
	     public Ceremonie(String nomCeremonie, String lieuxCeremonie, Date dateDebutCeremonie, Date dateFinCeremonie) throws Exception
	     {
	        
	        
	         
	        this.nomCeremonie = nomCeremonie;
	        this.lieuxCeremonie = lieuxCeremonie;
	        this.dateDebutCeremonie = dateDebutCeremonie;
	        this.dateFinCeremonie = dateFinCeremonie;
	        
	        try
	        {
	            // Pour vérifier que la cérémonie n'existe pas déjà
	            
	            for  (Ceremonie uneCeremonie : listeCeremonies)
	            {
	                // On vérifie que celle que l'on veut créer n'a pas le même nom et la même année qu'une cérémonie existante
	                if (uneCeremonie.dateDebutCeremonie == dateDebutCeremonie && uneCeremonie.nomCeremonie == nomCeremonie)
	                {
	                    System.out.println("La cérémonie existe déjà");
	                    throw new Exception();
	                }   
	            }
	            
	            // Si la cérémonie n'existe pas, on l'ajoute
	            listeCeremonies.add(this);
	        }
	        catch (Exception Ex)
	        {
	            Ex.getMessage();
	        }
	        
	    }
	     
	     // Avec invités
	      public Ceremonie(String nomCeremonie, String lieuxCeremonie, Date dateDebutCeremonie, Date dateFinCeremonie, List<Acteur> listeActeursPresents) 
	      {
	        this.nomCeremonie = nomCeremonie;
	        this.lieuxCeremonie = lieuxCeremonie;
	        this.dateDebutCeremonie = dateDebutCeremonie;
	        this.dateFinCeremonie = dateFinCeremonie;
	        this.listeActeursPresents = listeActeursPresents;
	        
	        try
	        {
	            // Pour vérifier que la cérémonie n'existe pas déjà
	            
	            for  (Ceremonie uneCeremonie : listeCeremonies)
	            {
	                // On vérifie que celle que l'on veut créer n'a pas le même nom et la même année qu'une cérémonie existante
	                if (uneCeremonie.dateDebutCeremonie == dateDebutCeremonie && uneCeremonie.nomCeremonie == nomCeremonie)
	                {
	                    System.out.println("La cérémonie existe déjà");
	                    throw new Exception();
	                }   
	            }
	            
	            // Si la cérémonie n'existe pas, on l'ajoute
	            listeCeremonies.add(this);
	        }
	        catch (Exception Ex)
	        {
	            Ex.getMessage();
	        }
	    }

}
