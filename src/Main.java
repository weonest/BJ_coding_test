import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {



        for (int i = 0; i < 5; i++) {
            int a = (int) (Math.random()*45 + 1);
            System.out.print(a + ", ");
            if (i == 4) {
                System.out.println((int)(Math.random()*45 + 1));
            }
        }



    }
}