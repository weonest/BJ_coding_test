// 삽 입 정 렬

import java.util.Scanner;

public class ArrayWithFor {
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
                    temp = arr[i]; // temp값에 [i]값 저장      스와핑
//                 #1 System.out.printf("temp = arr[%d] : %d\n", i, temp);

                    arr[i] = arr[j]; // [i]값에 [j]값 저장       스와핑
//                 #2 System.out.printf("arr[i = %d] : ", i);
//                    System.out.println(arr[i]);

                    arr[j] = temp; // [j]값에 temp값 저장        스와핑
//                 #3 System.out.printf("arr[j = %d] : ", j);
//                    System.out.println(arr[j]);

//                 #4 System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5] + " " + arr[6] + " " + arr[7] + " " + arr[8]);
//                    System.out.println(" "); // 정렬된 배열 출력하기
                    // 3 29 38 12 57 74 40 85 61
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
