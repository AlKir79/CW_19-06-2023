import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите num");
        int num = in.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println("Введите i");
        int i = in.nextInt();

        int mask = 1<<i;
        num = num^mask;
        System.out.println(Integer.toBinaryString(num));
    }
}
