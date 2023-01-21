
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) тр 5 = 1+2+3+4+5 5! = 1*2*3*4*5

package Task_1;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        System.out.printf("введите число: ");

        Scanner input_number = new Scanner(System.in,"Cp866");
        int number = input_number.nextInt();

        int factorial_i=1;
        int num_triangle_i = 0; 
        
        for (int i=1 ; i<=number; i++) {
            factorial_i = factorial_i * i;
            num_triangle_i = num_triangle_i+i;
        }

        System.out.printf("факториал числа %d равен %d%n", number, factorial_i);
        System.out.printf("треугольное число %d равно %d", number, num_triangle_i);

        input_number.close();
    }
}
