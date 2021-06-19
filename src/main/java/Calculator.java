public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public double divFractionalNum(double a, double b) {
        if (a == 0 || b == 0)
            throw new IllegalArgumentException(
                    String.format("Expected non-zero number, but got first number %s and second number %s", a, b));
        return a / b;
    }

    public double squareRoot(double a) {
        if (a < 0)
            throw new IllegalArgumentException("Expected non-negative number, got " + a);
        return Math.sqrt(a);
    }
}
