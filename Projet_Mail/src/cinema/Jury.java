package cinema;

import java.util.ArrayList;

public class Jury {
	
	
	private ArrayList <Personne> ListeDesMembresDuJury;
	private String nomCeremonie;
	private int annee;
	
	public Jury(String nomCeremonie, int annee){
		this.ListeDesMembresDuJury=new ArrayList<Personne>();
		this.nomCeremonie=nomCeremonie;
		this.annee=annee;
	}
	
	public boolean appartient(Personne p){
		boolean res=false;
		for(int i=0; i<this.ListeDesMembresDuJury.size();i++){
			if((p.getNom()==this.ListeDesMembresDuJury.get(i).getNom())
					&&(p.getPrenom()==this.ListeDesMembresDuJury.get(i).getPrenom())){
				res=true;
			}
		}
		return res;
	}
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
	
	public String getNomCeremonie(){
		return this.nomCeremonie;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	public void ajouter(Personne p){
		this.ListeDesMembresDuJury.add(p);
	}
	

}
