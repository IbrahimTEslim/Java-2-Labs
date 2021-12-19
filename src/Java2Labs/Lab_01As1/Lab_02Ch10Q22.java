package Java2Labs.Lab_01As1;

public class Lab_02Ch10Q22 {
    public static void main(String[] args) {

    }
    static class MyString1{
        final char[] string;
        public MyString1(char[] arr) { string = arr; }
        public char charAt(int index) { return string[index]; }
        public int length() { return string.length; }
        public MyString1 subString(int begin,int end){
            char[] temp=new char[end-begin];
            for (int i = 0; i < temp.length; i++) { temp[i]=string[begin+i]; }
            return new MyString1(temp);
        }
        public MyString1 toLowerCase() {
            char[] temp=new char[string.length];
            for (int i = 0; i < string.length; i++) {
                if(string[i] < 91 && string[i]> 64) temp[i]= (char) (string[i]+32);
                else temp[i]=string[i];
            }
            return new MyString1(temp);
        }
        public boolean equals(MyString1 str){
            if(string.length!=str.length()) return false;
            for (int i = 0; i < string.length; i++) { if(string[i] != str.charAt(i)) return false; }
            return true;
        }
        public static MyString1 valueOf(int i){
            char[] temp=new char[32];
            int pointer=31;
            while (i>=0){ temp[pointer--]= (char)((i%10)+48); i/=10; }
            char[] temp2=new char[31-pointer];
            for (int j = 0; j <= 31-pointer; j++) {temp2[j]=temp[pointer++]; }
            return new MyString1(temp2);
        }
    }
}
