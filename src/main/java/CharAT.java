public class CharAT {
    public static void main(String[] args) {
        String a , b , c;
        int[] arr = new int[15];
        a = "12345";
        b = "54321";
        c = "45678";

        String result = a + b + c;
        System.out.println(result);

        for (int i = 0; i<arr.length; i++) {
            arr[result.charAt(i) - 0] ++; // 유니코드, 아스키코드 문자열은 String형태도 번호가 매겨져 있을텐데 똑같은 개념

        }

        for (int i =0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
