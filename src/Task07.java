//Задание 7
//Определить значение i-го бита числа N. Вывести результат на консоль в двоичном виде

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите num");
        int num = in.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println("Введите i");
        int i = in.nextInt();

        int mask=1<<i;
        System.out.println(Integer.toBinaryString(mask));
        num = num&mask;
        System.out.println(Integer.toBinaryString(num));
        num=num>>i;
        System.out.println(Integer.toBinaryString(num));
    }
}