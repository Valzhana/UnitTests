package seminars.seminar1.calculator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminars.seminar3.Product;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest{
    private Calculator calculator;

    @BeforeAll
    public static void initAll() {
        // Здесь можно, например, подключиться к базе данных
    }
    @AfterAll
    public static void tearDownAll() {
        // Закрытие соединения с базой данных
    }

    @BeforeEach
    public void setUp() {
        calculator = new Calculator(); // Инициализация перед каждым тестом
    }

    @AfterEach
    public void tearDown() {
        calculator = null; // Очистка после каждого теста
    }

    @Test
    @DisplayName("Проверка суммирования")
    public void add() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Проверка вычитания")
    public void subtract() {
        assertEquals(5, calculator.subtract(2, 3));
    }

    @Test
    public void multiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void divide() {
        assertEquals(2, calculator.divide(4, 2));
    }
    @Test
    @DisplayName("Проверка деления на ноль")
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }

    @Test
    @Disabled
    @DisplayName("Тест отключён")
    public  void testDisabled() {
        fail("Этот тест не будет выполнен");
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 5, 100})
    @DisplayName("Параметризированный тест для суммирования")
    public void parameterizedTest(int arg) {
        assertEquals(arg + 2, calculator.add(arg, 2));
    }
    @Test
    @DisplayName("Проверка истинного условия")
    void testAssertTrue() {
        assertTrue(calculator.add(2,2) == 4);
    }
    @Test
    @DisplayName("Проверка истинного условия")
    void testAssertFalse() {
        assertTrue(calculator.add(2,2) == 5);
    }
    @Test
    @DisplayName("Проверка наличия объекта")
    void testAssertNotNull() {
        assertNotNull(calculator);
    }
    @Test
    @DisplayName("Проверка отсутствия объекта")
    void testAssertNull() {
        assertNull(calculator);
    }
    @Test
    @DisplayName("Проверка равенства массивов")
    void testAssertArrayEquals() {
        int [] expected = {1, 2, 3};
        int [] actual = {1, 2, 3};
        assertArrayEquals(expected,actual);
    }
}