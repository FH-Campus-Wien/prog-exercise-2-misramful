package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;
//import java.util.ArrayList;
//import com.sun.rowset.internal.Row;

public class App {
//für user programmieren
    //todo Task 1

    public void largestNumber() {

        Scanner scan = new Scanner(System.in);
        int start = 1;
        System.out.println("Number " + start + ": ");
        float number = scan.nextFloat();

        if (number <= 0) {
            System.out.println("No number entered.");
        }

        float highestnumber = 0; //muss integer initialisieren, 0 weil geringste Zahl ohne minuszahl zu sein
        while (number > 0) {          //while besser wenn unbekannt wie viele Zahlen
            if (number > highestnumber) {
                highestnumber = number;
            }
            start++; //außerhalb der Klammer, damit es nicht im if drinnen ist
            System.out.print("Number " + start + ": ");

            number = scan.nextFloat();
        }
        System.out.println("The largest number is " + String.format("%.2f", highestnumber));
    }
        //Scanner scanner = new Scanner(System.in);
        //double number = scanner.nextDouble();
        //while

        // input your solution here

    //todo Task 2
        //Schreiben Sie ein Programm, welches eine Integer Zahl (Anzahl der Zeilen) einliest und die
        // nachfolgende Ausgabe mit
        // Hilfe von zwei Schleifen auf der Konsole erzeugt. Die Eingabe von Zahlen kleiner
        //           gleich 0 ist nicht erlaubt und verursacht eine Fehlermeldung
   public void stairs() {
       System.out.println("n: ");
       Scanner scan = new Scanner(System.in);
       int number = scan.nextInt();

       if (number <= 0) {
           System.out.println("Invalid number!");
       }

       int y = 1; //muss außerhalb derSchleife deklarieren damit es weiter fortläuft (innerhalb der Schleife resetet es immer
       for (int rows = 0; rows < number; rows++) { //beziehen sich auf die Reihen
           for (int x = 0; x <= rows; x++) { //Menge der Schleifendurchläufe, x bezieht sich aufdie Spalten
               System.out.print(y + " ");
               y++;
           }
           System.out.println();
       }
   }

    //todo Task 3
    public void printPyramid() {

        int stars = 0;//brauche es hier, um unten damit arbeiten zu können pus brauche initilaisierung
        for (int rows = 6; rows > 0; rows--) { //sol lange größer null reihen weniger
            for (int columns = rows -1; columns > 0; columns--) { //ganz unten kein leerzeichen, wollen nur 5 leerzeichen und nicht 6
                System.out.print(" ");
            }

            for (int x = 0; x <= stars; x++) { //Menge der Schleifendurchläufe, x bezieht sich aufdie Spalten
                System.out.print("*"); //solange x kleiner sterne schleife geht einmal öfter
            }
            System.out.println("");
            stars = stars +2; //sterne gehen mehr rauf als spalten;   brauche von außen, dass Abbruchbedingung höher wird
        }
    }

/*
    //todo Task 4

    public void printRhombus(){
haben ungerade zahl gegeben,
dann for schleife, fangen mit der nullten Zahl an, aufwärts zählen und dann rückwärts
Tutorium
Scanner scan...
Achtung obere und untere Hälfte
sout ("h: ");
int h = scannextInt();
sout("c: ");
char c scan.next().charAT(0);

if (h % 2 == 1{

for(int i=0; i <= h/2; i+) {        i ist row
for(int i = 0; i<= h/2; i++){
   for(int j = i; j < h / 2; j++){    hier werden quasi 4 Leerzeichen geprinted, weil h/2
    sout (" ")
}
for (int k = 0 - i; k <= i; k++) {  Vorschleife kann weiterlaufen, k ist Verschiebung quasi
sout((char) (c - Math.abs(k)));    Math ist Methode abs erlaubt dass wir int lonf loat double casten
}                                   if a<0 -a else a;  bim uneren zählt aufwärts
sout();
Tutorium

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int h = scan.nextInt();
        System.out.print("h: ");
        char c = scan.next().charAt(0);
        System.out.print("c: ");

        if (h %2 == 1) {
            System.out.println("Invalid number!");
            return;  //return Anfang????

        }


    }
*/
    //todo Task 5
    public void marks(){
        Scanner scan = new Scanner(System.in);
        int countOfMarks = 1;
        System.out.println("Mark " + countOfMarks + ": ");
        int number = scan.nextInt();
        int countOfFive = 0;
        int allMarks = 0;
        float averageOfMarks;

        while (number != 0) {

            if (number < 0 || number > 5) {
                System.out.println("Invalid mark!");
                System.out.println("Mark " + ++countOfMarks + ": ");
                number = scan.nextInt();
            }

            if (number >= 1 && number <= 5) {
                if (number == 5) {
                    countOfFive++;
                }
                allMarks = allMarks + number;
                System.out.println("Mark " + ++countOfMarks + ": ");
                number = scan.nextInt();
            }
        }

        //System.out.println("countOfMarks: " + countOfMarks);
        //System.out.println("allMarks: " + allMarks);

        averageOfMarks = (float) allMarks / (float) countOfMarks;
        System.out.println("Average: " + String.format("%.2f", averageOfMarks));
        System.out.println("Negative marks: " + countOfFive);
    }

    /*
    //todo Task 6; power ist hochzeile
    public void happyNumbers(){

        Scanner scan = new Scanner(System.in);
        System.out.println("n: ");

        int number = scan.nextInt();
        int x = 0;

        do { x = (number % 10 * number % 10); //z.B. (30/10 = 0) * (30 oder 0/10 =  ); 31/10 = 1
            number = number / 10;
        }
        while number != 0;

        if x = 1 {
            System.out.println("Happy number!");
        }
        else {
            System.out.println("Sad number!");
        }
    }
    */

    public static void main(String[] args){
        App exercise2 = new App();
        /*
        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();
        */
        /*
        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();
        */
        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();
        /*
        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
        */
    }
}