import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    System.out.println("temp : " + temp);
                    arr[i] = arr[j];
                    System.out.printf("arr[i = %d] : ",i);
                    System.out.println(arr[i]);
                    arr[j] = temp;
                    System.out.printf("arr[j = %d] : ",j);
                    System.out.println(arr[j]);
                    System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5] + " " + arr[6] + " " + arr[7] + " " + arr[8]);
                    System.out.println(" ");
                    // 3 29 38 12 57 74 40 85 61
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
     }
}
