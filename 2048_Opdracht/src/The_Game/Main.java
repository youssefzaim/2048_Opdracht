package The_Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Spel spel = new Spel();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("2048");
        System.out.print("Gebruik w ↑, d →, s ↓, a ← om te swipen of druk q om te stoppen\n\n ");


        System.out.println("START");
        spel.printRaster();
        System.out.println("-------------------");
        do {
            spel.invoer = keyboard.next();
            System.out.println();
            if (spel.invoer.equals("w")) {
                System.out.printf("Score = %d     Highscore = %d\n", spel.getScore(), spel.getHighScore());
                spel.swipeBoven();
                spel.nieuweTegel();
                spel.printRaster();
                System.out.println("-------------------");
            } else if (spel.invoer.equals("d")) {
                System.out.printf("Score = %d     Highscore = %d\n", spel.getScore(), spel.getHighScore());
                spel.swipeRechts();
                spel.nieuweTegel();
                spel.printRaster();
                System.out.println("-------------------");
            } else if (spel.invoer.equals("a")) {
                System.out.printf("Score = %d     Highscore = %d\n", spel.getScore(), spel.getHighScore());
                spel.swipeLinks();
                spel.nieuweTegel();
                spel.printRaster();
                System.out.println("-------------------");
            } else if (spel.invoer.equals("s")) {
                System.out.printf("Score = %d     Highscore = %d\n", spel.getScore(), spel.getHighScore());
                spel.swipeBeneden();
                spel.nieuweTegel();
                spel.printRaster();
                System.out.println("-------------------");
            } else if (spel.spelVerlaten())
                return;
            else
                System.out.print("Gebruik w ↑, d →, s ↓, a ← om te swipen of druk q om te stoppen\n");
        } while (!(spel.isRasterVol()));
        System.out.printf("Score = %d     Highscore = %d\n", spel.getScore(), spel.getHighScore());
    }
}

