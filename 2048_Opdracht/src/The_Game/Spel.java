package The_Game;

import java.util.Random;

public class Spel {
    private int score;
    private int highScore;
    private Random random = new Random();
    private final int size = 4;
    private Tegel[][] tegels = new Tegel[size][size];

    public Spel() {
        this.aanmakenRaster();
        this.nieuweTegel();
        this.nieuweTegel();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public void swipeLinks() {
        for(int i = 0; i< tegels.length; i++){
            for(int j = 1; j < tegels.length; j++) {
                if(tegels[i][j].getWaarde() != 0){
                    int k = 1;
                    while(j-k >=0 && tegels[i][j-k].getWaarde() == 0){
                        //if (tegels[i-k][j].getWaarde() == 0) {
                        //}
                        k++;
                    }
                    k--;
                    if (k != 0) {
                        tegels[i][j-k].setWaarde(tegels[i][j].getWaarde());
                        tegels[i][j].setWaarde(0); // lege tegel
                    }

                    if(j-k-1 >= 0 && tegels[i][j-k].equals(tegels[i][j-k-1])) {
                        tegels[i][j-k-1].verdubbel();
                        tegels[i][j-k].setWaarde(0);
                    }
                }
            }
        }
    }
    public void swipeRechts() {
        for(int i = 0; i< tegels.length; i++){
            for(int j = tegels.length-2; j >= 0; j--) {
                if(tegels[i][j].getWaarde() != 0){
                    int k = 1;
                    while(j+k <=3 && tegels[i][j+k].getWaarde() == 0){
                        //if (tegels[i-k][j].getWaarde() == 0) {
                        //}
                        k++;
                    }
                    k--;
                    if (k != 0) {
                        tegels[i][j+k].setWaarde(tegels[i][j].getWaarde());
                        tegels[i][j].setWaarde(0); // lege tegel
                    }

                    if(j+k+1 <= 3 && tegels[i][j+k].equals(tegels[i][j+k+1])) {
                        tegels[i][j+k+1].verdubbel();
                        tegels[i][j+k].setWaarde(0);
                    }
                }
            }
        }
    }

    public void swipeBeneden() {
        for(int i = tegels.length-2; i >= 0; i--){
            for(int j = 0; j < tegels.length ; j++) {
                if(tegels[i][j].getWaarde() != 0){
                    int k = 1;
                    while(i+k <=3 && tegels[i+k][j].getWaarde() == 0){
                        //if (tegels[i-k][j].getWaarde() == 0) {
                        //}
                        k++;
                    }
                    k--;
                    if (k != 0) {
                        tegels[i+k][j].setWaarde(tegels[i][j].getWaarde());
                        tegels[i][j].setWaarde(0); // lege tegel
                    }

                    if(i+k+1 <= 3 && tegels[i+k][j].equals(tegels[i+k+1][j])) {
                        tegels[i+k+1][j].verdubbel();
                        tegels[i+k][j].setWaarde(0);
                    }
                }
            }
        }
    }

    public void swipeBoven() {
        for(int i = 1; i< tegels.length; i++){
            for(int j = 0; j < tegels.length; j++) {
                if(tegels[i][j].getWaarde() != 0){
                    int k = 1;
                    while(i-k >=0 && tegels[i-k][j].getWaarde() == 0){
                        //if (tegels[i-k][j].getWaarde() == 0) {
                        //}
                        k++;
                    }
                    k--;
                    if (k != 0) {
                        tegels[i-k][j].setWaarde(tegels[i][j].getWaarde());
                        tegels[i][j].setWaarde(0); // lege tegel
                    }

                    if(i-k-1 >= 0 && tegels[i-k][j].equals(tegels[i-k-1][j])) {
                        tegels[i-k-1][j].verdubbel();
                        tegels[i-k][j].setWaarde(0);
                    }
                }
            }
        }
    }

    public int nieuweTegelWaarde() {
        int nieuw = (random.nextInt(2) + 1) * 2;
        return nieuw;
    }

    public boolean isRasterVol() {
        for (int i = 0; i < tegels.length; i++) {
            for (int j = 0; j < tegels.length; j++) {
                if (tegels[i][j].getWaarde() != 0)
                    return false;
            }
        }
        return true;
    }

    public void nieuweTegel() {
        Tegel tegel = new Tegel();

        int x,y;
        do {
            x = random.nextInt(4);
            y = random.nextInt(4);
        } while (tegels[x][y].getWaarde()!=0);
        tegel.setX(x);
        tegel.setY(y);

        tegel.setWaarde(nieuweTegelWaarde());

        tegels[tegel.getX()][tegel.getY()] = tegel;
    }

    private void aanmakenRaster() {
        for (int i = 0; i < tegels.length; i++) {
            for (int j = 0; j < tegels[i].length; j++) {
                tegels[i][j] = new Tegel();
            }
        }
    }

    public void printRaster() {
        for (int i = 0; i < tegels.length; i++) {
            for (int j = 0; j < tegels[i].length; j++) {
                if (tegels[i][j] != null) {
                    System.out.print(tegels[i][j].getWaarde() + " ");
                }
            }
            System.out.println();
        }
    }

    public void spelVerlaten() {

    }

    public void opnieuwBeginnen() {

    }

    public void verderSpelen() {

    }

    public boolean isGewonnen() {
        return true;
    }

    public boolean isVerloren() {
        return true;
    }

}

