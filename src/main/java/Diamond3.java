public class Diamond3 {
    public static void main(String[] args) {
        int i , j , k;
        for (i=0, j=0; i<8; i++) {
            for(k=0; k<j+3; k++) {
                if(k<(4-j)) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }if (i<3) {
                    i++;
                }else{
                    j--;
                }
            }
            System.out.println(" ");
        }
    }
}

