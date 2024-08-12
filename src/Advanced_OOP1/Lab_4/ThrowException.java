package Advanced_OOP1.Lab_4;

public class ThrowException {

    static void fun() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw e;
        }

    }

    public static void main(String[] args) {
        try {
            fun();
        } catch (NullPointerException e
        ) {
            System.out.println("Caught in main.");
        }
    }
}
//Câu 2:
//Lệnh throw trong Java được sử dụng để ném một ngoại lệ. Nó cho phép bạn thông báo rằng một lỗi đã xảy ra
// và xử lý lỗi đó theo cách bạn định nghĩa.

//Câu 3:
//'NullPointerException' là một loại ngoại lệ trong Java, xảy ra khi bạn cố gắng sử dụng một đối
//tượng tham chiếu mà chưa được khởi tạo (có giá trị là null).
//NullPointerException với thông báo lỗi là "demo", và ném nó để báo hiệu rằng một lỗi đã xảy ra.

//Câu 4:
//Lệnh throw e; ném lại ngoại lệ e mà trước đó đã bị bắt (caught). Đây là cách để chuyền ngoại lệ lên
// cho phép ngoại lệ được xử lý ở nơi khác (trong Main) trong chương trình, nếu cần.

//Câu 5:
// nó sẽ in ra: "Caught inside fun()." và "Caught in main."