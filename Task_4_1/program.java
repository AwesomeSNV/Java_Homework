// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод(не void), который вернет “перевернутый” список.

package Task_4_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class program {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);
        System.out.println(ReverceList(list));
    }

    public static LinkedList ReverceList(LinkedList list) {
        ArrayList<Integer> arr= new ArrayList<>(); 
        arr.addAll (list);
            for (int i = 0; i<list.size(); i++){
                list.set(i,arr.get(list.size()-1-i));
            }
        return list;
    }
}