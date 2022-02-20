package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CloserNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(arr);
        System.out.print("Enter a number : ");
        int smallCloser = 0, greatCloser = 0;
        int number = scan.nextInt();

        for (int i : arr) {
            if (i < number) {
                smallCloser = i;
            } else if (i > number) {
                greatCloser = i;
                break;
            }

        }
        System.out.println("closest number smaller than the entered number : " + smallCloser);
        System.out.println("Closest number greater than the entered number : " + greatCloser);

    }
}
