package lesson1;

public class Task1 {

    public static void main(String[] args) {
//        exceptionOne();
//        exceptionTwo();
//        exceptionThree();
    }

    private static void exceptionOne() {
        int num1 = 5;
        int num2 = 0;
        System.out.println(num1 / num2);
    }

    private static void exceptionTwo() {
        String[] str = new String[5];
        System.out.println(str[1000]);
    }

    private static void exceptionThree() {
        int[] array = new int[-10];
        System.out.println(array);
    }
}
