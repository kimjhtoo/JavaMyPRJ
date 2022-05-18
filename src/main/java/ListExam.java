import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); //문자열이 들어간 list라는 객체를 만들엇습니당..

        //List 객체에 데이터 추가하기 , list에다가 넣고싶은 데이터를 넣습니당...
        list.add("김지태");
        list.add("이지태");
        list.add("박지태");
        list.add("유지태");

        //List의 데이터 수 구하기
        int listSize = list.size(); // list.size에 들어간 데이터의 갯수가 몇개일까융..

        //List 객체에 지정된 값 출력하기
        // 여러 데이터가 저장되기 때문에 내용을 확인하기 위햇는 반복문을 사용함

        //전에 쓰던 for문

        for (int i =0; i<listSize; i++) {
            System.out.println("이름 : "+list.get(i));

        }

    }
}
