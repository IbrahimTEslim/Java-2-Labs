package Java2Labs.Lab_03As3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab_03Ch12Q13 {
    public static void main(String[] args) throws IOException {
       String fileName = args[0];
        BufferedReader reader=new BufferedReader(new FileReader(fileName));
        int characters=0,words=0,lines=0;
        while(reader.readLine()!= null){
            String line = reader.readLine();
            lines++;
            characters+=line.length();
            String[] wordsList=line.split(" ");
            words+=wordsList.length;
        }
        System.out.println("Characters: "+characters);
        System.out.println("Words: "+words);
        System.out.println("Lines: "+lines);
    }
}
