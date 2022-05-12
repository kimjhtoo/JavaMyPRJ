public class main {
    public static void main(String[] args) {

        Loop1: for (int i =2; i<10; i++) {

        for (int j = 1; j< 10; j++) {

            if (j==1) {

                //break Loop1; // 가장 가까운 반복문만 탈출한다.
                //break;
                //continue Loop1;
                //continue;
            }

        }
            System.out.println("그냥 break , continue.....");
        }
        System.out.println("이름 붙인 break , continue.....");
    }
}
