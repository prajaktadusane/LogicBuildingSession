/**Write a Java program that finds and prints the largest of three predefined 
numbers using if-else statements.  */

public class LargestNumber{
                 public static void main(String[] args){
                         int a=20;
                         int b=23;
                         int c=25;
                         int largestNumber;

                         if (a >= b && a >= c)
                        {
                          largestNumber=a;
                          }
                           else if (b >= a  && b >= c )
                            {
                               largestNumber=b;
                             }
                           else
                         {
                           largestNumber=c;
                           }
                        System.out.println("The largest number is  : "  +largestNumber);
                          }
                      }