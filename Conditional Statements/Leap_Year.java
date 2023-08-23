/*
---------------------------------------------------------------------------------------------
In this java programming tutorial we will write a program to check if a year is LEAP year or not.

Concept of Leap Year -
The rule states:
“Every year that is exactly divisible by four is a leap year, except for years that are exactly divisible by 100,
 but these centurial years are leap years if they are exactly divisible by 400.”

For example,
if year = 2400, it is leap year,(Condition 1 satisfied)
but if year = 2200, is NOT a leap year, (Cond. 2 not satisfied),
and if year = 2020, is a leap year, (Cond. 2 satisfied).

To check whether a year is a leap year or not, you need to check the following 3 conditions:
IF
1. Any year that is divisible by 400 is definitely a leap year.
ELSE IF
2. If divisible by 4 AND not divisible by 100 then a leap year.
ELSE
not a leap year.
 */

 import java.util.Scanner;

 public class Leap_Year {
     public static void main(String[] args) {
         int year;
 
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a Year: ");
         year = sc.nextInt();
        
         if ((year%4==0) && (year%100!=0)) {
            System.out.println("Given Year is leap Year");
         }
         else if (year % 400 == 0){
            System.out.println("Given Year is leap Year");
         }else{
            System.out.println("Given Year is NOT a leap Year");
         }

         sc.close();
     }
 }
 