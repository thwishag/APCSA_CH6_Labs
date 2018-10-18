package Sales;
/**
 * Name: Thwisha Guru
 * Date: 10/18/2018
 * Period: 1
 *
 * Sales.Sales.java
 *
 * Reads in and stores sales for each of 5 salespeople.  Displays
 * sales entered by salesperson id and total sales for all salespeople.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        //TODO 4) Prompt the user for the number of sales people that they need to enter
        System.out.print("How many sales people need to enter?");
        int people = scan.nextInt();
        //TODO 4) and modify the program to create an appropriately sized array.
        int [] sales = new int[people];

//        final int SALESPEOPLE = 5;
//        int[] sales = new int[SALESPEOPLE];
        int sum;

        for (int i=0; i < sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }
        //print the array for verification
        //System.out.println(Arrays.toString(sales));

        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i < sales.length; i++)
        {
            System.out.println("\t " + i + "\t\t\t" + sales[i]);
            sum += sales[i];
        }

        System.out.println("\nTotal sales: " + sum);


        //TODO 1b) Use your average method to print the average sales
        System.out.print("The average sales is " + average(sales));

        //TODO 2b) Use your indexOfMax method to print the index of the best sales person
        //TODO 2b) and the sales amount for that sales person.
        System.out.println("The person with the highest sales is Salesperson #" + indexOfMax(sales));
        System.out.println("They sold" + sales[indexOfMax(sales)] + "units.");

        //TODO 3b) Do the same for the worst sales person
        System.out.println("The person with the worst sales is Salesperson #" + indexofMin(sales));
        System.out.println("They sold" + sales[indexofMin(sales)] + "units.");
    }

    public static double average(int[] arr) throws IllegalStateException
    {
        double sum=0;
        //TODO 1a) compute and return the average of arr
        //Be sure to use the length instance variable and you may assume that the array is full.
        //If the array does not have at least 1 element in it, throw an IllegalStateException

       //If I find the avg of an array with no elements in it then divide by 0 which ain't possible.
        if (arr.length ==0)
        {
            throw new IllegalStateException();
        }
        else
           {
           for(int i =0; i<arr.length; i++)
           sum +=arr[i];
           }
            return sum/arr.length;
        }



    public static int indexOfMax(int[] arr)
    {
        //TODO 2a) find and return the index of the max value in arr
        int max = Integer.MIN_VALUE;
        int maxLocation = -1;
        for (int i = 0; i < arr.length; i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
                maxLocation = i;
            }
    }
        return maxLocation;

    }


    //TODO 3a) Do the same for an indexOfMin method
    public static int indexofMin(int[] arr)
    {
        int min = Integer.MIN_VALUE;
        int minLocation = -1;
        for (int i = 0; i < arr.length; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
                minLocation = i;
            }
        }
        return minLocation;

    }



}
