import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fir = sc.nextInt();
        sc.close();

        int result = (10 * (fir % 10)) + ((fir / 10 + fir % 10) % 10);
        int count = 1;

//        int T = fir / 10; // 2
//        int N = fir % 10; // 6
//        int sum  = tn + n; // 8
//        int new = 10 * n + sum % 10; // 68

        while (fir != result) {
            result = (10 * (result % 10)) + ((result / 10 + result % 10) % 10);
            count++;
            if (fir == result) {
                break;
            }
        }
        System.out.println(count);
    }
}
