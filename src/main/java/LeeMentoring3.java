public class LeeMentoring3 {
    public static void main(String[] args) {
        int p = 5;
        for(int i=1; i<=p/2+1; i++){
            for(int j=0; j<p/2-i+1; j++) System.out.print(" ");
            for(int j=0; j<i; j++) System.out.print("*");
            for(int j=0; j<i-1; j++) System.out.print("1");
            System.out.println();
        }
        for(int i=1; i<=p/2; i++){
            for(int j=0; j<i; j++) System.out.print(" ");
            for(int j=0; j<p/2-i; j++) System.out.print("*");
            for(int j=0; j<p/2-i+1; j++) System.out.print("1");
            System.out.println();
        }
            }
        }
