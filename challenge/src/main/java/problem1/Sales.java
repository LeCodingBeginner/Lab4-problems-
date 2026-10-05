package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        Scanner scan = new Scanner(System.in);

        /*
        for (int i=0; i<sales.length; i++)
        {
            int id = i+1;
            System.out.print("Enter sales for salesperson " + id + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            int id = i+1;
            System.out.println(" " + id + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);

         */

        // new implementation of the length of salesmen:
        System.out.print("Enter the number of salesmen : ");
        int salesmenNumber = scan.nextInt();

        int[] sales_ = new int[salesmenNumber];

        for(int i = 0; i<salesmenNumber; i++){
            int id = i+1;
            System.out.print("Enter sales for salesperson " + id + ": ");
            sales_[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<salesmenNumber; i++)
        {
            int id = i+1;
            System.out.println(" " + id + " " + sales_[i]);
            sum += sales_[i];
        }
        System.out.println("\nTotal sales: " + sum);

        // My work:

        // let's compute the average sale:
        double avg_sale = (double) sum/5.0;

        // maximum sale and minimum sale ( I opted for another loop for the sake of clarity):
        int max = 0;
        int min = sales_[0];
        int min_idx = 0;
        int max_idx = 0;
        for (int i = 0; i<salesmenNumber; i++ ){
            if (max<=sales_[i]){
                max = sales_[i];
                max_idx = i;
            }
            if(min>= sales_[i]){
                min = sales_[i];
                min_idx = i;
            }
        }

        // id adaptation:
        min_idx++;
        max_idx++;

        // let's print everything out:
        System.out.println("The average of the sales is : " + avg_sale);
        System.out.println("The max of the sales is : " + max +"\n The salesman having it, is : " + max_idx);
        System.out.println("The min of the sales is : " + min +"\n The salesman having it, is : " + min_idx);

        // let's get the user input:
        System.out.print("Enter a value: ");
        int value = scan.nextInt();
        int count_exceeding = 0;

        for (int i = 0; i<salesmenNumber; i++){
            if (sales_[i] >= value){
                count_exceeding++;
                int id = i+1;
                System.out.println("Salesman of id " + id + "Has sold " + " product(s).");
            }
        }

        System.out.println("The number of salesman who's sales exceeded " + value + " is : " + count_exceeding);





    }
}