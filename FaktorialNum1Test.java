
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FaktorialNum1TestsTest {
    @Test
    @DisplayName("Расчет факториала для нуля")
    void test1() {
        assertEquals(1, FaktorialNum1.faktorialNum1(0));
    }

    @Test
    @DisplayName("Расчет факториала для положительного числа")
    void test2() {
        assertEquals(1, FaktorialNum1.faktorialNum1(1));
        assertEquals(5040, FaktorialNum1.faktorialNum1(7));
    }

    @Test
    @DisplayName("Проверка исключения для отрицательного числа")
    void test3() {
        assertThrows(IllegalArgumentException.class, () -> FaktorialNum1.faktorialNum1(-2));

    }


}

