import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();


        // (list에다가 추가를 해야되잖아 add를 쓰자)
        list.add ("Kim");
        list.add ("Lee");
        list.add ("Park");
        list.add ("Choi");
        list.add ("Hong");
        list.add ("No");


        // for문으로 출력하는 방법
        /* for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i)); */

        // 그냥 일반적인 순차적 출력 방법 (얻어와서 출력한다 get을 쓰자)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));


        // list에 담겨져있는 객체의 수 를 출력 (list놈 사이즈를 알아야한다. size를 쓰기)
        System.out.println(list.size());

    }
}
