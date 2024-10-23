import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       printThreeWords();                        //1
       checkSumSign();                           //2
       printColor();                             //3
       compareNumbers();                         //4
       System.out.print(sumNumber(7, 5));        //5
       System.out.println();
       System.out.println(positiveNumber(10));   //6
       System.out.println(negativeNumber(-10));  //7
       myPrint("Happyness",  7);                 //8
       System.out.println(seniorYear(400));      //9
       oneArr(7, 4);                             //14
//10
    int[] myMas1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    for (int i = 0; i < myMas1.length; i++) {
        if (myMas1[i] == 1) {
            myMas1[i] = 0;
        } else if (myMas1[i] == 0) {
            myMas1[i] = 1;
        }
    } System.out.println(Arrays.toString(myMas1));
  
//11
    int[] myMas2 = new int[100];
    for (int i = 0; i < 100; i++) {
        myMas2[i] = i+1; 
    } System.out.println(Arrays.toString(myMas2));
  
//12
    int[] myMas3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < myMas3.length; i++) {
        if (myMas3[i] < 6) {
            myMas3[i] = myMas3[i] * 2;
        } 
    } System.out.println(Arrays.toString(myMas3));

//13
    int[][] myMas4 = new int [7][7];
    for (int i = 0; i < 7; i++) {
            myMas4[i][i] = 1;
    }
    for (int i = 0; i < 7; i++) {
            myMas4[i][5-i+1] = 1;
    }  System.out.println(Arrays.deepToString(myMas4));
    }
    
//1    
    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

//2        
    static void checkSumSign() {
        int a = 5;
        int b = 7;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
              System.out.println("Сумма отрицательная"); 
          }
    }

//3
    static void printColor() {
        int value = 1000;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
              System.out.println("Зеленый"); 
          } else {
              System.out.println("Желтый"); 
            }
    }

//4
    static void compareNumbers() {
        int a = 202;
        int b = 44;
        if (a >= b) {
            System.out.println("a >= b");
        } else  {
              System.out.println("a < b"); 
          } 
    }

//5
    static boolean sumNumber(int a, int b) {
        int numSum = a + b;
        return (10 <= numSum && numSum <= 20);
    }

//6
    static String positiveNumber(int a) {
        return a >= 0 ? "Число положительное" : "Число отрицательное";
    }

//7
    static boolean negativeNumber(int a) {
        return a < 0;
    }

//8
    static void myPrint(String a,  int n) {
        System.out.println(a.repeat(n));
    }


//9
    static boolean seniorYear(int a) {
        if (a%4 != 0) {
           return false;
        } else if (a%100 == 0) {
               if (a%400 == 0) {
                   return true;
                } else {
                      return false;
                  } 
          } else {
               return true;
            }
    }

//14 
    static void oneArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        };
        System.out.println(Arrays.toString(arr));
    } 
}
