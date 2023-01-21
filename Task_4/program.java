/* Дополнительно*+ Задано уравнение вида x + y = z. И (x, y, z) >= 0. 
 Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
 Вывод 24 + 45 = 69
*/

package Task_4;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.function.ToIntFunction;

public class program {
    public static void main(String[] args) {
        
        String str = "6? + ?5 = 69";
        String str1 = str.replaceAll("\\s","");
        String[] words = str1.split("\\+|=");
       
        String num_str = "";

        Integer[] numbers = new Integer[3];
        numbers[2] = Integer.parseInt(words[2]);

        for (int i=0; i<numbers.length-1; i++)

            if (words[i].contains("?")) {
                numbers[i] = Integer.parseInt(words[i].replaceAll("\\?","0"));
            }
            else{
                numbers[i] = Integer.parseInt(words[i]);
            }    

        int numSumDigits = numbers[2]-numbers[0]-numbers[1]; 
        int signPosition;
        String[] newWords = new String[3];
        String signToReplace;
        String numSumDigitsStr;
        
        if (numSumDigits>=0){
            numSumDigitsStr = Integer.toString(numSumDigits);
            if (numSumDigitsStr.length()==1){
                numSumDigitsStr = "0"+numSumDigitsStr;
            }
            for (int i=0; i<words.length; i++){

                if (words[i].contains("?")) {

                    signPosition = words[i].indexOf("?");
                    signToReplace = Character.toString(numSumDigitsStr.charAt(signPosition));
                                        
                    System.out.println(numSumDigits);
                    System.out.println("");
                 
                    newWords[i] = words[i].replaceAll("\\?",signToReplace);

                }
                else {
                    newWords[i] = words[i];
                }

            }
            
            for (String numm : newWords) {
                System.out.println(numm);     
            }
            System.out.println("");  
            System.out.printf("%s + %s = %s", newWords[0], newWords[1], newWords[2] );        
            
        }
        else{
            System.out.println("решения нет");
        }

    }

    public static int power(int a, int b){
		int result = 1;
		for (int i=1; i<=b; i++){
			result = result*a;
		}
		return result;
	}	

}