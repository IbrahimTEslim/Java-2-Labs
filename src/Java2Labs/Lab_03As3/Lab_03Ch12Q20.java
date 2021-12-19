package Java2Labs.Lab_03As3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab_03Ch12Q20 {
    public static void main(String[] args) throws IOException {
        String root=args[0];
        String ch="chapter";
        for (int i = 0; i < 34; i++) {
            String tempName=ch+i ;
            removeFirstLine(tempName);
        }
    }
    public static void removeFirstLine(String filename) throws IOException {
        BufferedWriter buf=new BufferedWriter(new FileWriter(filename));
        Scanner file=new Scanner(filename);
        file.nextLine();
        while(file.hasNextLine()){
            String temp=file.nextLine();
            if(temp=="\n") buf.newLine();
            else buf.write(temp);
        }
        buf.close();
    }
}
