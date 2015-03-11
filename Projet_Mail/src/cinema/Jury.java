package cinema;

import java.util.ArrayList;

public class Jury {
	
	
	private ArrayList <Personne> ListeDesMembresDuJury;
	private String nomCeremonie;
	private int annee;
	
	public void  getListeDesMembresDuJury() {
		System.out.println("Les membres du jury de la Ceremonie" + nomCeremonie + "sont :");
		for(Personne membre: this.ListeDesMembresDuJury){
			System.out.println(membre.getPrenom()+" "+membre.getPrenom());
			
			} ;
	}
	public void setListeDesMembresDuJury(ArrayList <Personne> listeDesMembresDuJury) {
		ListeDesMembresDuJury = listeDesMembresDuJury;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	

}
