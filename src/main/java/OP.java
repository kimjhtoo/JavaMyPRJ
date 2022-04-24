import java.util.Scanner;

public class OP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = 1;
        for(int i=0; i<N+1; i++) {
            if(i%2!=0) {
                a*=i;
            }
        }
        System.out.println(a);
    }
}