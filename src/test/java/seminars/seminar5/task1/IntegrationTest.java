package seminars.seminar5.task1;

import seminars.seminar5.task2.RandomNumberGenerator;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationTest {
    private RandomNumberGenerator randomNumberGenerator;
    private MaxNumberFinder maxNumberFinder;

    void checkThemAllTogether() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(1, 12);
        List<Integer> generatedNumbers = randomNumberGenerator.generateRandomNumbers(5);
        int actualMax = Collections.max(generatedNumbers);
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder();
        assertEquals(actualMax, maxNumberFinder.findMaxNumber(generatedNumbers));

    }

}
