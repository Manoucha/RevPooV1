package Exceptions;

public class AnimalDansMauvaisSecteurException  extends Exception{

	  public AnimalDansMauvaisSecteurException() {
	    super();
	    System.out.println("execption animal mauvais secteur levée");
	  }

	  public AnimalDansMauvaisSecteurException(String s) {
	    super(s);
	  }
} 