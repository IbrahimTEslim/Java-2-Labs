package Java2Labs.Lab_04As4;

public class Lab_04Ch19Q4 {
    public static void main(String[] args) {
        Pair<String> p = new Pair<>("hello","ibrahim");
        System.out.println(getSmallest(p).toString());
    }

    static <E> E getSmallest(Pair p ) {
      if(p.getE1().compareTo(p.getE2())>0) return (E) p.getE2();
      else if(p.getE1().compareTo(p.getE2()) == 0) return (E)p.getE1();
      else return (E)p.getE1();
    }


    static class Pair<E extends Comparable<E>> {
        private E e1,e2;

        public E getE1() {
            return e1;
        }

        public E getE2() {
            return e2;
        }

        public Pair (E e1, E e2) {
            this.e1 = e1;
            this.e2 = e2;
        }
    }
}
