import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr.length; k++) {
                if (arr[j] < arr[k]) {
                    temp = arr[j];
                    System.out.println("temp : " + temp);
                    arr[j] = arr[k];
                    System.out.println("arr[j] : " + arr[j]);
                    arr[k] = temp;
                    System.out.println("arr[k] : " + arr[k]);
                    System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
     }
}
