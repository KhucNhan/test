package OOP4;

import java.util.Arrays;

public class MoveablePoint extends Point{
    private float xSpeed, ySpeed;

    MoveablePoint() {
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    MoveablePoint(float xSpeed, float ySpeed) {
//        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MoveablePoint(float xSpeed, float ySpeed, float x, float y) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{getxSpeed(), getySpeed()};
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "x: " + x + " y: " + y + " speed: " + Arrays.toString(getSpeed());
    }

    public MoveablePoint move() {
        this.x += xSpeed;
        this.y += ySpeed;
        return this;
    }
}
