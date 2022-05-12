public class Diamond4 {
    public static void main(String[] args) {
        int i,j,k, result;
        for (i=1; i<=5; i++) {
            for (j=5-i; j>=1; j--) {
                System.out.print(" ");
            }
            result=2*i;
            for(k=1; k<result; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (i=1; i<=5; i++) {
            for(j=1; j<i; j++) {
                System.out.print(" ");
            }
            result=(2*i-1);
            for(k=9; k>=result; k--) {
                System.out.print("*");;
            }
            System.out.println(" ");
        }

    }
}
