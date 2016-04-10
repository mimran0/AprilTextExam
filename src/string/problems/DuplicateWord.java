package string.problems;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by mrahman on 4/9/16.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

          String s[]= st.split(" ");





        Map<String, Integer> mp= new TreeMap<String, Integer>();
        for(int i=0;i<s.length;i++){

            Integer count=mp.get(s[i]);
            if(count == null){
                count=0;
            }
            mp.put(s[i],++count);
        }



        System.out.println(mp.size());
        System.out.println(mp.get("is"));




    }

}
