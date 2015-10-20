
import java.util.Scanner;
public class HW04_P2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] list = new double[10];
        int [] intlist = new int[10];
        for (int k =0 ; k<10;k++)
        {
            System.out.println("Give decimal number "+ (k+1)+" :");
            double userInput = input.nextDouble();
            list[k]= userInput;
            intlist[k]=(int)(userInput);

        }
        double doubleAverage = average(list);
        int intAverage = average(intlist);

        System.out.println("The double average is :"+ doubleAverage);
        System.out.println("The int average is :"+ intAverage);
    }
    public static int average(int[] array)
    {
            int sum = 0;

            for (int k =0 ; k<array.length;k++)
            {
                sum += (int)array[k];
            }

            return sum/(array.length);

    }
    public static double average(double[] array)
    {
        double sum = 0;

        for (int k =0 ; k<array.length;k++)
        {
            sum += array[k];
        }

        return sum/(array.length);

    }
}
/*
Analysis:
    The input for this problem is 10 numbers entered by the user. The task is to take the 10 doubles entered and find the int average and the double average. The output is the
     average in double and int form.
Design:
    The first step is to make 2 functions. One in for int average and one is for the double average. With these fucntions we can parse thought the array that is used as the argument for the methods.
    Then find the average with both methods and return that value back to main which then prints out the values.
Testing:
    Test the data with 10 valid doubles first. I used 1-10. Then use this data in order to calculate the double and int averages. If the outputted valeus are correct with the average of the numbers entered the
     program works. This is under the assumption that the program is with valid data.
 */