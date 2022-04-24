import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 상단 및 중간
        for (int i=0; i<N; i++) {
            for (int j=1; j<N-i; j++ ) {
                System.out.print(" ");
            }
            for (int j =0; j<i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
            }
        //하단(상단) 뒤집기
        for (int i =N-1; i>0; i--) {
            for (int j = N-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int j =i*2-1; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
