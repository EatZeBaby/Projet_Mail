package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import cinema.Acteur;
import cinema.Ceremonie;
import cinema.Film;
import cinema.Prix;


public class ActeurTest {
	
	
	@Test
	public void testAjouterFilm(){
		Acteur Jean = new Acteur("Dujardin","Jean",44,"Français");
		if (Jean.getListeFilms().size()>0){
			fail("Erreur creation Acteur"); 
		}
	
		Film The_Artist = new Film("The Artist");
		Jean.ajouterFilm(The_Artist);
		
		if ((Jean.getListeFilms().size()!=1)&&(Jean.getListeFilms().get(0).getNomFilm())!=The_Artist.getNomFilm()){
			fail("Erreur ajout Film"); 
		}
	}
	
		
	@Test
	public void testAjouterPrix(){
		Ceremonie Cannes = new Ceremonie("Festival de Cannes","Cannes");
		Acteur Jean = new Acteur("Dujardin","Jean",44,"Français");
		
		if (Jean.getListePrix().size()>0){
			fail("Erreur creation Acteur"); 
		}
	
		Prix prix = new Prix(Cannes,2014,"Meilleur Acteur");
		Jean.ajouterPrix(prix);
		
		if ((Jean.getListePrix().size()!=1)&&(Jean.getListePrix().get(0).getTitrePrix())!=prix.getTitrePrix()){
			fail("Erreur ajout Prix"); 
		}
	}	
}
