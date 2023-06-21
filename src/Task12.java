import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите N");
        int N = in.nextInt();
        System.out.println(Integer.toBinaryString(N));
        int i = 0;
        while (i<32) {
            if((N>>i&1)==0) break;
            i++;
        }
        if(i==32) System.out.println("Нулей в числе нет!");
        else System.out.println("Первый нуль находится на месте "+(i+1));
    }
}