package homework.seminar3.task1;

// HW 3.1. Нужно покрыть тестами метод на 100%
// Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).

public class EvenOdd {
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
