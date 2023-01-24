//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package Task_2_1;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;

public class program {
    public static void main(String[] args) throws IOException {
        Integer [] array = {10, 5, 26, 17, 7, 49, 0, 1};
        System.out.println(Arrays.toString(array));
        Boolean sorted_arr = false;
        Integer temp;
        FileWriter writer = new FileWriter("Task_4/log.txt");
        while(!sorted_arr) {
            sorted_arr = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    sorted_arr = false;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    try{
                        writer.write(Arrays.toString(array));
                        writer.write("\n");
                    }
                    catch (Exception e){
                        System.out.println("Что то пошло не так");
                    }
                }
                
            }
        }
        writer.close();
        System.out.println(Arrays.toString(array));
    }
}
