package fachkonzept;

public class VokDaten
{
	private int VokabelNr;
	private String vokabelE;
	private String vokabelD;
	private int KategorieNr; 
	
	public VokDaten(int pVokabelNr, String pVokabelE, String pVokabelD, int pKategorieNr)
	{
		VokabelNr = pVokabelNr;
		vokabelE = pVokabelE;
		vokabelD = pVokabelD;
		KategorieNr = pKategorieNr;
	}
	
	public int liesVokabelNr()
	{
		return VokabelNr;
	}
	public String liesVokabelE()
	{
		return vokabelE;
	}
	public String liesVokabelD()
	{
		return vokabelD;
	}
	public int liesKategorieNr()
	{
		return KategorieNr;
	}
}
