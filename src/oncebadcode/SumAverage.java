package oncebadcode;

// Sum and average an array of integers
public class SumAverage {
    public static void main(String[] args) {
        int[] someNums = {4, 17, 22, 8, 35};
        int tot = 0;
        for (int someNum : someNums) {
            tot += someNum;
        }
        System.out.println("Sum is "+ tot); System.out.println("Average is " + tot/someNums.length);
    }
}
