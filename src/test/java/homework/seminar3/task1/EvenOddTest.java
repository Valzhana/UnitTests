package homework.seminar3.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EvenOddTest {

    private EvenOdd evenOdd;

    @BeforeEach
    void setUp() {
        evenOdd = new EvenOdd();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testEvenOddNumberIsEvenTrue() {
        boolean isEven = evenOdd.evenOddNumber(10);
        Assertions.assertTrue(isEven);
    }

    @Test
    void testEvenOddNumberIsOddFalse() {
        boolean isEven = evenOdd.evenOddNumber(21);
        Assertions.assertFalse(isEven);
    }
}