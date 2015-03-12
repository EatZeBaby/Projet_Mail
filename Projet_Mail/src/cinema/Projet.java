package cinema;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

public class Projet {
	 
	public static void main (String[] args) throws Exception{
		System.out.println("Lancement du programme.");
		//Creation des dates de début et de fin de cérémonie
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
		dfm.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
		Date dateDebutCannes = dfm.parse("2015-05-26");
		Date dateFinCannes = dfm.parse("2015-05-27");
		Date dateElephant = dfm.parse("2003-10-03");
		Date dateInterstellar= dfm.parse("2014-11-05");
		
		
		
		//Création des Acteurs
		Acteur Jean 		= new Acteur("Dujardin","Jean",44,"Français");
		Acteur Tbow 		= new Acteur("Schlerette","Tbow",63,"Roumain");
		Acteur Nathalie 	= new Acteur("Portman","Nathalie",33,"Isrëlo-Américaine");
		Acteur Benedict 	= new Acteur("Cumberbatch","Benedict",38,"Brittanique");
		Acteur Alex 		= new Acteur("Frost","Alex",28,"Américain");
		Acteur Carrie 		= new Acteur("Finklea","Carrie",26,"Américaine");
		
		Acteur Matthew 		= new Acteur("McConaughey","Matthew",45,"Américaine");
		Acteur Anne 		= new Acteur("Hathaway","Anne",32,"Brittanique");
		Acteur Jessica 		= new Acteur("Chastain","Jessica",37,"Américaine");
		Acteur Michael 		= new Acteur("Caine","Michael",81,"Brittanique");
		Acteur Mackenzie 	= new Acteur("Foy","Mackenzie",14,"Américaine");
		
		//Création des Realisateurs
		Realisateur Gus 		= new Realisateur("Van Sant","Gus",55,"Américain");
		Realisateur Christopher = new Realisateur("Nolan","Christopher",44,"Brittanique");
		Realisateur Jonathan 	= new Realisateur("Nolan","Jonathan",38,"Brittanique");
		
		
		
		//Création des liste d'acteurs et de réalisateurs
		ArrayList<Acteur> 		listeActeursElephant 			= new ArrayList<Acteur>();
		ArrayList<Acteur> 		listeActeursInterstellar 		= new ArrayList<Acteur>();
		ArrayList<Realisateur> 	listeRealisateurElephant 		= new ArrayList<Realisateur>();
		ArrayList<Realisateur> 	listeRealisateurInterstellar 	= new ArrayList<Realisateur>();
		

		
		listeActeursInterstellar.add(Matthew);
		listeActeursInterstellar.add(Anne);
		listeActeursInterstellar.add(Jessica);
		listeActeursInterstellar.add(Michael);
		listeActeursInterstellar.add(Mackenzie);
		listeRealisateurInterstellar.add(Christopher);
		listeRealisateurInterstellar.add(Jonathan);
		
		listeActeursElephant.add(Carrie);
		listeActeursElephant.add(Alex);
		listeRealisateurElephant.add(Gus);
		
		
		
		//Création de Films
		Film Elephant 		= new Film("Elephant",3000000,listeActeursElephant,listeRealisateurElephant,dateElephant);
		Film Interstellar 	= new Film("Interstellar",165000000,listeActeursInterstellar,listeRealisateurInterstellar,dateInterstellar);
		
		//Création de la cérémonie
		Ceremonie Cannes 	= new Ceremonie("Festival de Cannes","Cannes", dateDebutCannes, dateFinCannes);
		
		//Création des prix
		@SuppressWarnings("deprecation")
		Prix MeilleurActeur 		= new Prix(Cannes,Cannes.getDateDebutCeremonie().getYear(),"Meilleur Acteur");
		Prix MeilleurActrice 		= new Prix(Cannes,Cannes.getDateDebutCeremonie().getYear(),"Meilleur Actrice");
		Prix MeilleurRealisateur 	= new Prix(Cannes,Cannes.getDateDebutCeremonie().getYear(),"Meilleur Réalisateur");
		Prix MeilleurSecondRole 		= new Prix(Cannes,Cannes.getDateDebutCeremonie().getYear(),"Meilleur Second Rôle");
		
		
		
		Cannes.inviterPersonne(Gus);
		Cannes.inviterPersonne(Jean);
		Cannes.inviterPersonne(Tbow);
		Cannes.inviterPersonne(Nathalie);
		Cannes.inviterPersonne(Alex);
		Cannes.inviterPersonne(Anne);
		Cannes.inviterPersonne(Michael);
		Cannes.inviterPersonne(Mackenzie);
		Cannes.inviterPersonne(Christopher);
		
		Cannes.setPresidentCeremonie(Gus);
		
		
		Cannes.ajouterAuJury(Gus);
		Cannes.ajouterAuJury(Jean);
		
		
		
		Cannes.description();
		
		Cannes.attribuerPrix(MeilleurActeur,Matthew,Interstellar);
		Cannes.attribuerPrix(MeilleurRealisateur,Gus,Elephant);
		Cannes.attribuerPrix(MeilleurRealisateur,Christopher,Interstellar);
		Cannes.attribuerPrix(MeilleurActrice,Anne,Interstellar);
		Cannes.attribuerPrix(MeilleurActeur,Tbow,Interstellar);
		Cannes.attribuerPrix(MeilleurSecondRole,Mackenzie,Interstellar);
		
		
		
		Cannes.cloturerCeremonie();
		
		
		
		
	}
	
	
	
}
