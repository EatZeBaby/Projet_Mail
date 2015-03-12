package cinema;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.lang.Exception;

public class Ceremonie {
	

	    // Attributs
	   	private String 				nomCeremonie;
	    private String 				lieuxCeremonie;
	    private Personne 			presidentCeremonie; 
	    private Date 				dateDebutCeremonie;
	    private Date 				dateFinCeremonie;
	    private boolean 			cloture;
	    private List<Acteur>		listeActeursPresents;
	   
	    private List<Realisateur> 	listeRealPresents;
	    private Jury 				jury;
	    
	    // Liste contenant toutes les cérémonies
	    private static List<Ceremonie> listeCeremonies = new ArrayList<Ceremonie>();
	    //Liste contenant tous les prix accordés
	    private ArrayList<Prix> listePrix = new ArrayList<Prix>();
	    
	    
	    public void attribuerPrix(Prix prix,Personne personne,Film film){
	    	int val=-1;
	    	for(int i=0;i<this.listePrix.size();i++){
	    		if ((this.listePrix.get(i).getTitrePrix()==prix.getTitrePrix())
	    				&&(this.listePrix.get(i).getAnnee()==prix.getAnnee())){
	    			val=i;
	    		}
	    	}
	    	if(this.jury.appartient(personne)){
	    		System.out.println(personne.getPrenom()+" "+personne.getNom()+" ne peut pas recevoir le prix " + prix.getTitrePrix() + " car il fait partie du jury de " +this.jury.getNomCeremonie()+" "+ this.jury.getAnnee());
	    	}
	    	else if (val==-1){
	    		System.out.println("Le prix n'existe pas pour cette cérémonie.");
	    	}else{
	    		this.listePrix.get(val).AttribuerPrix(personne, film);
	    	}
	    
	    }
	    public void ajouterAuJury(Personne p){
	    	this.jury.ajouter(p);
	    }
	    public void ajouterPrix(Prix p){
	    	this.listePrix.add(p);
	    }
	    
	    //fonctions IT02 : gestion des invitations (c�t� C�r�monie)
	    public void inviterPersonne (Personne p){
	    	//L'acad�mie peut refuser une invitation, mais les r�gles d'�tiquette interdisent l'inverse
	    	p.accepterInvitation(this);
	    }
	    
	    
	    
	    
	    public void accepterInvitation(Personne p){
	    	System.out.println("L'invitation de "+ p.getPrenom() + " " + p.getNom() + " a été acceptée");
	    	if (p instanceof Realisateur){
	    		listeRealPresents.add((Realisateur) p);
	    	}
	    	else if (p instanceof Acteur){
	    		listeActeursPresents.add((Acteur)p);
	    	}
	    }
	    
	    
	    
	    
	    public void refuserInvitation(Personne p){
	    	System.out.println("L'invitation de "+ p.getPrenom() + " " + p.getNom() + " a été refusée");
	    }
	    
	    
	    
	    
	    // Getter Setters
	    public boolean getCloture(){
	    	return this.cloture;
	    }
	    
	    /**
	     * Cl�ture de la c�r�monie (cloture = true)
	     * et affichage des gagnants
	     */
	    public void cloturerCeremonie(){
	    	this.cloture = true;
	    	//afficher un récapitulatif de la cérémonie ?
	    	recapPrix();
	    }
	    
	    /**
	     * affiche le prix, et le nom du gagnant
	     */
	    public void recapPrix(){
	    	Prix p;
	    	System.out.println("=====================================================");
	    	System.out.println("===============  fin de la cérémonie ================");
	    	System.out.println("=============== Liste des prix donnés : =============");
	    	System.out.println("=====================================================");
	    	System.out.println("   ");
	    	
	    	for(int i=0;i < listePrix.size(); i++){
	    		p = listePrix.get(i);
	    		if(p.getPersonneVainqueur()!=null){
		    		System.out.println("=====================================================");
		    		System.out.println("Titre prix : " + p.getTitrePrix());
		    		System.out.println("-----------------------------------------------------");
		    		System.out.println("Gagnant : " + p.getPersonneVainqueur().getPrenom() + " " + p.getPersonneVainqueur().getNom());
		    		System.out.println("=====================================================");
		    	
	    		}else{
	    			System.out.println("=====================================================");
		    		System.out.println("Titre prix : " + p.getTitrePrix());
		    		System.out.println("-----------------------------------------------------");
		    		System.out.println("Gagnant : Aucun");
		    		System.out.println("=====================================================");
	    		}
	    	}
	    		
	    	
	    	System.out.println();
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
	    
	    
	    
	    
	    //Méthodes d'affichage
	    public void afficherActeursPresents(){
	    	System.out.println("◢ Les acteurs présents à la cérémonie "+ this.nomCeremonie+" sont : ◣");
	    	for(Acteur membre: this.listeActeursPresents){
				System.out.println("\t"+membre.getPrenom()+" "+membre.getNom());
				
				} ;
			System.out.println("");
	    }
	    public void afficherRealPresents(){
	    	System.out.println("◢ Les réalisateurs présents à la cérémonie "+ this.nomCeremonie+" sont : ◣");
	    	for(Realisateur membre: this.listeRealPresents){
				System.out.println("\t"+membre.getPrenom()+" "+membre.getNom());
				
				} ;
			System.out.println("");
	    }
	    
	    public void description(){
	    	// 1. Choix de la langue
	    	Locale locale = Locale.getDefault();
	    	 
	    	/** 2. Construction du DateFormat en choisiant un format :
	    	 * SHORT = 01/01/2002
	    	 * FULL = lundi 1 janvier 2002
	    	 */
	    	DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
	    	 
	    	// 3. Affichage
	    	System.out.println();
	    	System.out.println("==============================================");
	    	System.out.println(this.getNomCeremonie()+", à "+this.getLieuxCeremonie());
	    	System.out.println("du "+dateFormat.format(this.getDateDebutCeremonie())+ " au " + dateFormat.format(this.getDateFinCeremonie()));
	    	System.out.println("==============================================");
	    	if (this.presidentCeremonie!=null){
	    		System.out.println("\n◎ Cérémonie présidée par "+this.presidentCeremonie.getPrenom()+" "+this.presidentCeremonie.getNom()+".◎\n");
	    	}
	    	this.afficherActeursPresents();
			this.afficherRealPresents();
			
			this.afficherLesPrix();
	    }
	    
	    public void afficherLesPrix(){
	    	System.out.println("◢ Les prix décernés à la cérémonie "+ this.nomCeremonie+" sont : ◣");
	    	for(Prix prix: this.listePrix){
				System.out.println("\t"+prix.getTitrePrix());
				
				} ;
			System.out.println("");
	    }
	    // Constructeurs
	    // Les constructeurs ne permettent pas de créer une cérémonie incorrecte (sans lieux, date etc)
	    public Ceremonie(String nomCeremonie, String lieuxCeremonie){
	    	this.cloture = false;
	        this.nomCeremonie = nomCeremonie;
	        this.lieuxCeremonie = lieuxCeremonie;
	        this.listeActeursPresents = new ArrayList<Acteur>();
	        this.listeRealPresents = new ArrayList<Realisateur>();
	        
	        
	    }
	    // Sans invités
	     public Ceremonie(String nomCeremonie, String lieuxCeremonie, Date dateDebutCeremonie, Date dateFinCeremonie) throws Exception
	     {
	    	this.cloture = false;
	        this.nomCeremonie = nomCeremonie;
	        this.lieuxCeremonie = lieuxCeremonie;
	        this.dateDebutCeremonie = dateDebutCeremonie;
	        this.dateFinCeremonie = dateFinCeremonie;
	        this.listeActeursPresents = new ArrayList<Acteur>();
	        this.listeRealPresents = new ArrayList<Realisateur>();
	        this.jury=new Jury(nomCeremonie,(dateDebutCeremonie.getYear()+1900));
	        
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
	      @SuppressWarnings("deprecation")
		public Ceremonie(String nomCeremonie, String lieuxCeremonie, Date dateDebutCeremonie, Date dateFinCeremonie, List<Acteur> listeActeursPresents,List<Realisateur> listeRealPresents) 
	      {
	        this.nomCeremonie = nomCeremonie;
	        this.lieuxCeremonie = lieuxCeremonie;
	        this.dateDebutCeremonie = dateDebutCeremonie;
	        this.dateFinCeremonie = dateFinCeremonie;
	        this.listeActeursPresents = listeActeursPresents;
	        this.listeRealPresents = listeRealPresents;
	        this.jury=new Jury(nomCeremonie,(dateDebutCeremonie.getYear()+1900));
	    
	       
	        
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

		public Personne getPresidentCeremonie() {
			return presidentCeremonie;
		}

		public void setPresidentCeremonie(Personne presidentCeremonie) {
			this.presidentCeremonie = presidentCeremonie;
		}

		public List<Realisateur> getListeRealPresents() {
			return listeRealPresents;
		}

		public void setListeRealPresents(List<Realisateur> listeRealPresents) {
			this.listeRealPresents = listeRealPresents;
		}

		public static List<Ceremonie> getListeCeremonies() {
			return listeCeremonies;
		}

		public static void setListeCeremonies(List<Ceremonie> listeCeremonies) {
			Ceremonie.listeCeremonies = listeCeremonies;
		}

		public ArrayList<Prix> getListePrix() {
			return listePrix;
		}

		public void setListePrix(ArrayList<Prix> listePrix) {
			this.listePrix = listePrix;
		}

		public void setCloture(boolean cloture) {
			this.cloture = cloture;
		}

}
