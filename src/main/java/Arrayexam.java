public class Arrayexam {
    public static void main(String[] args) {

        String a = "a";
        int b = 1;

        int arrayInt[] = new int[10];
        // 초기화를 시킬 수 있는 값을 무조건 넣어야한다.
        // [10] = 0부터 9까지의 수를 담고있다 (총10개)
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(i);
            // 뜻 = 10번 만큼 i를 1씩 증가하는 구문을 프린트 해라.
            // (0,1,2,3,4,5,6,7,8,9) 로 출력된다
        }

        int arrayInt2[] = {1, 3, 5, 7, 9};
        for (int i = 0; i < arrayInt2.length; i++) {
            System.out.println(i);
            //  단순한길이를 출력하는 구문
            // 1,3,5,7,9 총 5개의 길이를 출력하는 구문을 프린트해라.
            // (0,1,2,3,4) 로 출력된다.
        }

        int arrayInt3[] = {1, 3, 5, 7, 9};
        for (int i = 0; i < arrayInt3.length; i++) {
            System.out.println(arrayInt3[i]);
            // i=0에서 시작을 하는 구문
            // arrayInt3에 있는 인덱스에서 0번째 에 있는 숫자를 출력해라.
            // (1,3,5,7,9)로 출력된다.
        }
    }
}
