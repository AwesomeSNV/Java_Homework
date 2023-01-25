// Реализовать простой калькулятор Scanner sc = ... int a = sc.nextLine int b = sc.nextLine

package Task_2_4;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class program {
    public static void main(String[] args) throws IOException {

        

        System.out.printf("Калькулятор: %n");
        Scanner input_n = new Scanner(System.in);
        float number1=0;
        float number2=0;

        System.out.printf("Введите первое число: ");
        try {          
            number1 = input_n.nextFloat();

            FileWriter writer = new FileWriter("Task_2_4/log.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write("первое число: ");
            bufferWriter.write(Float.toString(number1));  
            bufferWriter.write("\n");
            bufferWriter.close() ; 
            writer.close();                   

        }
        catch (Exception e){
            FileWriter writer = new FileWriter("Task_2_4/log.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write("чтото пошло не так ");
            bufferWriter.write("\n");
            bufferWriter.close() ; 
            writer.close(); 
        }   


        System.out.printf("введите символ действия: (+,-,*,/) ");
        String calc_action = input_n.next();
 
        FileWriter writer1 = new FileWriter("Task_2_4/log.txt", true);
        BufferedWriter bufferWriter1 = new BufferedWriter(writer1);
        bufferWriter1.write("знак : ");
        bufferWriter1.write(calc_action);  
        bufferWriter1.write("\n");
        bufferWriter1.close() ; 
        writer1.close();



        System.out.printf("Введите второе число: ");

        try {          
            number2 = input_n.nextFloat();

            FileWriter writer = new FileWriter("Task_2_4/log.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write("второе число: ");
            bufferWriter.write(Float.toString(number2));  
            bufferWriter.write("\n");
            bufferWriter.close() ;                    
        }
        catch (Exception e){
            FileWriter writer = new FileWriter("Task_2_4/log.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write("чтото пошло не так ");
            bufferWriter.write("\n");
            bufferWriter.close() ; 
            writer.close();
        }   



        input_n.close();

        float result = 0;
        
        switch (calc_action){
            case ("+"):
                result = number1+number2;
                printRez(number1, calc_action, number2, result);
                break;
            case ("-"):
                result = number1-number2;
                printRez(number1, calc_action, number2, result);
                break;
            case ("*"):
                result = number1*number2;
                printRez(number1, calc_action, number2, result);
                break;
            case ("/"):
                result = number1/number2;
                printRez(number1, calc_action, number2, result);
                break;
            case default:
                FileWriter writer2 = new FileWriter("Task_2_4/log.txt", true);
                BufferedWriter bufferWriter2 = new BufferedWriter(writer2);
                bufferWriter2.write("неверный знак , вычисление невозможно "); 
                bufferWriter2.write("\n");
                bufferWriter2.close() ; 
                writer2.close();
                break;


        }
    }

    public static void printRez(Float number1, String calc_action, Float number2, Float result) throws IOException {
            FileWriter writer = new FileWriter("Task_2_4/log.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            String text = number1+ " "+ calc_action + " " + number2 + "=" + result;
            bufferWriter.write(text); 
            bufferWriter.write("\n");
            bufferWriter.close() ; 
            writer.close();

    }
}