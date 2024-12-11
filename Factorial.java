class Factorial
{
public static void main (String[] arg)
{
int n=5;
int factorial=1;
for(int i=1; i<=n; i++)
{
System.out.println(factorial*=i);
}}}