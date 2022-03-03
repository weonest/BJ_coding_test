// 알람 시계
// 내가 작성한 식과 코드의 간결성의 차이를 확인할 것!
import java.util.Scanner;

public class Early45Time_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        /* 내가 짠 코드
        if (x > 0 && y < 45 ){
            y = y + 15;
            x = x - 1;
            System.out.println(x + " " + y);
        } else if (y > 45){
            y = y - 45;
            System.out.println(x + " " + y);
        } else{
            y = y + 15;
            x = 23;
            System.out.println(x + " " + y);
        }*/

        if (y < 45) {
            x--; //시간 감소
            y = 60 - (45 - y); // 분 감소
            if (x < 0) {
                x = 23;
            }
            System.out.println(x + " " + y);
        } else {
            System.out.println(x + " " + (y - 45));
        }
    }
}