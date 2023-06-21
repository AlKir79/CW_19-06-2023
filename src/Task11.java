import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите N");
        int N = in.nextInt();
        System.out.println(Integer.toBinaryString(N));
        int i = 32;
        int count = 0;
        while (i>0) {
         if((N>>i&1)==1) count++;
         i--;
        }
        System.out.println(count);
    }
}
