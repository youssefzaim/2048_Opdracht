package The_Game;

import java.util.Objects;

public class Tegel {

    public int waarde;
    private int X;
    private int Y;

    public Tegel(int waarde) {
        this.waarde = waarde;
    }

    public Tegel() {
        this(0);
    }

    public int getWaarde() {
        return waarde;
    }

    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }

    public void setX(int x) {
        this.X = x;
    }

    public void setY(int y) {
        this.Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void verdubbel() {
        this.waarde = waarde * 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tegel tegel = (Tegel) o;
        return waarde == tegel.waarde;

    }

    @Override
    public int hashCode() {
        return Objects.hash(waarde);
    }
}
