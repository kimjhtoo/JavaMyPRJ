public class Java1 {
    public static void main(String[] args) {
        int i =1;
        int j= 1;
        while(i<10) {
            j=1;
            System.out.printf(i+"단을 출력");
            while(j<10) {
                System.out.printf(i+"*"+j+"="+(i*j), "\n");
                j++;
            }
            System.out.println();
        }
    }
}
