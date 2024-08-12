package Advanced_OOP1.Lab_4;

public class BT4 {
    public static void main(String args[]) {
        try {
            throw new MyException("GeeksGeeks");
        } catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}

// Mục đích của lớp Main là:
//Thực thi chương trình, nơi tạo và ném các ngoại lệ như 'MyException' sau đó bắt
// xử lý và bắt các ngoại lệ đó.
//Mục đích của lớp MyException là:
//Định nghĩa một lớp ngoại lệ tuỳ chỉnh kế thừa từ lớp 'Exception'. Nó giúp gán các thông điệp xảy ra
// khi lỗi và cũng giúp kiểm tra các chương trình của lớp main xem chưng trình đ́ó bị lỗi ko.
//Sau khi chạy chương trình thì nó sẽ in ra:
//Caught
//GeeksGeeks
//Lý do vì:
//Sau khi chạy MyException("GeeksGeeks"), nó sẽ bắt "GeeksGeeks" rồi sau đó
// trả về chuỗi đã nhập là "GeeksGeeks". Như câu lệnh sau:
//public MyException(String s) {
//    super(s);
//}
// Sau đó nó sẽ in ra "Caught" ; "GeeksGeeks" như câu lệnh sau:
//System.out.println("Caught");
//System.out.println(ex.getMessage());