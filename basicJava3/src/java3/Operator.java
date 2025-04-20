package java3;

public class Operator {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30, d = 40;

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println((a > b) && (b < c));
        System.out.println((a < b) && (c < d));
        System.out.println((a < c) || (b > d));
        System.out.println((a > c) || (b > d));
    }
}
