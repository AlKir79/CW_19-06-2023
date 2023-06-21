import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите N");
        int N = in.nextInt();
        System.out.println(Integer.toBinaryString(N));
        System.out.println(Integer.toBinaryString(N&~1));
    }
}