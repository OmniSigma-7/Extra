package bsu.comp152;

import java.awt.*;

public class Point {
    private int x;
    private int y;
    private Component bottomLeft;
    private java.awt.Point topRight;


    public boolean Point(Rectangle other) {
        if (this.topRight.getX() < other.bottomLeft.getX()
                || this.bottomLeft.getY() > other.topRight.getY()) {
            return false;
        }
        if (this.topRight.getY() < other.bottomLeft.getY()
                || this.bottomLeft.getX() > other.topRight.getX()) {
            return false;
        }
        return true;
    }

    private int getY() {
        return 0;
    }

    private int getX() {
        return 0;
    }
}
