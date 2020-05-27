package ua.testing;

/**
 * <h1>Homework - Code From Video (Junit Video)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class Arithmetics {

    public double add(double a, double b) {
        return a + b;
    }

    public double deduct(double a, double b) {
        return a - b;
    }

    public double mult(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) throw new ArithmeticException();
        return a / b;
    }
}
