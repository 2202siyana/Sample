import java.util.Scanner;
 class Integers
{
public static void main (String[] args)
{
  Scanner myObj = new Scanner(System.in);
 
System.out.println("Enter the first integer");
  int a=myObj.nextInt();

System.out.println("Enter the second integer");
  int b=myObj.nextInt();

System.out.println("Enter the third integer");
  int c=myObj.nextInt();

System.out.println("Enter the fourth integer");
 int d=myObj.nextInt();

if(a==b && b==c && c==d)
{

System.out.println("integers are equal");
}
else

{
  System.out.println("integers are not equal");
}
}
}