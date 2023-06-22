//Задание 3
//Установить i-й бит числа N равным 1. Вывести результат
//на консоль в двоичном виде.

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите num");
        int num = in.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println("Введите i");
        int i = in.nextInt();

        int mask = 1<<i;
        System.out.println(Integer.toBinaryString(mask));
        num = num|mask;
        System.out.println(Integer.toBinaryString(num));
    }
}