public class Bubble {
    public static void main(String[] args) {
        int [] arr = {1, 3, 4, 5, 4, 3, 6, 7, 8, 9, 6, 2, 1};

        for(int i =0; i<arr.length-1; i++) { // 전체를쓰고 내부 for문에서 정렬을 하는 과정이 일어남.
            for (int j =0; j< arr.length - 1-i; j++) { //i는 증가하면 증가할수록 고정되는 값이 늘어나기때문에 -1을한다.
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr [j] = arr[j + 1];
                    arr [j + 1] = temp;
                }
            }
            System.out.println(i+"번 째 회전 결과는??? : ");
            for (int k =0; k <arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}
