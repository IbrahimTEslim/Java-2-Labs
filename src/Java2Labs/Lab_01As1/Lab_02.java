package Java2Labs.Lab_01As1;

public class Lab_02 {
    public static void main(String[] args) {
        MyInteger intObj=new MyInteger(8);
        System.out.println(intObj.getValue());
        System.out.println(intObj.isEven());
        System.out.println(intObj.isOdd());
        System.out.println(intObj.isPrime());

        System.out.println(MyInteger.isEven(new MyInteger(7)));
        System.out.println(MyInteger.isOdd(new MyInteger(7)));
        System.out.println(MyInteger.isPrime(new MyInteger(7)));

        System.out.println(intObj.equal(8));
        System.out.println(intObj.equal(new MyInteger(10)));

        System.out.println(intObj.parseInt(new char[]{'2','4','6','8'}));
        System.out.println(intObj.parseInt("8642"));


    }
    static class MyInteger{
        private int value=0;
        public MyInteger(int value) { this.value= value; }
        public int getValue() { return value; }

        public boolean isEven() { return this.value % 2 == 0;}
        public boolean isOdd() { return this.value % 2 != 0;}
        public boolean isPrime() {
            if(this.value %2 == 0) return false;
            for (int i = 2; i < this.value; i++) { if(this.value % i == 0) return false; }
            return true;
        }

        public static boolean isEven(MyInteger obj) { return obj.value % 2 == 0;}
        public static boolean isOdd(MyInteger obj) { return obj.value % 2 != 0;}
        public static boolean isPrime(MyInteger obj) {
            if(obj.value %2 == 0) return false;
            for (int i = 2; i < obj.value; i++) { if(obj.value % i == 0) return false; }
            return true;
        }

        public boolean equal(int v){return  this.value==v;}
        public boolean equal(MyInteger v){return  this.value==v.value;}

        public int parseInt(char[] arr){ return Integer.parseInt(String.valueOf(arr)); }
        public int parseInt(String number){ return Integer.parseInt(number); }
    }
}
