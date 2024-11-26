public class FaktorialNum2 {
    public static long faktorialNum2(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Для отрицательного числа факториал не существует");
        }
        if (num == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= num; i++) factorial *= i;
        return factorial;
    }
}
