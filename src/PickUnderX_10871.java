
import java.util.Scanner;

public class PickUnderX_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 내 풀이
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int j = 0; j < N; j++) {
            if (arr[j] < X) {
                System.out.print(arr[j] + " ");
            }
        }

        // 버퍼드리퍼 풀이 (난이도 높음)
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//        public class Main {
//            public static void main(String[] args) throws IOException {
//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//                int N = Integer.parseInt(st.nextToken());
//                int X = Integer.parseInt(st.nextToken());
//
//                StringBuilder sb = new StringBuilder();
//
//                st = new StringTokenizer(br.readLine(), " ");
//
//                for (int i = 1; i < N; i++) {
//                    int value = Integer.parseInt(st.nextToken());
//
//                    if (value < X) {
//                        sb.append(value).append(' ');
//                    }
//                    System.out.println(sb);
//                }
//            }
//        }
    }
}
