public class BY {
    public static void main(String[] args) {
        int[] score = new int[3];

        score[0] = 100;
        score[1] = 200;
        score[2] = 300;

        System.out.println(score);
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score.length);
    }
}

//NEW 객체를 메모리에 올린다.
// 기본형 변수 = 실제 값 그대로 출력
// 참조형변수 = 할당받은 메모리의 주소를 출력한다. , 길이를 직접 설정 해줘야 한다.