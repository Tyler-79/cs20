package mastry;

import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }

    // Driver Program
    public static void main(String args[])
    {
        int num;
        final int max;
        
      //Create Scanner object
      		Scanner userinput = new Scanner(System.in);
      				
      		//Get the number from the user
      		System.out.print("Enter the minimum number:  ");
      		num = userinput.nextInt();
      		
      		System.out.print("Enter the maximum number:  ");
      		max = userinput.nextInt();
      		
      	//show the user if the numbers are a prime number or not	
        if (isPrime(num)) {
           System.out.println(num + " is prime number");
        }
        else {
            System.out.println(num + " is not prime number");
        }
        if (isPrime(max)) {
            System.out.println(max + " is prime number");
         }
         else {
             System.out.println(max + " is not prime number");
         }
        //show the user all the prime numbers between the two given numbers
    for (int i = num; i <= max; i++) {
        if (isPrime(i)) {
            System.out.println(i);
        }
    }
    }
}