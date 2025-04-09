public class Calculator {
    long a; long b;
    double c; double d;

    public long add(long a, long b) {
        return a + b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.a = 10L; cal.b = 20L;
        cal.c = 10.5; cal.d = 20.5;

        long addResult = cal.add(cal.a, cal.b);
        double mulResult = cal.mul(cal.c, cal.d);

        System.out.println("Addition: " + addResult);
        System.out.println("Multiplication: " + mulResult);
    }
}
