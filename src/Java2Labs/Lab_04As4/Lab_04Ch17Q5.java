package Java2Labs.Lab_04As4;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class Lab_04Ch17Q5 implements Serializable{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Integer> ary = new ArrayList<>();
        for (int i = 1; i <= 6; i++) { ary.add(i); }
        float f = 10.5f;
        Date date = new Date(System.currentTimeMillis());

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Exercise17_05.dat"));
        objectOutputStream.writeObject(ary);
        objectOutputStream.writeObject(date);
        objectOutputStream.writeFloat(f);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Exercise17_05.dat"));
        ArrayList readArray = (ArrayList) objectInputStream.readObject();
        Date readDate = (Date)objectInputStream.readObject();
        float ff = objectInputStream.readFloat();
        objectInputStream.close();

        for (int i = 0; i < readArray.size(); i++) {
            System.out.println(readArray.get(i));
        }
        System.out.println(readDate.toString());
        System.out.println(ff);

    }

}
