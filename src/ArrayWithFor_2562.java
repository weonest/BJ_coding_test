import java.util.Scanner;

public class ArrayWithFor_2562 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        int index = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j]; // 최대값으로 지정해서 저장
//                  System.out.printf("max = arr[%d] = %d\n", j, arr[j]);

                index = j; // 저장된 최소값을 바탕으로 몇번째 인덱스인지 저장
//                  System.out.printf("index = %d\n", j);
//                  System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5] + " " + arr[6] + " " + arr[7] + " " + arr[8]);
//                  System.out.println(" "); // 정렬된 배열 출력하기
//                3 29 38 12 57 74 40 85 61
            }
        }
        System.out.println(arr[index]);
        System.out.println(index + 1);
    }
}