package Final_task;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих
import Final_task.Notebook;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Map<Integer, Notebook> nbDataBase = new HashMap<>();
        nbDataBase = fillData();

        System.out.println("Поиск и сортировка ноутбуков");
        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем жесткого диска");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        Scanner scan = new Scanner(System.in);
        Integer count = scan.nextInt();
        switch (count){
            case(1):{
                Set<Integer> choice = new TreeSet<>(); 
                for(int i = 1; i <= nbDataBase.size(); i++){
                    Notebook currentNb =  nbDataBase.get(i);
                    choice.add(currentNb.getRAM());

                }
                System.out.println("В наличии ноутбуки с объемом ОЗУ: ");
                System.out.println(choice);
                System.out.println("Введите желаемый объем ОЗУ: ");
                Integer countRAM = scan.nextInt();
                Boolean flag = false;
                for(int i = 1; i <= nbDataBase.size(); i++){
                    Notebook currentNb =  nbDataBase.get(i);
                    if(countRAM.equals(currentNb.getRAM())){
                        printNb(currentNb);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Ноутбуков с таким объемом оперативной памяти нет в наличии.");
                }
                break;
            }
            case(2):{
                Set<Integer> choice = new TreeSet<>(); 
                for(int i = 1; i <= nbDataBase.size(); i++){
                    Notebook currentNb =  nbDataBase.get(i);
                    choice.add(currentNb.getHDD());

                }
                System.out.println("В наличии ноутбуки с операционной системой: ");
                System.out.println(choice);
                System.out.println("Введите желаемую операционную систему: ");
                Integer countHDD = scan.nextInt();
                Boolean flag = false;
                for(int i = 1; i <= nbDataBase.size(); i++){
                    Notebook currentNb =  nbDataBase.get(i);
                    if(countHDD.equals(currentNb.getHDD())){
                        printNb(currentNb);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Ноутбуков с таким объемом HDD нет в наличии.");
                }
                break;
            }
            case(3):{
                Set<String> choice = new TreeSet<>(); 
                for(int i = 1; i <= nbDataBase.size(); i++){
                    Notebook currentNb =  nbDataBase.get(i);
                    choice.add(currentNb.getOS());

                }
                System.out.println("В наличии ноутбуки с ОС: ");
                System.out.println(choice);
                System.out.println("Введите желаемую ОС: ");
                String countOS = scan.next();
                Boolean flag = false;
                for(int i = 1; i <= nbDataBase.size(); i++){
                    Notebook currentNb =  nbDataBase.get(i);
                    if(countOS.equals(currentNb.getOS())){
                        printNb(currentNb);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Ноутбуков с такой ОС нет в наличии.");
                }
                break;
            }
            case(4):{
                Set<String> choice = new TreeSet<>(); 
                for(int i = 1; i <= nbDataBase.size(); i++){
                    Notebook currentNb =  nbDataBase.get(i);
                    choice.add(currentNb.getColour());

                }
                System.out.println("В наличии ноутбуки в цвете: ");
                System.out.println(choice);
                System.out.println("Введите желаемый цвет: ");
                String countColour = scan.next();
                Boolean flag = false;
                for(int i = 1; i <= nbDataBase.size(); i++){
                    Notebook currentNb =  nbDataBase.get(i);
                    if(countColour.equals(currentNb.getColour())){
                        printNb(currentNb);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Ноутбуков в таком цвете нет в наличии.");
                }
                break;
            }
        }
    }

    public static HashMap fillData(){    
        Notebook nb1 = new Notebook("ASUS", "Black", "Windows 10", 32, 1024, 100000);
        Notebook nb2 = new Notebook("Apple", "Pink", "MacOS", 16, 512, 150000);
        Notebook nb3 = new Notebook("Lenovo", "Silver", "Windows 11", 32, 2048, 70000);
        Notebook nb4 = new Notebook("Lenovo", "Black", "Windows 11", 16, 1024, 60000);
        Notebook nb5 = new Notebook("HP", "Silver", "Windows 10", 32, 512, 120000);
        Map<Integer, Notebook> DataBase = new HashMap<>();
        DataBase.put(1,nb1);
        DataBase.put(2,nb2);
        DataBase.put(3,nb3);
        DataBase.put(4,nb4);
        DataBase.put(5,nb5);
        return (HashMap) DataBase;
    }

    public static void printNb(Notebook currentNb){
        System.out.printf("Название: %s, Цвет: %s, ОС: %s, ОЗУ: %d, HDD %d, Цена %d \n",
        currentNb.getName(), currentNb.getColour(), currentNb.getOS(), currentNb.getRAM(), currentNb.getHDD(), currentNb.getPrice());
    }   
}
