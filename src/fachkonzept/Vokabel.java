package fachkonzept;

public class Vokabel
{
	private int vokabelNr;
	private String aufgabe;
	private String ergebnis;
	private boolean gekonnt;

	public Vokabel(int pVokabelNr,String pAufgabe, String pErgebnis, boolean pGekonnt)
	{
		vokabelNr = pVokabelNr;
		aufgabe = pAufgabe;
		ergebnis = pErgebnis;
		gekonnt = pGekonnt;
	}
	public int liesVokabelNr()
	{
		return vokabelNr;
	}
	public String liesAufgabe()
	{
		return aufgabe;
	}
	public String liesErgebnis()
	{
		return ergebnis;
	}
	public boolean liesGekonnt()
	{
		return gekonnt;
	}
	public boolean pruefeVermutung(String pVermutung)
	{
		if(pVermutung != ergebnis)
		{
			return false; 
		}
		else return true; 
	}
	public void setzeGekonnt(boolean pGekonnt)
	{
		gekonnt = pGekonnt;
	}
}
