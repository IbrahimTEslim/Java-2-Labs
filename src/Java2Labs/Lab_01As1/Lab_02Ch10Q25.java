package Java2Labs.Lab_01As1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Lab_02Ch10Q25 {
    public static void main(String[] args) {
        String text="aa#b?cd?fd#df?dfd?";
        String[] arr=split(text,"[?#]");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static String[] split(String str, String regex) {
        List<String> list=new ArrayList<>();
        HashSet<Character> set=new HashSet<>();
        if(regex.length()>1){
            for (int i = 1; i < regex.length()-1; i++) { set.add(regex.charAt(i)); }
        }
        else set.add(regex.charAt(0));
        int start=0;
        for (int i = 0; i < str.length(); i++) {
            if(set.contains(str.charAt(i))) {
                list.add(str.substring(start,i));
                list.add(String.valueOf(str.charAt(i)));
                start=i+1;
            }
        }
        list.add(str.substring(start));
        String[] array = new String[list.size()];
        list.toArray(array);
        return array;
    }
}
