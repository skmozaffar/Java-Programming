import java.util.Scanner;
 
public class Main{
    public static void main(String args[])
    {
   int number;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter any number ");
    number = s.nextInt(); // taking value form user..
 
    int temp = number, OuterSum=0, InnerSum=0; // declaring variables
    
    while(temp != 0)  // iterate loop till last digit
    {
        if(temp == number || temp < 10)  
            //Adds the first and last digits
            OuterSum = OuterSum + temp % 10;  
        else  
            //finds the mean digits and adds  
            InnerSum = InnerSum + temp % 10;
        temp = temp / 10;  
    }
    if(OuterSum==InnerSum) // condition for Xylem
    {
        System.out.println(number+" is a Xylem number");
    }
    else
    {
        System.out.println(number+" is a Phloem number");
    }
    }
}