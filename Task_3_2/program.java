// Задан целочисленный список ArrayList.
//  Найти минимальное, максимальное и среднее ариф.
//  из этого списка

package Task_3_2;

import java.util.ArrayList;
import java.util.Random;

public class program {
    public static void main(String[] args) {

        Random rnd = new Random();
        Integer arrayLenght =rnd.nextInt(1, 10);
        System.out.printf("Длина исходного массива %d \n", arrayLenght );
        ArrayList<Integer> ArrayList = new ArrayList<>();
        ArrayList = ArrayGen(ArrayList, arrayLenght);
        
        ArrayPrint(ArrayList);
        System.out.printf("Минимальный элемент массива  =  %d \n",listMin(ArrayList));
        System.out.printf("Максимальный элемент массива  =  %d \n",listMax(ArrayList));
        System.out.printf("Среднее арифметическое значений массива  =  %f \n",listAverage(ArrayList));
    }

    public static ArrayList<Integer> ArrayGen(ArrayList ArrList, Integer count) {
        Random rnd = new Random();
        for (int i=0; i<count; i++){
            ArrList.add(rnd.nextInt(0, 10));
        }
        return ArrList;
    }

    public static void ArrayPrint(ArrayList arr) {
        for (int i=0; i<arr.size(); i++){
            System.out.printf(" %d",arr.get(i));   
        }
        System.out.println("");     
    }

    public static Integer listMin(ArrayList arr) {
        Integer min = (Integer) arr.get(0);
        for (int i = 1; i<arr.size();i++){
            if ((Integer) arr.get(i)<min){
                min = (Integer) arr.get(i);
            }
        }
        return min;
    }

    public static Integer listMax(ArrayList arr) {
        Integer max = (Integer) arr.get(0);
        for (int i = 1; i<arr.size();i++){
            if ((Integer) arr.get(i)>max){
                max = (Integer) arr.get(i);
            }
        }
        return max;
    }

    public static float listAverage(ArrayList arr) {
        float average = 0;
        for (int i = 1; i<arr.size();i++){
            average = average+(Integer) arr.get(i);
        }
        average = average/arr.size();
        return average;
    }
}