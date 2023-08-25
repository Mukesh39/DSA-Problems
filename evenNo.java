import java.util.Scanner;

public class evenNo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = {12, 1, 3, 4, 6};
        evenNumber(array);
        oddNumber(array);
    }

    static void evenNumber(int[] arr) {
        System.out.println("Even numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    static void oddNumber(int[] arr) {
        System.out.println("Odd numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
