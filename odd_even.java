// Write a java program to take one user input from the user and whether it is even or odd.
import java.util.Scanner;
class check
{
    int a;
    void checkodd()
    {
         if(a%2==0)
        System.out.println(a+" is  an Even Number");
        else if(a==0)
         System.out.println(a+" is undefine");
        else
        System.out.println(a+" is an Odd Number");
    }
    public static void main(String arr[])
    {
        check c=new check();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a value:-");
        c.a=sc.nextInt();
        c.checkodd();
    }
}