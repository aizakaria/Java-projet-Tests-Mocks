package Exercice1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DictionaryTest 
{
	
	private Dictionary dictionary = new Dictionary();
	
	@Test
	// méthode test EXERCICE 1
	public void getNametest()
	{
		if(dictionary.getName()==null) 
		{
			System.out.println("Test du dictionnaire vide");
		}
	}
	@Test
	// EXERCICE 2
	public void getTranslationTest()
	{
		if(dictionary.traduction.isEmpty()) 
		{
			System.out.println("Test du hashmap vide");
		}
	}
	
	
}

	

