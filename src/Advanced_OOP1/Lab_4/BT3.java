package Advanced_OOP1.Lab_4;

public class BT3 {
    public static void main(String[] args) {
        // Initializing String variable with null value
        String str = null;
        String message = (str == null) ? "" :
                str.substring(0, 5);
        System.out.println(message);

        // Initializing String variable with null value
        str = "Geeksforgeeks";
        message = (str == null) ? "" : str.substring(0, 5);
        System.out.println(message);
    }
}
//Sau khi chạy chương trình nó sẽ in ra:
//
//Geaks
//Lý do: Vì str được gán bằng Null mà 'message = (str == null) ? "" :' là cái điều kiện xảy ra
// nếu str = null thì nó sẽ cho message = ""; neu str khác null thì nó sẽ cho message = str.substring(0, 5);
//và in ra 5 chữ cái đầu của str.