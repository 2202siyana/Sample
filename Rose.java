class Sample
{
public static void main (String[] args)
{
int a=3; int b=5; 
System.out.println(a);
System.out.println(b);
int c; c=a; a=b; b=c;
System.out.println(a);
System.out.println(b);
}
}