package Java2Labs.Lab_03As3;

import java.io.*;

public class Lab_03Ch12Q27 {
    public static void main(String[] args) throws IOException {
           if(args[1]=="*"){
               File rootPath=new File(System.getProperty("user.dir"));
               File[] listofFiles=rootPath.listFiles();
               for (int i = 0; i < listofFiles.length; i++) { if(listofFiles[i].isFile()) {
                   replaceWords(listofFiles[i].getName()); }
               }
           }
           else{ for (int i = 0; i < args.length; i++) { replaceWords(args[i]);} }
    }
    public static void replaceWords(String name) throws IOException {
        File file = new File(name);
        File temp = new File(Long.toString(System.currentTimeMillis())+".txt");
        temp.createNewFile();
        FileWriter fileWriter=new FileWriter(temp);
        BufferedReader reader=new BufferedReader(new FileReader(file));
        while (reader.readLine()!= null){
            String[] line = reader.readLine().split(" ");
            for (int i = 0; i < line.length; i++) {
                if(line[i].matches("^Exercise\\d_\\d$")){
                    boolean[] res=checkOneDigit(line[i]);
                    StringBuilder newName=new StringBuilder(line[i]);
                    if(res[0]){ newName.insert(8,'0'); }
                    if(res[1]) { newName.insert(newName.length()-1,'0');}
                    line[i]=newName.toString();
                }
            }
            fileWriter.write(combineWords(line));
        }
        fileWriter.close();
        file.delete();
        temp.renameTo(new File(name));
    }
    private static boolean[] checkOneDigit(String word) {
        boolean[] res=new boolean[2];
        String[] arr=word.split("Exercise");
        String[] numbers=arr[1].split("_");
        if(Integer.parseInt(numbers[0])>10) res[0] = true;
        if(Integer.parseInt(numbers[1])>10) res[1] = true;
        return res;
    }
    private static String combineWords(String[] arr) {
        String res="";
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr.length-1) res+=arr[i]+" ";
            else res+=arr[i];
        }
        return res;
    }
}
