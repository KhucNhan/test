package DemoExam.Cau2;

import Advanced_OOP1.Lab5_IO.BT6.SinhVien;
import DemoExam.Cau1.Rectangle;

import java.io.*;
import java.util.ArrayList;

public class CRUDRectangle {
    private static Rectangle[] rectangles;
    private int count = 0;

    public CRUDRectangle() {
        rectangles = new Rectangle[100];
    }

    public boolean addRectangle(Rectangle objRectangle) {
        rectangles[count++] = objRectangle;
        return rectangles.length == count;
    }

    public boolean addRectangleToFile(Rectangle objRectangle, String filename) {
        filename = objRectangle.getShapeName() + ".dat";
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(objRectangle);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Rectangle getRectangleFromFile(String filename) {
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (Rectangle) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean addRectangleListToFile(Rectangle[] listRectangle, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Rectangle rect : listRectangle) {
                if (rect != null) {
                    oos.writeObject(rect);
                }
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Rectangle[] getAllRectangleFromFile(String filename) {
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            ArrayList<Rectangle> rectangleList = new ArrayList<>();
            try {
                while (true) {
                    Rectangle rect = (Rectangle) ois.readObject();
                    rectangleList.add(rect);
                }
            } catch (EOFException eof) {

            }
            return rectangleList.toArray(new Rectangle[0]);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
