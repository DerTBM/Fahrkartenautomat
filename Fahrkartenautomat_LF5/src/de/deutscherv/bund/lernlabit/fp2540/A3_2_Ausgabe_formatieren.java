package de.deutscherv.bund.lernlabit.fp2540;

public class A3_2_Ausgabe_formatieren {
	public static void main(String[] args) {
		// Aufgabe 1
		String s = "*";
		
		System.out.printf("%5s", s);
		System.out.printf("%s \n", s);
		System.out.printf("%s ", s);
		System.out.printf("%8s \n", s);
		System.out.printf("%s ", s);
		System.out.printf("%8s \n", s);
		System.out.printf("%5s", s);
		System.out.printf("%s \n", s);
		
		// Trenner
		System.out.println("=============================");
		
		// Aufgabe 2
        System.out.println("Aufgabe 2 - Tabelle");

        System.out.printf("%-12s | %10s%n", "Fahrenheit", "Celsius");
        System.out.println("------------- ------------");

        System.out.printf("%-12d | %10.2f%n", -20, -28.8889);
        System.out.printf("%-12d | %10.2f%n", -10, -23.3333);
        System.out.printf("%+-12d | %10.2f%n", +0,   -17.7778);
        System.out.printf("%+-12d | %10.2f%n", +20,  -6.6667);
        System.out.printf("%+-12d | %10.2f%n", +30,  -1.1111);
	}
}
