import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите N");
        int N = in.nextInt();
        System.out.println("Введите M");
        int M = in.nextInt();
        if ((N>>31&1)==(M>>31&1)) System.out.println("Числа имеют одинаковый знак");
        else System.out.println("Числа имеют разный знак");
    }
}