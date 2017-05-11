import java.util.Scanner;

/*
*Steven Allen
*ITSE-1302
*4/6/2017
*Exercise 15
*Code reads an integer value then prints the even integers between 2 and the input value. 
*/

public class EvenIntegerSum
{
    public static void main(String[] args)
    {
        int intNumber = 0;
        int intSum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        intNumber = scan.nextInt();

        if (intNumber < 2)
        {
            System.out.println("Number entered not valid.");
        }
        else
            {
             System.out.println("Sum total of the even numbers between 2 and " + intNumber + " are: ");
              for (int intCount = 2; intCount <= intNumber; intCount += 2)
                 {
                if((intCount & 1) != 1)
                    {
                     intSum += intCount;
                        System.out.println(intCount);
                    }
                }
            System.out.println("Total sum is " + intSum);
            }
    }