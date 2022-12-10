package lesson1;

import java.util.*;

public class Task4 {
    // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    // и возвращающий новый массив, каждый элемент которого равен частному элементов двух
    // входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
    // Важно:
    // При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
    public static void main(String[] args) throws IllegalAccessException {
        int[] arr1 = createArray();
        int[] arr2 = createArray();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(newArray(arr1, arr2)));
    }

    public static int[] createArray() {
        System.out.print("Введите длину массива: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array1 = new int[size];
        for (int i = 0; i < size; i++) {
            Random ran = new Random();
            array1[i] = ran.nextInt(0, 9);
        }
        return array1;
    }

    public static int[] newArray(int[] arr1, int[] arr2) throws IllegalAccessException {
        if (arr1 == null || arr2 == null) {
            throw new NullPointerException("Массив не может быть null.");
        }

        if (arr1.length != arr2.length) {
            throw new IllegalAccessException("Длины массивов должны быть равны.");
        }

        int[] res = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            valid(arr2[i]);

            res[i] = arr1[i] / arr2[i];
        }
        return res;
    }

    private static void valid(int num) {
        if (num == 0) {
            throw new RuntimeException("На 0 делить нельзя!");
        }
    }

}

