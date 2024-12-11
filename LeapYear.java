class LeapYear
{
public static void main (String[] args)
{
int year=2392;
if(year%4==0 && year%100!=0 || year%4==0 && year%400==0)
{
System.out.println("it is a leapyear");
}
else
{
System.out.println("it is not a leapyear");
}
}
}













