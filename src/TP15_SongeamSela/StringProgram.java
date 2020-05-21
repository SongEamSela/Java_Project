package TP15_SongeamSela;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class StringProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> list_string = new ArrayList<>();
        String input;
        boolean state = true ;
        String tmp ="";
        HashMap<Character, Integer> list_char = new HashMap<>();

        do {
            System.out.print("Input String = ");
            input = sc.nextLine();
            list_string.add(input);
            if (input.equalsIgnoreCase("end")){
                state = false;
            }
        }while (state);

        System.out.println("List of input Strings"+list_string);
        //sorting list of string
        Collections.sort(list_string);
        System.out.println("Sorted list of input Strings"+list_string);


        list_char.put('a',0);
        list_char.put('b',0);
        int sumOfChar=0;

        Iterator<Map.Entry<Character, Integer>> iterator = list_char.entrySet().iterator();

        for (int i = 0; i<list_string.size(); i++){  //loop to each string in list
            for (int j =0 ; j<list_string.get(i).length();j++){ //loop to each char in string
                while (iterator.hasNext()){
                    Map.Entry<Character,Integer> map = iterator.next();
                    if (map.getKey().equals(list_string.get(i).charAt(j))){
                        list_char.replace(map.getKey(),map.getValue()+1);
                        System.out.println("a");
                    }
                    else {
                        list_char.put(list_string.get(i).charAt(j), 1);
                        System.out.println("b");
                    }
                }

            }
        }

        for (Map.Entry map : list_char.entrySet()){
            sumOfChar = sumOfChar + (Integer)map.getValue();
            System.out.println("c");
        }

        for (Map.Entry map : list_char.entrySet()){
            System.out.println("character "+map.getKey()+" have "+(((Integer)map.getValue()/sumOfChar)*100)+"% in the list ");
        }
    }
}
