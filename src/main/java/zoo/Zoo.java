package zoo;

import java.util.ArrayList;
import java.util.List;

import Exceptions.AnimalDansMauvaisSecteurException;
import Exceptions.LimiteVisiteurExpetion;

public class Zoo {

	private int visiteurs;
	private List<Secteur> secteursAnimaux;
	private String name;
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setVisiteurs(int visiteurs) {
		this.visiteurs = visiteurs;
	}
	public Zoo() {
		super();
		this.visiteurs = 0;
		this.secteursAnimaux = new ArrayList<Secteur>();
	}
	public int getVisiteurs() {
		return visiteurs;
	}
	public void setVisiteurs(int visiteurs,String name) {
		this.visiteurs = visiteurs;
		this.name=name;
	}
	public List<Secteur> getSecteursAnimaux() {
		return secteursAnimaux;
	}
	public void setSecteursAnimaux(List<Secteur> secteursAnimaux) {
		this.secteursAnimaux = secteursAnimaux;
	}
	
	public void ajouterSecteur(String secteur)
	{
		if(secteur.equals("CHAT"))
		this.secteursAnimaux.add(new Secteur(TypeAnimal.CHAT));
		else if(secteur.equals("CHIEN"))
		this.secteursAnimaux.add(new Secteur(TypeAnimal.CHIEN));

	}
	
	
	public void nouveauVisiteur() throws LimiteVisiteurExpetion
	{
		if(visiteurs == getLimiteVisiteur() ) {
			throw new LimiteVisiteurExpetion("VOUS AVEZ DEPASSÉ LE NOMBRE !!!!");
		}
		this.visiteurs++;
	}
	
	public int getLimiteVisiteur()
	{
		return 1*this.secteursAnimaux.size();
	}
	public void nouvelAnimal(Animal a) throws AnimalDansMauvaisSecteurException
	{
		if (a.typeAnimal.toString().equals("CHIEN"))
		{
			for(int i = 0; i<this.secteursAnimaux.size();i++)
			{
				if(this.secteursAnimaux.get(i).getTypeAnimauxDansSecteur().toString().equals("CHIEN"))
				{
					this.secteursAnimaux.get(i).ajouterAnimal(a);
				}
			}
		}else if(a.typeAnimal.toString().equals("CHAT"))
		{
			for(int i = 0; i<this.secteursAnimaux.size();i++)
			{
				if(this.secteursAnimaux.get(i).getTypeAnimauxDansSecteur().toString().equals("CHAT"))
				{
					this.secteursAnimaux.get(i).ajouterAnimal(a);
				}
			}
			 
				
	}
		

	}
	public int nombreAnimaux()
	{
		int nb=0;
	
		for(int i = 0; i<this.secteursAnimaux.size();i++)
		{
			nb+=this.secteursAnimaux.get(i).getAnimauxDansSecteur().size();
			
		}
		return nb;
	}
	
}
