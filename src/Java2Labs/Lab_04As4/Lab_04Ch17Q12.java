package Java2Labs.Lab_04As4;

import java.io.*;

public class Lab_04Ch17Q12 {
    private static long filePointer = 0;
    public static void main(String[] args) throws IOException {
        if(args.length<2) {
            System.out.println("java Exercise17_12 SourceFile1 . . . SourceFilen TargetFile");
            return;
        }

        File[] files = new File[args.length-1];
        for (int i = 0; i < files.length; i++) { files[i] = new File(args[i]); }


        RandomAccessFile targetFile = new RandomAccessFile(args[args.length],"rw");

        for (int i = 0; i < files.length; i++) {
            readFileIntoTargetFile(files[i],targetFile);
            targetFile.seek(filePointer);
        }
        targetFile.close();
    }

    static void readFileIntoTargetFile(File in, RandomAccessFile target) throws IOException {
        String tempLine;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(in));
        while (bufferedReader.ready()){
            tempLine = bufferedReader.readLine();
            if(tempLine.isEmpty()) {
                target.writeByte('\n');
                filePointer++;
                continue;
            }
            filePointer+=tempLine.length()+1;
            target.writeBytes(tempLine+"\n");
        }
    }
}
