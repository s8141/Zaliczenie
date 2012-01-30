package com.pl.kasia.services;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import studia.Lekcja;
import studia.Student;



public class LekcjaDBManager {
	
	private Connection conn;
	private Statement StworzTabele;
	private PreparedStatement DodajLekcjeStmt;
	private PreparedStatement PobierzLekcjeStmt;
	private PreparedStatement ZnajdzLekcjePoNazwieStmt;
	private PreparedStatement UsunLekcjeStmt;
	 

	
	public LekcjaDBManager(){
		
		try {
		conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
		StworzTabele = conn.createStatement();
		ResultSet wynik = conn.getMetaData().getTables(null, null, null, null);
		boolean LekcjaTableExists=false;
		while(wynik.next())
		{
		if("Lekcja".equalsIgnoreCase(wynik.getString("Table_Name")))
		{
		LekcjaTableExists=true;
		break;
		}
		}
		if(!LekcjaTableExists)
		{
		StworzTabele.executeUpdate("" +
		"CREATE TABLE Lekcja(" +
		"Nazwa bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY, " +
		"Nazwa varchar(20)");
		}
		DodajLekcjeStmt = conn.prepareStatement("" +"INSERT INTO Lekcja (Nazwa) VALUES (?)" +"");
		PobierzLekcjeStmt = conn.prepareStatement("" +"SELECT * FROM Lekcja " +"");
		ZnajdzLekcjePoNazwieStmt = conn.prepareStatement("SELECT * FROM Lekcja WHERE Nazwa= ?");
		UsunLekcjeStmt = conn.prepareStatement("DELETE FROM Lekcja WHERE Nazwa = ?");
	
		} catch (SQLException e) {

		e.printStackTrace();
		}
		}
	public List<Integer> ZnajdzLekcjePoNazwie (String nazwa) {
		try {
		List<Integer> wyszukane = new ArrayList<Integer>();
		ZnajdzLekcjePoNazwieStmt.setString(1, nazwa);
		ResultSet wynik = ZnajdzLekcjePoNazwieStmt.executeQuery();
		while (wynik.next())
		wyszukane.add(wynik.getInt("Nazwa"));
		return wyszukane;
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return null;
		}

	
	public void DodajLekcje(Lekcja L)
	{
		try {
			DodajLekcjeStmt.setString(1, L.getNazwa());

			DodajLekcjeStmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public List<Lekcja> PobierzLekcje (){
		List<Lekcja> lekcje =new ArrayList<Lekcja>();

		try {
		ResultSet wynik = PobierzLekcjeStmt.executeQuery();

		while(wynik.next())
		{
		lekcje.add(new Lekcja(wynik.getString("Nazwa")));
		}

		} catch (SQLException e) {

		e.printStackTrace();
		}

		return lekcje;
		}

	public void UsunLekcje(List<Integer> Lekcje) {
		try {
		for (Integer nazwa : Lekcje) {
			
			UsunLekcjeStmt.setInt(1, nazwa);
			UsunLekcjeStmt.executeUpdate();
			}
		} 
		catch (SQLException e) {
		e.printStackTrace();
		}
	}



}