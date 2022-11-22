package week10.recursive;

public class RecursiveArray {
    static int result = 0;
    public static void recursive(int[] arr, int length, int count) {
        if(count == length){
            return;
        }

        result += arr[count++];
        recursive(arr, length, count);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7};
        recursive(arr, arr.length, 0);
        System.out.println(result);
    }
}
