//Задание 6
//Обнулить все кроме последних i битов числа N. Вывести
//результат на консоль в двоичном виде.

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите num");
        int num = in.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println("Введите i");
        int i = in.nextInt();

        int mask=1;
        for (int k=0;k<i;k++){
            mask = mask<<1;
            mask = mask|1;
        }
        System.out.println(Integer.toBinaryString(mask));
 //       mask = ~mask;
        num = num&mask;
        System.out.println(Integer.toBinaryString(num));
    }
}
