package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Exceptions.AnimalDansMauvaisSecteurException;
import Exceptions.LimiteVisiteurExpetion;
import zoo.Animal;
import zoo.Chat;
import zoo.Secteur;
import zoo.TypeAnimal;
import zoo.Zoo;

public class ZooTest {

	@Test
	public void testGetLimiteVisiteur() throws LimiteVisiteurExpetion {
		Zoo zoo = new Zoo();
		
		Secteur sChat=new Secteur(TypeAnimal.CHAT);
		Secteur sChien=new Secteur(TypeAnimal.CHIEN);
	
		
		zoo.ajouterSecteur("CHAT");
		zoo.ajouterSecteur("CHIEN");
		
		zoo.nouveauVisiteur();
		zoo.nouveauVisiteur();
		//zoo.nouveauVisiteur();

		assertEquals(2,zoo.getVisiteurs());

	}	
	@Test
	public void testAnimauxDansSecteurs(){
	
	/*Zoo zoo = new Zoo();
		
		Animal a1 = new Animal("Delio",TypeAnimal.CHIEN);
		
		zoo.ajouterSecteur("CHAT");
		
		try {
			zoo.nouvelAnimal(a1);
		} catch (AnimalDansMauvaisSecteurException e )  {
			// TODO Auto-generated catch block
			e=new AnimalDansMauvaisSecteurException("Animal dans muavais secteur");
			e.printStackTrace();
		
		}
		assertEquals("animal dans le mauvais secteur",1,zoo.nombreAnimaux());*/

	}	
	@Test
	public void testSecteurComparator()
	{
		Secteur secteur1 = new Secteur(TypeAnimal.CHAT);
		Secteur secteur2 = new Secteur(TypeAnimal.CHIEN);
		
		assertEquals(0,secteur1.compareTo(secteur2));

		secteur1.ajouterAnimal(new Chat("Rex"));


		assertTrue(secteur1.compareTo(secteur2)> 0);
		assertTrue(secteur2.compareTo(secteur1)< 0);


	}

}
