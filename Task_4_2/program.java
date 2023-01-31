//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.

package Task_4_2;

import java.util.LinkedList;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str  = "";
        String element="";
        LinkedList<String> list = new LinkedList<>();
        while (!str.equals("0")){
            System.out.println("Введите команду:");
            System.out.println("1-поместить элемент в конец очереди:"); 
            System.out.println("2-вернуть первый элемент из очереди и удаляет его:");
            System.out.println("3-вернуть первый элемент из очереди, не удаляя:");
            System.out.println("0-окончание работы");
            str = scan.nextLine();
            switch (str){
            case ("1"):
                System.out.println("введите элемент списка:");
                str = scan.nextLine();
                list  = enqueue(list, str);
                break;
            case ("2"):                
                element = list.get(0);
                list  = dequeue(list);
                System.out.printf("Первый элемент списка: %s \n", element);
                break;
            case ("3"):
                element = first(list);
                System.out.printf("Первый элемент списка: %s \n", element);
                break;
            }
            System.out.println("Список");
            System.out.println(list);
        }

    }
    public static LinkedList<String> enqueue(LinkedList list, String str) {
        list.add(str);
        return list;
    }

    public static LinkedList<String> dequeue(LinkedList list) {
        if (!list.isEmpty()){
            list.remove(0);   
        }
        else{
            System.out.println("список уже пуст.");
        }
        return list;
    }

    public static String first(LinkedList list) {
        String firstElem = (String) list.get(0);
        return firstElem;
    }
}