package week10.recursive;

public class RecursiveTest {
    public static void recursive(int num) {
        if(num > 100){
            return;
        }
        System.out.println(num);
        recursive(++num);
    }

    public static void main(String[] args) {
        recursive(1);
    }
}
