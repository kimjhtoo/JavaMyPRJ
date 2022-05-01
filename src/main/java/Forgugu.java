public class Forgugu {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            System.out.println(i + "단 시작");
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\n");
            }
            System.out.println();

        }
    }
}
