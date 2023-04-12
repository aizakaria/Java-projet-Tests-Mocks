package Exercice1;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
	private String name;
	//HashMap<String, String> traduction = new HashMap<String, String>();
	HashMap<String,ArrayList<String>> traduction =new HashMap<String,ArrayList<String>>();
	
	public Dictionary()
	{
		
	}
	public Dictionary(String name)
	{
		this.name = name ;
	}
	public String getName() {
		return name;
	}
	
	// EXERCICE 2
//	public void addTranslation(String fr , String en)
//	{
//		traduction.put(fr, en);
//	}
//	public String getTranslation(String word)
//	{
//		return traduction.get(word);
//	}
	
	// EXERCICE 3
	public void addTranslation(String fr , String en)
	{
		if(traduction.containsKey(fr))
		{
				traduction.get(fr).add(en);
		}
		else
		{	
			ArrayList<String> ajout = new ArrayList<String>(); 
			ajout.add(en);
			traduction.put(fr, ajout);
		}
	}
	
	public ArrayList<String> getTranslation(String word)
	{
		return traduction.get(word);
	}
	
	public ArrayList<String> getMultipleTranslation(String word)
	{
		return traduction.get(word);
	}
	
	//Exercice 4
	
	public String getBiTranslation(String word)
	{
		
	}
	
}
