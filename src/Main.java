import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        int tmp = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            int min = 9999;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]){ 
                     min = arr[j]; // 최소값으로 지정해서 저장
                    System.out.printf("min = arr[%d] = %d\n" , j, arr[j]);

                     index = j; // 저장된 최소값을 바탕으로 몇번째 인덱스인지 저장
                    System.out.printf("index = %d\n", j);
                    System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5] + " " + arr[6] + " " + arr[7] + " " + arr[8]);
                    System.out.println(" "); // 정렬된 배열 출력하기
                }
            }
            tmp = arr[i]; // jFor문을 통해 찾은 min 값과의 스와핑 과정
            System.out.printf("tmp = arr[%d] = %d\n", i, arr[i]);

            arr[i] = arr[index];
            System.out.printf("arr[%d] = arr[%d] = %d\n", i, index, arr[index]);

            arr[index] = tmp;
            System.out.printf("arr[%d] = tmp = %d\n", index, tmp);
            System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5] + " " + arr[6] + " " + arr[7] + " " + arr[8]);
            System.out.println(" "); // 정렬된 배열 출력하기
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}