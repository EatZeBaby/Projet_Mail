package cinema;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Projet {
	 
	public static void main (String[] args) throws Exception{
		System.out.println("Lancement du programme.");
		//Creation des dates de début et de fin de cérémonie
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
		dfm.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
		Date dateDebut = dfm.parse("2015-05-26");
		Date dateFin = dfm.parse("2015-05-27");
		
		//Création de la cérémonie
		Ceremonie Cannes = new Ceremonie("Festival de Cannes","Cannes", dateDebut, dateFin);
		Cannes.description();
		//Création des Acteurs
		Acteur Jean = new Acteur("Dujardin","Jean",44,"Français");
		Acteur Tbow = new Acteur("Schlerette","Tbow",63,"Roumain");
		
		//Création des Realisateurs
		Realisateur Gus = new Realisateur("Van Sant","Gus",55,"Américain");
		Cannes.inviterPersonne(Gus);
		Cannes.inviterPersonne(Jean);
		Cannes.inviterPersonne(Tbow);
		
		Cannes.afficherActeursPresents();
		Cannes.afficherRealPresents();
		
		
		
		
		
	}
	
	
	
}
