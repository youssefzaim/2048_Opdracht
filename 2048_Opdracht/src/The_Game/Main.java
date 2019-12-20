package The_Game;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class Main {
    public static void main(String[] args) {
        Spel spel = new Spel();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Gebruik w ↑, d →, s ↓, a ← om te swipen of druk q om te stoppen\n\n ");


        System.out.println("START");
        spel.printRaster();
        System.out.println("-------------------");
        do {
            spel.invoer = keyboard.next();
            System.out.println();
            if (spel.invoer.equals("w")) {
                spel.swipeBoven();
                spel.nieuweTegel();
                spel.printRaster();
                System.out.println("-------------------");
            }else if (spel.invoer.equals("d")) {
                spel.swipeRechts();
                spel.nieuweTegel();
                spel.printRaster();
                System.out.println("-------------------");
            }else if (spel.invoer.equals("a")) {
                spel.swipeLinks();
                spel.nieuweTegel();
                spel.printRaster();
                System.out.println("-------------------");
            }else if(spel.invoer.equals("s")){
                spel.swipeBeneden();
                spel.nieuweTegel();
                spel.printRaster();
                System.out.println("-------------------");
            }
        } while (!(spel.isRasterVol() || spel.spelVerlaten()));
        }
    }

