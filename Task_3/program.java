// Реализовать простой калькулятор Scanner sc = ... int a = sc.nextLine int b = sc.nextLine

package Task_3;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        System.out.printf("Калькулятор: %n");
        Scanner input_n = new Scanner(System.in);

        System.out.printf("Введите первое число: ");
        float number1 = input_n.nextFloat();

        System.out.printf("Введите символ действия: (+,-,*,/) ");
        String calc_action = input_n.next();

        System.out.printf("Введите второе число: ");
        float number2 = input_n.nextFloat();

        input_n.close();

        float result = 0;
        
        switch (calc_action){
            case ("+"):
                result = number1+number2;
                break;
            case ("-"):
                result = number1-number2;
                break;
            case ("*"):
                result = number1*number2;
                break;
            case ("/"):
                result = number1/number2;
                break;
        }
        System.out.printf("%f %s %f = %f",number1, calc_action, number2, result);
    }
}