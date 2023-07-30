class LeapYear{
public static void main(String args[])
{
int y=2000;
if((y%100==0 && y% 400==0) || (y%100!=0 && y%4==0))
System.out.println("Year is leap year");
else
System.out.println("year is not leap year");
}
}