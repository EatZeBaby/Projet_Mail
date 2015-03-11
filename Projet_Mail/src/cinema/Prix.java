package cinema;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Prix {
	    
	    // Attributs
	    
	    
	   


		private Ceremonie ceremoniePrix;
	    private int annee;
	    private Personne personneVainqueur;
	    
	    
	    // Constructeur
	    
	    
	    private String titrePrix;
		public Prix(Ceremonie ceremoniePrix, int annee, String titrePrix) {
			super();
			this.ceremoniePrix = ceremoniePrix;
			this.annee = annee;
			this.titrePrix = titrePrix;
		}
	    
	    
	    
	    // Getter et Setter
	 


		public String getTitrePrix() {
			return titrePrix;
		}


		public void setTitrePrix(String titrePrix) {
			this.titrePrix = titrePrix;
		}


		public Ceremonie getCeremoniePrix() {
			return ceremoniePrix;
		}


		public void setCeremoniePrix(Ceremonie ceremoniePrix) {
			this.ceremoniePrix = ceremoniePrix;
		}


		public int getAnnee() {
			return annee;
		}


		public void setAnnee(int annee) {
			this.annee = annee;
		}


		public Personne getPersonneVainqueur() {
			return personneVainqueur;
		}


		public void setPersonneVainqueur(Personne personneVainqueur) {
			this.personneVainqueur = personneVainqueur;
		}


	

	    
	    // Méthode pour attributer un prix
	    
	    public void AttribuerPrix(Personne unePersonneVainqueur)
	    {
	        // On vérifie que le prix n'est pas déjà attribué
	        try
	        {      
	                if (this.getPersonneVainqueur() != null)
	                {
	                   this.setPersonneVainqueur(unePersonneVainqueur);
	                }   
	                else
	                {
	                	System.out.println("Ce prix est déjà attribué");
	                }
	           
	        }
	        catch (Exception Ex)
	        {
	            Ex.getMessage();
	        }
	    }
	     
	    
	        
	 
	
}
