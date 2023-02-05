// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности Имени.

package Task_5_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class program {
    public static void main(String[] args) {

        Map<Integer, List<String>> db = new HashMap<>();
        db.put(1, List.of("Иван", "Иванов"));
        db.put(2, List.of("Светлана", "Петрова"));
        db.put(3, List.of("Кристина", "Белова"));
        db.put(4, List.of("Анна", "Мусина"));
        db.put(5, List.of("Анна", "Крутова"));
        db.put(6, List.of("Иван", "Юрин"));
        db.put(7, List.of("Петр", "Лыков"));
        db.put(8, List.of("Павел", "Чернов"));
        db.put(9, List.of("Петр", "Чернышов"));
        db.put(10, List.of("Мария", "Федорова"));
        db.put(11, List.of("Марина", "Светлова"));
        db.put(12, List.of("Мария", "Савина"));
        db.put(13, List.of("Мария", "Рыкова"));
        db.put(14, List.of("Марина", "Лугова"));
        db.put(15, List.of("Анна", "Владимирова"));
        db.put(16, List.of("Иван", "Мечников"));
        db.put(17, List.of("Петр", "Петин"));
        db.put(18, List.of("Иван", "Ежов"));

        ArrayList<String> array = new ArrayList<>(); 
        // List<String> prom = new ArrayList
   
        for (int i:db.keySet()){
            array.addAll(db.get(i));
        }

        Map <String, Integer> names = new HashMap<>();
        for (int i = 0; i< array.size();i=i+2){
            if (names.containsKey(array.get(i))){
                names.replace(array.get(i), names.get(array.get(i)) + 1);
            }
            else{
                names.put(array.get(i), 1);
            }
        } 

        List <String> sortedNames = new ArrayList<>();
        
        String key = "";
        // System.out.println(names);
        while (!names.isEmpty()){
            int count = 0;
            for (String nameKey:names.keySet()) {
                if (names.get(nameKey)>count){
                    count = names.get(nameKey);
                    key = nameKey;
                }
            }
            sortedNames.add(key + Integer.toString(names.get(key)));
            names.remove(key);
        }
        System.out.println(sortedNames);
    }
}