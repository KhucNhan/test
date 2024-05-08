package OOP1;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;
    static double delta, root1, root2;
    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getDiscriminant() {
        delta = Math.pow(b,2) - (4 * a * c);
        System.out.println("Discriminant is: " + delta);
    }

    public void getRoot1() {
        root1 = (-b + Math.sqrt(delta)) / (2 * a);
        System.out.println(root1);
    }

    public void getRoot2() {
        root2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println(root2);
    }

    public void getter() {
        System.out.println("a, b , c is : " + a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double x = scanner.nextDouble();
        System.out.print("Enter b: ");
        double y = scanner.nextDouble();
        System.out.print("Enter c: ");
        double z = scanner.nextDouble();

        QuadraticEquation math = new QuadraticEquation(x , y , z);
        math.getter();
        math.getDiscriminant();
        if (delta > 0) {
            System.out.println("The equation has 2 roots: ");
            math.getRoot1();
            math.getRoot2();
        } else if (delta == 0) {
            System.out.println("The equation has 1 root: ");
            math.getRoot1();
        } else {
            System.out.println("The equation has none root.");
        }
    }
}
