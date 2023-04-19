package fachkonzept;

import java.io.BufferedReader;
import java.io.FileReader;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Speicher
{
	private Connection con; // Verbindung zur Datenbank
	private PreparedStatement stmt; // Anfrage an die Datenbank 
	private ResultSet rs; // ergebnis der Datenbank 
	
	public VokDaten[] liesVokabeln(String pDateiname) throws Exception
	{
		try
		{
			// �ffnet und verbindet mit der datenbank
			con = DriverManager.getConnection(
					"jdbc:ucanaccess://C:/temp/Vok_Data_Base.accdb");
		}
		catch (SQLException e)
		{
			throw new Exception("Fehler beim Öffnen der Datenbank!");
		}
		
		P
		
	}
	
	public void schreibeVokabeln(String pDateiname, VokDaten[] pVokDaten)
	{
		
	}
}
