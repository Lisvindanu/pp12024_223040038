/*
 * Author : Lisvindanu
 */

package Latihan12;

public class vertex {
    private char label; // label (cth 'A')
    private  boolean wasVisited;

    public vertex(char label) {
        // construktor
        this.label = label;
        wasVisited = false;
    }

    //getter setter

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public boolean isWasVisited() {
        return wasVisited;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}
