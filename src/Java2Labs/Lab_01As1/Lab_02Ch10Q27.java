package Java2Labs.Lab_01As1;
public class Lab_02Ch10Q27 {
    static class MyStringBuilder1 {
        private char[] value=new char[32];
        private int size=0,capacity= value.length;

        public MyStringBuilder1(String str) {
            while (str.length()>value.length) { value=new char[value.length*2]; }
            for (int i = 0; i < str.length(); i++) { value[i]=str.charAt(i); }
            size=str.length();  capacity=value.length;
        }
        public int length() { return size; }
        public String toString() {
            String temp="";
            for (int i = 0; i < size; i++) { temp+= value[i]; }
            return temp;
        }
        public MyStringBuilder1 append (MyStringBuilder1 str) {
            char[] temp=value;
            while (str.length()>this.capacity-this.size){
                value=new char[value.length*2];
                capacity= value.length;
            }
            int i;
            for (i = 0; i < size; i++) { value[i]=temp[i]; }
            String temp_str=str.toString();
            for (int j = 0; j < str.length(); j++) { value[i++]=temp_str.charAt(j); }
            size+=temp_str.length();
            capacity = value.length;
            return this;
        }
        public MyStringBuilder1 append(int i) {
            String temp_str= String.valueOf(i);
            this.append(new MyStringBuilder1(temp_str));
            return this;
        }
        public char charAt(int index) { return value[index]; }
        public MyStringBuilder1 toLowerCase() {
            char[] temp = new char[value.length];
            for (int i = 0; i < size; i++) {
                if(value[i]>64 && value[i]<91) temp[i]= (char) (value[i]+32);
                else temp[i]=value[i];
            }
            String temp_str="";
            for (int i = 0; i < size; i++) { temp_str += temp[i]; }
            return new MyStringBuilder1(temp_str);
        }
        public MyStringBuilder1 substring(int begin,int end) {
            String temp_str="";
            for (int i = begin; i < end; i++) { temp_str+=value[i]; }
            return new MyStringBuilder1(temp_str);
        }
    }
}
