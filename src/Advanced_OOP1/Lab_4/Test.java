package Advanced_OOP1.Lab_4;

//import java.util.Scanner;
//
//public class Test {
//    public static void main(String args[]) {
//        Scanner scn = new Scanner(System.in);
//        try {
//            int n = Integer.parseInt(scn.nextLine());
//
//            if (99 % n == 0)
//                System.out.println(n + " is a factor of 99");
//        } catch (ArithmeticException ex) {
//            System.out.println("Arithmetic " + ex);
//        } catch (NumberFormatException ex) {
//            System.out.println("Number Format Exception " + ex);
//        }
//    }
//}

//Câu 1:
//1. catch (ArithmeticException ex): Dùng để bắt lỗi liên quan đến toán học, chẳng hạn như phép chia cho 0.
//2. catch (NumberFormatException ex): Dùng để bắt lỗi khi chuỗi nhập vào không thể
// chuyển đổi thành số nguyên.

//Câu 3:
//Sau khi nhập 'GeeksforGeeks', nó sẽ in ra:
//Number Format Exception java.lang.NumberFormatException: For input string: "GeeksforGeeks".

//Câu 4:
//Sau khi nhập '0', nó sẽ in ra:
//Arithmetic java.lang.ArithmeticException: / by zero

//Câu 5:

import java.util.Scanner;

public class Test
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        try
        {
            int n = Integer.parseInt(scn.nextLine());
            if (99%n == 0)
                System.out.println(n + " is a factor of 99");
        }
        catch (NumberFormatException | ArithmeticException ex)
        {
            System.out.println("Exception encountered " + ex);
        }
    }
}

//Câu 6:
//Sau khi nhập 'GeeksforGeeks', nó sẽ in ra:
//Exception encountered java.lang.NumberFormatException: For input string: "GeeksforGeeks".
//Sau khi nhập '0', nó sẽ in ra:
//Exception encountered java.lang.ArithmeticException: / by zero