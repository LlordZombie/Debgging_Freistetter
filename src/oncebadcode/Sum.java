package oncebadcode;// Program prompts user to enter a series of integers
// separated by spaces
// Program converts them to numbers and sums them

import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a series of integers separated by spaces (end to exit) >> ");
            String str = in.nextLine().strip();
            if (str.equals("end")) {
                break;
            }
            try{
            int sum = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).sum();
            System.out.println("The sum of the integers is " + sum+"\n");}
            catch (NumberFormatException e){
                System.out.println("\u001B[31m"+"Invalid input\n"+"\u001B[0m");
            }
        }
    }
}
