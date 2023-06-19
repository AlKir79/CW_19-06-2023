import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите num");
        int num = in.nextInt();
        System.out.println(Integer.toBinaryString(num));
        int t = 1;
        if (num >= t << 16) t <<= 16;
        if (num >= t << 8) t <<= 8;
        if (num >= t << 4) t <<= 4;
        if (num >= t << 2) t <<= 2;
        if (num >= t << 1) t <<= 1;
        t=~t;
        num = num&t;
        System.out.println(Integer.toBinaryString(num));

    }
}