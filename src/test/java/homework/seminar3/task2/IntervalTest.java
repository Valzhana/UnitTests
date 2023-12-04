package homework.seminar3.task2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntervalTest {
    private Interval interval;

    @BeforeEach
    void setUp() {
        interval = new Interval();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void numberInIntervalFrom25to100True() {
        boolean isInInterval = Interval.numberInInterval(50);
        Assertions.assertTrue(isInInterval);
    }

    @Test
    void numberInIntervalLessThan25False() {
        boolean isInInterval = Interval.numberInInterval(10);
        Assertions.assertFalse(isInInterval);
    }

    @Test
    void numberInIntervalEqualTo25False() {
        boolean isInInterval = Interval.numberInInterval(25);
        Assertions.assertFalse(isInInterval);
    }

    @Test
    void numberInIntervalGreaterThan100False() {
        boolean isInInterval = Interval.numberInInterval(150);
        Assertions.assertFalse(isInInterval);
    }
}