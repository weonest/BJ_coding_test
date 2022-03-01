import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 숫자 2개를 입력 받고 크기를 비교하는 코드
        Scanner sc = new Scanner(System.in);

//        int a, b;
//
//        a = sc.nextInt();
//        b = sc.nextInt();
//
//        System.out.println("둘 중에 큰 수는: ");
//
//        System.out.print(a > b ? a : (a == b ? "같음" : b));
//                        // a가 b보다 크면 'a' 출력, 아니면 다시 (a와 b가 같으면 '같음' 출력 아니면 b
//

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean flag = true;

        while (flag) {
            try {
                System.out.print("숫자를 입력하세요 : ");
                int i = sc.nextInt();
                System.out.println(arr[i-1]); // 인덱스 값과 저장된 수의 값의 차가 1이므로
                System.out.println("프로그램 종료");
                break;
            } catch (Exception e) {
                System.out.println("1 ~ 10 사이의 값을 입력하세요");

            }
        }
    }
}