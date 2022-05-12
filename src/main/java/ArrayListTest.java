import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(); // => ArrayList에 담겨질 객체 타입은 <String> 즉 문자열 이라는 의미
        //ArrayList<int> list = new ArrayList<>(); ==> ArrayList에 담겨질 객체 타입은 <int> 즉 정수형 이라는 의미
        //ArrayList<char> list = new ArrayList<>(); ==> ArrayList에 담겨질 객체 타입은 <char> 즉 문자형 이라는 의미
        //ArrayList<double> list = new ArrayList<>(); ==> ArrayList에 담겨질 객체 타입은 <double> 즉 소수형 이라는 의미

        // 객체를 추가하는법 (add 메소드를 쓴다)
        list.add ("떡볶이"); // list에 '떡볶이' 라는 객체를 추가
        list.add ("피자"); // list에 '피자' 라는 객체를 추가
        list.add ("치킨"); // list에 '치킨' 이라는 객체를 추가
        list.add ("삼겹살"); // list에 '삼겹살' 이라는 객체를 추가
        list.add ("마라탕"); // list에 '마라탕' 이라는 객체를 추가

        // 객체를 획득하는 법 (get 메소드를 쓴다)
        System.out.println(list.get(0)); // 0번쨰 자리에 있는걸 가져올꺼야!! = 떡볶이를 가져온다
        System.out.println(list.get(1)); // 1번째 자리에 있는걸 가져올꺼야!! = 피자를 가져온다
        System.out.println(list.get(2)); // 2번째 자리에 있는걸 가져올꺼야!! = 치킨을 가져온다
        System.out.println(list.get(3)); // 3번째 자리에 있는걸 가져올꺼야!! = 삼겹살을 가져온다
        System.out.println(list.get(4)); // 4번째 자리에 있는걸 가져올꺼야!! = 마라탕을 가져온다

        // 객체 수 반환 (size 메소드를 쓴다)
        System.out.println(list.size()); // 총 5개니까 5로 출력이 된다. (list에 담겨져 있는 모든 객체의 수를 출력해라)

    }
}
