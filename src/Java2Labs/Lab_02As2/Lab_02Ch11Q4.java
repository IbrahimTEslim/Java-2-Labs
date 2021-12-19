package Java2Labs.Lab_02As2;

import java.util.ArrayList;

public class Lab_02Ch11Q4 {
    public Integer getMax(ArrayList<Integer> arr){
        if(arr==null || arr.size()==0) return null;
        int max=arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if(arr.get(i)>max) max=arr.get(i);
        }
        return max;
    }
}
