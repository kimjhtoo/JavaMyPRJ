import java.util.Scanner;

public class hap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;
        int result;

        System.out.println("첫번째 계산할 값을 입력하세요 ==>");
        a = sc.nextInt();

        System.out.println("두번재 계산할 값을 입력하세요 ==>");
        b = sc.nextInt();

        System.out.println("세번째 계산할 값을 입력하세요 ==>");
        c = sc.nextInt();

        System.out.println("네번째 계산할 값을 입력하세요 ==>");
        d = sc.nextInt();

        System.out.println(a + "+" + b + "+" + c + "+" + d + "+");
    }
}
