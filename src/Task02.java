//Задание 2
//Вывести на консоль 2 в степени n. Для вычисления использовать только побитовые операци
//
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n");
        int n = in.nextInt();
        System.out.println(Integer.toBinaryString(1<<n));
        System.out.println(1<<n);
    }
}