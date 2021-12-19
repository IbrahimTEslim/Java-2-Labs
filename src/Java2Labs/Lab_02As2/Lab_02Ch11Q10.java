package Java2Labs.Lab_02As2;
import java.util.ArrayList;
public class Lab_02Ch11Q10 {
    public static void main(String[] args) {
        Stack s= new Stack();
        s.push("Hello");
        s.push("World!");
        System.out.println(s.getSize());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
    static class Stack extends ArrayList<String> {
        private int size=0;
        public Stack (){ }
        public String pop(){
            String temp = super.get(size-1);
            super.remove(size-1);
            size--;
            return temp;
        }
        public String peek(){ return super.get(size-1); }
        public String push(String value){
            super.add(value);
            size++;
            return value;
        }
        public boolean isEmpty() { return size == 0; }
        public int getSize(){ return size; }
    }
}
