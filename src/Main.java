import java.sql.Array;
import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        // 컬렉션 생성
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("F");
        System.out.println("while문을 지나기 전 리스트에 들어있던 값 : " + list);

        // 리스트에 들어있는 각각의 값에 '+' 붙이기
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Object element = listIterator.next();
            listIterator.set(element + "+");
        }
        System.out.println("while문을 지난 후 수정된 결과 : " + list);

        // 리스트에 들어있는 값을 역순으로 표시
        System.out.print("역순 출력 결과 : ");
        while (listIterator.hasPrevious()) {
            Object element = listIterator.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}