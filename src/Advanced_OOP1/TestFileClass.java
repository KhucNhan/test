package Advanced_OOP1;

public class TestFileClass {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("image/us.gif");
        System.out.println("is exist ? " + file.exists());
        System.out.println("byte amount ? " + file.length());
        System.out.println("can be read ? " + file.canRead());
        System.out.println("can be written ? " + file.canWrite());
        System.out.println("is directory ? " + file.isDirectory());
        System.out.println("is file ? " + file.isFile());
        System.out.println("is absolute ? " + file.isAbsolute());
        System.out.println("is hidden ? " + file.isHidden());
        System.out.println("absolute path: " + file.getAbsolutePath());
        System.out.println("last modified: " + new java.util.Date(file.lastModified()));

    }
}