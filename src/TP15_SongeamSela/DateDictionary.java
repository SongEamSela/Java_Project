package TP15_SongeamSela;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class DateDictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> words = new HashMap<String, String>();
        words.put("Monday","ចន្ទ");
        words.put("Tuesday","អង្គារ");
        words.put("Wednesday","ពុធ");
        words.put("Thursday","​ព្រហស្បតិ៍");
        words.put("Friday","សុក្រ");
        words.put("Saturday","សៅរ៍");
        words.put("Sunday","អាទិត្យ");
        words.put("January","មករា");
        words.put("February","កុម្ភះ");
        words.put("March","មិនា");
        words.put("April","មេសា");
        words.put("May","ឱសភា");
        words.put("June","មិថុនា");
        words.put("July","កក្ដដា");
        words.put("August","សីហា");
        words.put("September","កញ្ញា");
        words.put("October","តុលា");
        words.put("November","វិច្ឆិកា");
        words.put("December","ធ្នូ");

        System.out.print("Input a word : ");
        String word = sc.nextLine();
        int countCheck =0;

        Iterator<Map.Entry<String, String>> iterator = words.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,String> pair = (Map.Entry<String, String>) iterator.next();
            if (pair.getKey().equalsIgnoreCase(word)){
                System.out.println(pair.getKey()+" = "+ pair.getValue());

            }
            else if (word.equals(pair.getValue())){
                System.out.println(pair.getValue() + "​​ = " + pair.getKey());

            }
            else {
                countCheck++;
            }

        }
        if (countCheck==words.size()){
            System.out.println("Not match any words in the dictionary.");
        }


    }
}
