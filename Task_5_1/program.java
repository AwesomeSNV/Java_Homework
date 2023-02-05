// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package Task_5_1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        Map <String, List<Integer>> db = new HashMap<>();

        db.put("Иванов", List.of(22222,11111));
        db.put("Петров", List.of(33333));
        db.put("Сидоров", List.of(44444,55555,66666));

        printDataBase(db);
        Scanner scan = new Scanner(System.in, "Cp866" );
        System.out.println("введите фамилию абонента: ");
        String name  = scan.next();

        printAbonent(db,name);
        scan.close();

    }

    public static void printDataBase(Map <String, List<Integer>> db) {

        for (String person: db.keySet()){
            System.out.printf("Фамилия: %s \n", person);
            Integer count = 0;
            for (Integer phoneNumber:db.get(person)){
                count++;
                System.out.printf(" номер %d: %d,",count,phoneNumber);
            }
            System.out.println("");
        }
    }
    public static void printAbonent(Map <String, List<Integer>> db, String person) {

        if (db.containsKey(person)){
            Integer count = 0;
            for (Integer phoneNumber:db.get(person)){
                count++;
                System.out.printf(" номер %d: %d,",count,phoneNumber);
            }
            System.out.println("");
        }
        else{
            System.out.println("такой абонент не обнаружен \n");
        }

    }

}