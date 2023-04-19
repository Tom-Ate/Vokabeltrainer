package fachkonzept;

public class VokDaten
{
	private int VokabelNr;
	private String sprache;
	private String vokabelE;
	private String vokabelD;
	private int KategorieNr;
	private int prioritaet;

	
	public VokDaten(int pVokabelNr,String pSprache, String pVokabelE, String pVokabelD, int pKategorieNr, int pPrioritaet)
	{
		VokabelNr = pVokabelNr;
		vokabelE = pVokabelE;
		vokabelD = pVokabelD;
		KategorieNr = pKategorieNr;
		sprache = pSprache;
		prioritaet = pPrioritaet;
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
	public String liesSprache()
	{
		return sprache;
	}
	public int liesPrioritaet()
	{
		return prioritaet;
	}
}

