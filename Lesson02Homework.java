package HW02;

public class Lesson02Homework {

    public static void main(String[] args) {
        int y = 10;
        SumBetween10And20(5, 7);
        PosOrNeg(y);
        PosOrNegBool(y);
        printWordNTimes("Отпечатать данную троку заданное кол-во раз", 6);
        isLeapYear(2023);
    }

    public static boolean SumBetween10And20(int a, int b) {
       return a + b >=10 && a + b <=20;
    }

    public static void PosOrNeg(int y) {
        if ( y >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean PosOrNegBool(int y) {
        return y < 0;
    }

    public static void printWordNTimes(String word, int times){
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
   public static boolean isLeapYear(long year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
   }

}
