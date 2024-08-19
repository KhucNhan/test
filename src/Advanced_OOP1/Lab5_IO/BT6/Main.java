package Advanced_OOP1.Lab5_IO.BT6;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        saveObjectToFile("1", "Nhan",10,10,10);
        readObjectFromFile();
    }

    public static boolean saveObjectToFile(String id, String name, int toan, int ly, int hoa) {
        SinhVien SinhVien = new SinhVien(id,name,toan,ly,hoa);

        try (FileOutputStream fileOut = new FileOutputStream("SinhVien.dat");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            // Ghi đối tượng vào file
            objectOut.writeObject(SinhVien);
            System.out.println("Đối tượng đã được lưu vào file SinhVien.dat");
            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void readObjectFromFile() {
        try (FileInputStream fileIn = new FileInputStream("SinhVien.dat");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            // Đọc đối tượng từ file
            SinhVien sv = (SinhVien) objectIn.readObject();
            System.out.println("Đọc đối tượng từ file: " + sv.getName());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
