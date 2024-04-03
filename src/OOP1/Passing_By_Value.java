package OOP1;
class Main {
    int data;

    Main(int dataValue) {
        data = dataValue;
    }

    public static void swap(Main n1, Main n2) {
        System.out.println("\tGia tri cac bien ben trong ham swap");
        System.out.println("\t\tTruoc khi swap, n1.data = " + n1.data + " va n2.data = " + n2.data);
        // Swap n1.data with n2.data
        int temp = n1.data;
        n1.data = n2.data;
        n2.data = temp;
        System.out.println("\t\tSau khi swap, n1.data = " + n1.data + " va n2.data = " + n2.data);
    }
    /*Hoán đổi 2 biến*/
    public static void main(String[] args) {
        Main n1 = new Main(1);
        Main n2 = new Main(2);
        System.out.println("Truoc khi goi ham swap, n1.data = " + n1.data + " va n2.data = " + n2.data);
        swap(n1, n2);
        System.out.println("Sau khi goi ham swap, n1.data = " + n1.data + " va n2.data = " + n2.data);
    }
}
//    }
//}