public class Ieechawon {
    public static void main(String[] args) {
        int [][] arr = new int[10][10];

        for (int i =2; i< arr.length; i++) {
            if (i%8==0) {
                break;}

            else if (i%2==0) {
                System.out.println(i+"단 출력");
            }
            for(int j =1; j <arr.length; j++) {

                arr[i][j] = i*j;

                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
    }
}
