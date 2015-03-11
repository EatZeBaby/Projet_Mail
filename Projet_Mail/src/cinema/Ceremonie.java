package cinema;


import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.lang.Exception;

public class Ceremonie {
	

	    // Attributs
	   
	    
	    private String nomCeremonie;
	    private String lieuxCeremonie;
	    private Personne presidentCeremonie;
	    private Date dateDebutCeremonie;
	    private Date dateFinCeremonie;
	    private boolean cloture;
	    private List<Acteur> listeActeursPresents;
	    private List<Realisateur> listeRealPresents;
	    
	    // Liste contenant toutes les cérémonies
	    private static List<Ceremonie> listeCeremonies = new ArrayList<Ceremonie>();
	    
	    //fonctions IT02 : gestion des invitations (c�t� C�r�monie)
	    public void inviterPersonne (Personne p){
	    	//L'acad�mie peut refuser une invitation, mais les r�gles d'�tiquette interdisent l'inverse
	    	p.accepterInvitation(this);
	    }
	    
	    public void accepterInvitation(Personne p){
	    	System.out.println("L'invitation de "+ p.getPrenom() + " " + p.getNom() + " a �t� accept�e");
	    	if (p instanceof Realisateur){
	    		listeRealPresents.add((Realisateur) p);
	    	}
	    	else{
	    		listeActeursPresents.add((Acteur)p);
	    	}
	    }
	    
	    public void refuserInvitation(Personne p){
	    	System.out.println("L'invitation de "+ p.getPrenom() + " " + p.getNom() + " a �t� refus�e");
	    }
	    
	    // Getter Setters
	    public boolean getCloture(){
	    	return this.cloture;
	    }
	    
	    public void cloturerCeremonie(){
	    	this.cloture = true;
	    	//afficher un r�capitulatif de la c�r�monie ?
	    }
	    
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
	    	this.cloture = false;
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
