public class Whilegugu {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i < 10) {
            j = 1;
            System.out.println(i + "단 시작");
            while (j < 10) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\n");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
