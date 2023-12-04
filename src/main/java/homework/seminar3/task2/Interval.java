package homework.seminar3.task2;

// HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
// покрыть тестами метод на 100%

public class Interval {
    public static boolean numberInInterval(int n) {
        return n > 25 && n < 100;
    }
}
