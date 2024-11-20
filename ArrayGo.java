public class ArrayGo {
    public static int sumArray(String[][] arr) throws MyArraySizeException,  MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть равен 4");
        }
        int sum = 0;
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                try{
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в яйчейке (" + i + ", " + j +")",  i,  j);
                }
            }
        }
        return sum;
    }

}

