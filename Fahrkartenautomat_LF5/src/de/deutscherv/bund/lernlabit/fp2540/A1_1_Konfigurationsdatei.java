package de.deutscherv.bund.lernlabit.fp2540;

public class A1_1_Konfigurationsdatei {
	public static void main(String[] args) {
		String device = "Automat AVR Q2021_FAB_A";
		char lang = 'd';			// Wichtig hier: char wird mit '' angegeben
		byte pruefnummer = 4;
		double fuellstand = 53.76;
		int eurosumme = 142;
		int restsumme = 80;
		boolean status = true;
		
		
		System.out.println("Name: " + device);
		System.out.println("Sprache: " + lang);
		System.out.println("Prüfnummer: " + pruefnummer);
		System.out.println("Füllstand: " + fuellstand + "%");
		System.out.println("Summe Euro: " + eurosumme + " Euro");
		System.out.println("Summe Rest: " + restsumme + " Cent");
		System.out.println("Status: " + status);
		
	}
}
