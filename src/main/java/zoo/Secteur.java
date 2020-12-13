package zoo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Secteur implements Comparable<Secteur> ,Comparator<Secteur>{
	
	private TypeAnimal typeAnimauxDansSecteur;
	private List<Animal> animauxDansSecteur;
	
	
	
	public String obtenirType() 
	{
		return this.typeAnimauxDansSecteur.toString();
	}
	
	public  int getNombreAnimaux()
	{
		return this.animauxDansSecteur.size();
	}
	 public void ajouterAnimal(Animal a)
	 {
		 this.animauxDansSecteur.add(a);
	 }
	
	
	 public Secteur(TypeAnimal typeAnimauxDansSecteur) {
		super();
		this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
		this.animauxDansSecteur  = new ArrayList<Animal>();
	}




	public Secteur() {
		super();
		this.animauxDansSecteur  = new ArrayList<Animal>();
	}








	public TypeAnimal getTypeAnimauxDansSecteur() {
		return typeAnimauxDansSecteur;
	}








	public void setTypeAnimauxDansSecteur(TypeAnimal typeAnimauxDansSecteur) {
		this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
	}




	public List<Animal> getAnimauxDansSecteur() {
		return animauxDansSecteur;
	}



	public void setAnimauxDansSecteur(List<Animal> animauxDansSecteur) {
		this.animauxDansSecteur = animauxDansSecteur;
	}

	public int compareTo(Secteur o) {
		// TODO Auto-generated method stub
		return getNombreAnimaux() - o.getNombreAnimaux();
	}

	public int compare(Secteur o1, Secteur o2) {
		// TODO Auto-generated method stub
		return o1.getNombreAnimaux() - o2.getNombreAnimaux();
	}









}
