package leetCode;

import java.util.*;

public class WordPattern290 {
    public static boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new LinkedHashMap<>();
        String[] array = s.split(" ");
        if (pattern.length() != array.length) return false;

        for (int i=0 ; i<array.length ; i++){
            if (map.containsKey(pattern.charAt(i))){
                String res = map.get(pattern.charAt(i));
                if (!res.equals(array[i]))
                    return false;
            } else if (map.containsValue(array[i])) {
                return false;
            } else {
                map.put(pattern.charAt(i),array[i]);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        //System.out.println(wordPattern("abba" , "dog dog dog dog"));
    }
}
