package cinema;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Prix {
	    
	    // Attributs
	    
		private Ceremonie ceremoniePrix;
	    private int annee;
	    private Personne personneVainqueur;
	    private Film filmRecompense;
	    
	    
	    // Constructeur
	    
	    
	    private String titrePrix;
		public Prix(Ceremonie ceremoniePrix, int annee, String titrePrix) {
			super();
			this.ceremoniePrix = ceremoniePrix;
			this.annee = annee +1900;
			this.titrePrix = titrePrix;
			this.personneVainqueur=null;
			
			ceremoniePrix.ajouterPrix(this);
		}
	    
	    
	    
	    // Getter et Setter
	 


		public Film getFilmRecompense() {
			return filmRecompense;
		}



		public void setFilmRecompense(Film filmRecompense) {
			this.filmRecompense = filmRecompense;
		}

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
			this.annee = annee + 1900;
		}


		public Personne getPersonneVainqueur() {
			return personneVainqueur;
		}


		public void setPersonneVainqueur(Personne personneVainqueur) {
			this.personneVainqueur = personneVainqueur;
		}


	

	    
	    // Méthode pour attributer un prix
	    
	    public void AttribuerPrix(Personne unePersonneVainqueur, Film filmRecompense)
	    {
	    	// On vérifie que le prix n'est pas déjà attribué
	        try
	        {      	
	                if (this.personneVainqueur == null)
	                {
	                	
	                   this.setPersonneVainqueur(unePersonneVainqueur);
	                   // On ajoute le prix au film récompensé.
	                   this.filmRecompense = filmRecompense;
	                   //filmRecompense.getListePrix().add(this);
	                   // Et on ajoute le prix decerné à la cérémonie à laquelle il a été decerné
	                   //this.ceremoniePrix.getListePrix().add(this);
	                   
	                   // Enfin on ajoute le prix à la personne qui l'a gagné
	                   unePersonneVainqueur.ajouterPrix(this);
	                   System.out.println("Le prix "+this.getTitrePrix()+" "+annee +" est attribué à "+this.getPersonneVainqueur().getPrenom()+" "+this.getPersonneVainqueur().getNom()
	                		   					+ " pour le film "+filmRecompense.getNomFilm());
	                }   
	                else
	                {	
	                	System.out.println("Le prix "+this.getTitrePrix()+" est déjà attribué à "+this.getPersonneVainqueur().getPrenom()+" "+this.getPersonneVainqueur().getNom());
	                }
	           
	        }
	        catch (Exception Ex)
	        {
	            Ex.getMessage();
	        }
	    }
	     
	    
	        
	 
	
}
