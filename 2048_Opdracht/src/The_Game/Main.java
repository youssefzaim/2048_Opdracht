package The_Game;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class Main {
    public static void main(String[] args) {
        Spel spel = new Spel();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Gebruik 8↑, 6→, 2↓, 4← om te swipen: ");
        int richting = keyboard.nextInt();
        System.out.println();

        System.out.println("START");
        spel.printRaster();
        System.out.println("-----------");
        do {
            if (richting == 8) {
                spel.swipeBoven();
                spel.nieuweTegel();
                spel.printRaster();
            }else if (richting == 6) {
                spel.swipeRechts();
                spel.nieuweTegel();
                spel.printRaster();
            }else if (richting == 4) {
                spel.swipeLinks();
                spel.nieuweTegel();
                spel.printRaster();
            }else if(richting == 2){
                spel.swipeBeneden();
                spel.nieuweTegel();
                spel.printRaster();
            }
        } while (spel.isRasterVol());
        }
    }

