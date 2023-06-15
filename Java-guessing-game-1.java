// MINI PROJECT
package com.example.newstart;

import java.util.Scanner ;
public class HelloApplication
{
    public static void main (String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        do{
            System.out.println("Guess My Number :");
            userNumber = sc.nextInt();

            if (userNumber== myNumber)
            {
                System.out.println("Woow Correct Guess");
                break;
            }
            else if(userNumber>myNumber)
            {
                System.out.println("Your Number Is Too Large");
            }
            else
            {
                System.out.println("Your Number Is Too Small");
            }
        }while (userNumber>=0);
        System.out.println("MY NUMBER WAS " + myNumber);
    }
}
