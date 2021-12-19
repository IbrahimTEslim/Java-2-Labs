package Java2Labs.Lab_04As4;

import java.util.ArrayList;

public class Lab_04Ch19Q10 {
    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        if(list.size() == 0) return null;
        E smallest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(smallest.compareTo(list.get(i)) > 0) { smallest = list.get(i); }
        }
        return smallest;
    }
}
