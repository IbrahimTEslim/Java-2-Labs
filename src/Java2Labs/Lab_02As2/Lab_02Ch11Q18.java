package Java2Labs.Lab_02As2;

import java.util.ArrayList;

public class Lab_02Ch11Q18 {
    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> arr=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            arr.add(s.charAt(i));
        }
        return arr;
    }
}
