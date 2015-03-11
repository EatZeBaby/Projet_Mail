package cinema;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Prix {
	    
	    // Attributs
	    
	    
	   


		private Ceremonie ceremoniePrix;
	    private int annee;
	    private Acteur acteurVainqueur;
	    private Realisateur realisateurVainqueur;
	    
	    
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


		public Acteur getActeurVainqueur() {
			return acteurVainqueur;
		}


		public void setActeurVainqueur(Acteur acteurVainqueur) {
			this.acteurVainqueur = acteurVainqueur;
		}


		public Realisateur getRealisateurVainqueur() {
			return realisateurVainqueur;
		}


		public void setRealisateurVainqueur(Realisateur realisateurVainqueur) {
			this.realisateurVainqueur = realisateurVainqueur;
		}
	    

	  
	    
	    
	    // Méthode pour attributer un prix
	    
	    public void AttribuerPrix(Acteur unActeurGagnant)
	    {
	        // On vérifie que le prix n'est pas déjà attribué
	        try
	        {      
	                if (this.getActeurVainqueur() != null)
	                {
	                   this.setActeurVainqueur(unActeurGagnant);
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
	     
	    
	    public void AttribuerPrix(Realisateur unRealisateurGagnant)
	    {
	        // On vérifie que le prix n'est pas déjà attribué
	        try
	        {      
	                if (this.getRealisateurVainqueur() != null)
	                {
	                   this.setRealisateurVainqueur(unRealisateurGagnant);
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
