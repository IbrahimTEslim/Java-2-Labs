package Java2Labs.Lab_04As4;

import java.io.*;
import java.util.Scanner;

public class Lab_04Ch17Q16 {
    public static void main(String[] args) throws IOException {
        int[] frequency = new int[26];

        System.out.print("Enter file name to count frequency character: ");
        Scanner input = new Scanner(System.in);

        File file = new File(input.next());
        FileInputStream inputStream = new FileInputStream(file);

        while (inputStream.available()>0){
            char ch = (char) inputStream.read();
            if(Character.isLetter(ch)){
                ch = Character.toLowerCase(ch);
                frequency[ch-'a']++;
            }
        }

        System.out.println("Characters Frequency: ");
        for (int i = 0; i < 26; i++) {
            System.out.println((char)('a'+i)+": "+frequency[i]);
        }
    }
}
