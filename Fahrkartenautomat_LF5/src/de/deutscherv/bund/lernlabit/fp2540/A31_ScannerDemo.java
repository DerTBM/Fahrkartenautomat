package de.deutscherv.bund.lernlabit.fp2540;

import java.util.Scanner;

public class A31_ScannerDemo {

    static Scanner tastatur = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
        int ganzzahl = tastatur.nextInt();

        System.out.print("Bitte geben Sie eine Zahl mit Nachkommastellen ein: ");
        float kommazahl = tastatur.nextFloat();
        tastatur.nextLine(); // Buffer leeren

        System.out.print("Bitte geben Sie ein Wort ein: ");
        String wort = tastatur.nextLine();

        System.out.print("Bitte geben Sie einen Wahrheitswert ein (true / false): ");
        boolean wahrheitswert = tastatur.nextBoolean();

        System.out.print("Bitte geben Sie einen einzelnen Buchstaben ein: ");
        char buchstabe = tastatur.next().charAt(0);

        System.out.println();
        System.out.println("Sie haben " + ganzzahl + " eingegeben!");
        System.out.println("Sie haben " + kommazahl + " eingegeben!");
        System.out.println("Sie haben '" + wort + "' eingegeben!");
        System.out.println("Sie haben '" + wahrheitswert + "' eingegeben!");
        System.out.println("Sie haben '" + buchstabe + "' eingegeben!");

        tastatur.close();
    }
}
