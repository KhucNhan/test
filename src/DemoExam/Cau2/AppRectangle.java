package DemoExam.Cau2;

import DemoExam.Cau1.Rectangle;

public class AppRectangle {
    public static void main(String[] args) {
        CRUDRectangle crud = new CRUDRectangle();

        Rectangle rect1 = new Rectangle("Rect1", "Red", 10, 5);
        Rectangle rect2 = new Rectangle("Rect2", "Green", 6, 4);
        Rectangle rect3 = new Rectangle("Rect3", "Blue", 8, 3);

        crud.addRectangle(rect1);
        crud.addRectangle(rect2);
        crud.addRectangle(rect3);

        String filename = "Rectangles.dat";
        crud.addRectangleToFile(rect1, filename);
        crud.addRectangleToFile(rect2, filename);
        crud.addRectangleToFile(rect3, filename);

        System.out.println();
        System.out.println("Thông tin của 1 hình chữ nhật từ file:");
        Rectangle rectFromFile = crud.getRectangleFromFile(rect2.getShapeName() + ".dat");
        System.out.println(rectFromFile);

        crud.addRectangleListToFile(new Rectangle[]{rect1, rect2, rect3}, filename);

        System.out.println();
        System.out.println("Danh sách tất cả hình chữ nhật từ file:");
        Rectangle[] allRectangles = crud.getAllRectangleFromFile(filename);
        for (Rectangle rect : allRectangles) {
            System.out.println(rect);
        }
    }
}
