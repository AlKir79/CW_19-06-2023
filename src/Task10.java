//Задание 10
//Найти и вывести на консоль минимальное из двух чисел
//M и N, используя только побитовые операции.

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите N");
        int N = in.nextInt();
        System.out.println("Введите M");
        int M = in.nextInt();
        if ((N>>31&1)!=(M>>31&1)) {
            if((N>>31&1)==1) System.out.println(N);
            else System.out.println(M);}
        else {
            int i=31;
            while ((N>>i&1)==(M>>i&1)&i>0) i--;
            if (i==0) System.out.println("Числа равны");
            else if ((N>>i&1)==1) System.out.println(M);
            else System.out.println(N);

        };
    }
}