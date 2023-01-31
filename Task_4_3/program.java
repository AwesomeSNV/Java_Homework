package Task_4_3;
// В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.Scanner;
import java.util.Stack;

public class program {
    public static void main(String[] args) {
        String str_command = "";
        Scanner input_n = new Scanner(System.in);
        Stack<Float> stack = new Stack<>();

            System.out.printf("Калькулятор: %n");          
            System.out.printf("Введите первое число: ");
            float result = 0;
            float number1 = input_n.nextFloat();
            

        while (!str_command.equals("stop")){
            stack.push(number1);
            
            System.out.printf("введите символ действия: (+,-,*,/) ");
            String calc_action = input_n.next();

            System.out.printf("Введите второе число: ");
            float number2 = input_n.nextFloat();
           
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

            System.out.printf("%f %s %f = %f \n",number1, calc_action, number2, result);
            number1 = result;

            System.out.println("Введите команду remove для возврата к предыдущему результату");
            System.out.println("Введите команду stop для завершения работы");
            System.out.println("или введите любой символ для продолжения работы");
            str_command = input_n.next();

            switch (str_command){
                case ("stop"):
                    break;
                case ("remove"):
                    number1 = stack.pop();
                    System.out.printf("откат \n");
                    System.out.printf("Первое число: %f \n", number1 );
                    break;
                default:
                    System.out.printf("Первое число: %f \n", number1 );
                    break;
            }          
        }
        input_n.close();
    }

}