package Java2Labs.Lab_03As3;

import java.util.Scanner;

public class Lab_03Ch12Q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] months = {"January", "February", "March", "April",
                "May", "June","July", "August", "September", "October",
                "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        try{
            System.out.print("Enter a number between 1 - 12 to print month days: ");
            System.out.println(dom[input.nextInt()-1]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Wrong Number !");
        }
    }
}
