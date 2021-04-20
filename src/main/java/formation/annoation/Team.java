package formation.annoation;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(scopeName = "prototype")
public class Team {

	private String nomEquipe;
	private int nbJoueurs;
	private List<Coach> listeCoach=new ArrayList<Coach>();
	public Team() {
	
	}
	public Team(String nomEquipe, int nbJoueurs) {
		this.nomEquipe = nomEquipe;
		this.nbJoueurs = nbJoueurs;
	}

	
	
	public String getNomEquipe() {
		return nomEquipe;
	}
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}
	public int getNbJoueurs() {
		return nbJoueurs;
	}
	
	public void setNbJoueurs(int nbJoueurs) {
		this.nbJoueurs = nbJoueurs;
	}
	
	public List<Coach> getListeCoach() {
		return listeCoach;
	}
	
	public void setListeCoach(List<Coach> listeCoach) {
		this.listeCoach = listeCoach;
	}
	
	
	

}
