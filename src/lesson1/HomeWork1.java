package lesson1;

public class HomeWork1 {
    private final static  int MIN_LENGTH = 5;

    public static void main(String[] args) {
        System.out.println(getSize(new int[] {1, 2}));
        System.out.println(getSize(new int[] {1, 2, 3, 4, 5, 6}));

    }

    public static int getSize(int[] array) {
        if (array.length < MIN_LENGTH) {
            return -1;
        }

        return array.length;
    }
}
