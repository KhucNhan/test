package Advanced_OOP1.Lab_4;

//public class BT2 {
//    public static void main(String[] args) {
//        String ptr = null;
//
//        if (ptr.equals("gfg"))
//            System.out.print("Same");
//        else
//            System.out.print("Not Same");
//    }
//}

//Câu 1:
//Chạy trương trình nó sẽ bị lỗi sau:
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.equals(Object)"
// because "ptr" is null at baitap2.GFG.main(GFG.java:7)
//Lý do vì: ptr đang được gán bằng null nhưng lại bị so sánh với một chuỗi

//class GFG
//{
//    public static void main (String[] args)
//    {
//        // Initializing String variable with null value
//        String ptr = null;
//
//        // Checking if ptr.equals null or works fine.
//        try
//        {
//            // This line of code throws NullPointerException
//            // because ptr is null
//            if (ptr.equals("gfg"))
//                System.out.print("Same");
//            else
//                System.out.print("Not Same");
//        }
//        catch(NullPointerException e)
//        {
//            System.out.print("NullPointerException Caught");
//        }
//    }
//}

//Câu 2:
//Sau khi chạy trình duyệt, nó sẽ in ra:
//NullPointerException Caught
//Lý do vì:
//ptr đang đạc gán bằng null nhưng lại bị so sánh với một chuỗi
//nến nó sẽ là lỗi NullPointerException và đc bắt lấy trong 'catch' và in ra 'NullPointerException Caught'

//Câu 3:
//'NullPointerException' xảy ra khi ptr được tạp bằng null nhưng dduocj so sánh với gfg (ptr.equals("gfg"))

    class BT2
    {
        public static void main (String[] args)
        {
            // Initializing String variable with null value
            String ptr = null;

            // Checking if ptr is null using try catch.
            try
            {
                if ("gfg".equals(ptr))
                    System.out.print("Same");
                else
                    System.out.print("Not Same");
            }
            catch(NullPointerException e)
            {
                System.out.print("Caught NullPointerException");
            }
        }
    }

//Câu 4:
//Sau khi chạy trương trình nó sẽ in ra:
//Not Same
//Lý do vì:
//nó sẽ so sánh một chuỗi hợp lệ với ptr nhưng vì ở đây ptr nó chỉ là một đối tươợng tham số nên nó sẽ
//sẽ ko phải là NullPointerException.