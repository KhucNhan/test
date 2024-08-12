package Advanced_OOP1.Lab_4;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        System.out.println("a: ");
        int a = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
        System.out.println("b: ");
        int b = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
        if (a == 0) {
            if (b == 0) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        } else {
            System.out.println("The solution is: " + (double) -b / a);
        }
    }
}