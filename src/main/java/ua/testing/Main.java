package ua.testing;

/**
 * <h1>Homework - Code From Video (Junit Video)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class Main {
    public static void main(String[] args) {
        Arithmetics arithmetics = new Arithmetics();
        double result = arithmetics.add(5, 7);
        System.out.println(result);
    }
}
