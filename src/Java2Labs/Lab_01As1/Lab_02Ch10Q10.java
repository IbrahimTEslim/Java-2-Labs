package Java2Labs.Lab_01As1;
public class Lab_02Ch10Q10 {
    public static void main(String[] args) {
        Queue q = new Queue();
        for (int i = 1; i <= 20; i++) { q.enqueue(i); }
        for (int i = 0; i < 20; i++) { System.out.print(q.dequeue()+" "); }
    }
    static class Queue{
        private int[] data;
        private int size;
        public Queue() { data = new int[8]; }
        public void enqueue(int v) {
            if(size == data.length) {
                int[] temp = new int[data.length*2];
                for (int i = 0; i < data.length; i++) { temp[i]=data[i]; }
                data = temp;
            }
            data[size++] = v;
        }
        public int dequeue() {
            int temp = data[0];
            for (int i = 0; i < size; i++) { data[i]=data[i+1]; }
            size--; return temp;
        }
        public boolean isEmpty() {  return size==0; }
        public int getSize() { return size; }
    }
}
