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

	public ArrayList<Vokabel> liesVokabeln() throws Exception
	{
		oeffneDatenbank();
		ArrayList<Vokabel> vokabeln = new ArrayList<>();

		// lesende SQL-Abfrage and die Datenbank
		String sqlStmt = "SELECT VokabelNr, Uebersetzung, Fremdsprach-Vokabel";
		sqlStmt += "FROM Uebersetzung, Fremdsprach-Vokabeln";

		try
		{
			stmt = con.prepareStatement(sqlStmt);
			rs = stmt.executeQuery();
			while (rs.next())
			{
				vokabeln.add(new Vokabel(rs.getInt("VokabelNr"),
						rs.getString("Uebersetzung"),
						rs.getString("Fremdsprach-Vokabel"), false));
			}
		}
		catch (SQLException e)
		{
			throw new Exception("Fehler beim lesen der Daten");
		}
		schließeDatenbank();
		return vokabeln;
	}

	public void schreibeVokabeln(String pDateiname, ArrayList<Vokabel> pVokDaten)
	{
		
	}

	public void oeffneDatenbank() throws Exception
	{
		try
		{
			// �ffnet und verbindet mit der datenbank
			con = DriverManager.getConnection(
					"jdbc:ucanaccess://C:/temp/Vok_Data_Base.accdb");
		}
		catch (SQLException e)
		{
			throw new Exception("Fehler beim öffnen der Datenbank");
		}
	}

	public void schließeDatenbank() throws Exception
	{
		try
		{
			if (rs != null)
			{
				rs.close();
			}
			stmt.close();
			con.close();
		}
		catch (SQLException e)
		{
			throw new Exception("Fehler beim Schließen der DAtenbank");
		}
	}
}
