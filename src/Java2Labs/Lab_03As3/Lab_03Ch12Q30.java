package Java2Labs.Lab_03As3;

import java.io.*;
import java.util.Scanner;

public class Lab_03Ch12Q30 {
    public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a filename: ");
        long[] counts=countLetters(input.nextLine());
        for (int i = 0; i < counts.length; i++) {
            System.out.println("Number of "+ new Character((char) (i+65)).toString() +"s: "+counts[i]);
        }
    }
    public static long[] countLetters(String fileName) throws IOException {
        long[] letters=new long[26];
        File file=new File(fileName);
        BufferedReader reader=new BufferedReader(new FileReader(file));
        while(reader.readLine()!=null) {
            String line = reader.readLine();
            if(line==null) continue;
            for (int i = 0; i < line.length(); i++) {
                if(Character.isLetter(line.charAt(i))) {
                    char ch=line.charAt(i);
                    if(ch<97) ch+=32;
                    letters[ch - 'a']++;
                }
            }
        }
        return letters;
    }
}
