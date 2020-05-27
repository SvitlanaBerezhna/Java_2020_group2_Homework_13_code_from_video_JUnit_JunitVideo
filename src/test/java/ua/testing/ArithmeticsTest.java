package ua.testing;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * <h1>Homework - Code From Video (Junit Video)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-07
 */
public class ArithmeticsTest { // tests run randomly
    private static Arithmetics a; // the field should be static for using in static method runT()

//    @Before // annotation means that the method is called before each test
    @BeforeClass // annotation means that the method is called once, and then all tests are executed

//    @After // annotation means the method is called after each test
    @AfterClass // annotation means that the method is called once, after execution all the tests

//    there may be several @Before, @After annotations and ones executed randomly

    public static void runT() { // the method should be static for using @BeforeClass, @AfterClass annotations
        a = new Arithmetics();
    }

    @Rule
    public final ExpectedException exp = ExpectedException.none(); // the second way to catch exceptions
//    without using a parameter like this: @Test(expected = ArithmeticException.class)

    @Rule
/*    public Timeout time = new Timeout(1000); // the second way to indicate the expected execution time of the test
    without using a parameter like this: @Test(timeout = 1000) - deprecated method, instead should used method:*/

    public Timeout time = new Timeout(1000L, TimeUnit.MILLISECONDS);

//    @Ignore // annotation means the test will not execute
    @Test
    public void add() {
/*        Arithmetics arithmetics = new Arithmetics();
        double actual = arithmetics.add(5.0, 7.0);
        double expected = 12.0;
        assertEquals(expected, actual, 3);

        Arithmetics a = new Arithmetics();
        runT(); // to initialize an object*/
        double res = a.add(3, 7);
        assertEquals(res, 10, 0);
//        a = null;

/*
        if (res != 10) Assert.fail();
        if (res != 10) Assert.fail("Error ..."); // overloaded method

        assertTrue(res == 10); // returns true if condition returns true
        assertTrue(res == 9); // returns false because condition returns false
        assertTrue("Message ...", res == 9); // overloaded method

        assertFalse(res == 10); // works vice versa to method assertTrue:
//        returns false if condition returns true and vice versa
        assertFalse("Message ...", res == 9); // overloaded method like the other ones below

        assertNull(Object); // returns true if Object is null and false if Object initialized
        assertNull(a); // returns false because "a" have initialized

        assertNotNull(a); // works vice versa to method assertNull

        assertEquals(res, 10, 0); // assertEquals(expected, actual, delta) - for double values,
//        assertEquals(expected, actual) - is depricated method for double values

        assertSame(objectExpected, objectActual); // returns true if two objects are the same
        assertNotSame(objectExpected, objectActual); // works vice versa to method assertSame
        */
    }

    @Test
    public void deduct() {
/*        Arithmetics a = new Arithmetics();
        runT(); // to initialize an object*/
        double res = a.deduct(3, 7);
//        if (res != -4) Assert.fail();
        assertEquals(res, -4, 0);
//        a = null;
    }

    @Test
    public void mult() {
/*        Arithmetics a = new Arithmetics();
        runT(); // to initialize an object*/
        double res = a.mult(3, 7);
//        if (res != 21) Assert.fail();
        assertEquals(res, 21, 0);
//        a = null;
    }

    @Test
    public void div() {
/*        Arithmetics a = new Arithmetics();
        runT(); // to initialize an object*/
        double res = a.div(10, 5);
//        if (res != 2) Assert.fail();
        assertEquals(res, 2, 0);
//        a = null;

/*        try { // this method was used in JUnit3 version
            a.div(10, 0);
            Assert.fail();
        } catch (Exception e) {
        }*/
    }

/*    @Test(expected = Exception.class) // for each check and for each exception, it needs to create separate tests
      @Test(expected = ArithmeticException.class)*/
    public void divException() {
        exp.expect(ArithmeticException.class); // test passed if this exception was thrown
        a.div(10, 0);
    }

//    @Test(timeout = 1000) // the parameter indicates the expected execution time of the test in milliseconds
    @Test
    public void testN() {
/*        while (true) { // test failed
        }*/
        a.div(10, 10); // test passed
    }
}
