package OOP4.Point2D_3D;

public class Point3D extends Point2D{
    private float z;
    Point3D() {
        super();
    }

    Point3D(float z, float x, float y) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] {getX(), getY(), getZ()};
    }

    public String toString() {
        return "x: " + getX() + " y: " + getY() + " z: " + getZ();
    }
}
