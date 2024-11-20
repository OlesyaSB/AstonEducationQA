public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1",  "2",  "3",  "4"}, {"1",  "2",  "3",  "4"}, {"1",  "2",  "3",  "4"}, {"1",  "2",  "3",  "4"}};

        try {
            int sum = ArrayGo.sumArray(array);
            System.out.println("Сумма массива:  " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Размер исключения: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Данные исключения в яйчейке (" + e.getRow() + ", " + ", " + e.getCol() + "): " + e.getMessage());
        }
    }
}
