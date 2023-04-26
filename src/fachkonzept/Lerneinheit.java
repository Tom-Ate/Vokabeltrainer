package fachkonzept;

import java.util.ArrayList;

public class Lerneinheit
{
	private ArrayList<Vokabel> dieAktuellenVokDaten;
	public Lerneinheit()
	{
		dieAktuellenVokDaten = new ArrayList<>();
	}
	public double calculateErrorRate(int numCorrect, int numIncorrect) {
	    double total = numCorrect + numIncorrect;
	    if (total == 0) {
	        return 0.0;
	    }
	    double errorRate = (double) numIncorrect / total;
	    return errorRate;
	} 
	public ArrayList<Vokabel> randomizedArray(ArrayList<Vokabel>pVokDaten,int pMenge) throws Exception
	{
		
		int PriortiyZusammen = 0;
		if(pVokDaten.size()<pMenge)
		{
			return pVokDaten;
		}
		if(pVokDaten.isEmpty())
		{
			throw new Exception("Fick die Arraylist da is nix dinna");
		}
		for(int i = 0; i < pVokDaten.size(); i++)
		{
			PriortiyZusammen += pVokDaten.get(i).liesPrioritaet();
		}
		for(int i = 0; i<pMenge; i++)
		{
			dieAktuellenVokDaten.add(pVokDaten.get((int) Math.random()*pVokDaten.size()+1));
		}
		
		
		return dieAktuellenVokDaten;
		
	}
}

