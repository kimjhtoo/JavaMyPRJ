import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        //선언
        ArrayList array = new ArrayList();

        //값 넣기 (데이터를 추가할때는 add를 쓰면 된다)
        array.add ("one"); //String 형
        array.add (2); // int형
        array.add ('a'); // char 형

        // 값 가져오기 (값을 가져올때는 get을 쓰면 된다)ㄴ
        String v1 = (String) array.get(0);
        int v2 = (int) array.get(1);
        char v3 = (char) array.get(2);

        for (int i =0; i<array.size(); i++) {
            System.out.println(array.get(i));

            // 개선코드
            ArrayList<String> alString = new ArrayList<String>(); //ArrayList<String>은 ArrayList에 문자열만 넣을 수 있다 라는 의미
            alString.add("one");

            //값 가져오기
            String v4 = alString.get(0);
        }
    }
}
