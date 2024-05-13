package OOP4.Point;

import java.util.Arrays;

public class Point {
    protected float x, y;

    Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[] {getX(), getY()};
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x: " + getX() + " y: " + getY();
    }


}