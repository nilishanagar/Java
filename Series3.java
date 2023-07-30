/* series 3 = 9 ,99,999,9999,99999,......*/
class Series3{
public static void main(String args[])
{
 double term=9,i=1,n=5;
 while(i<=n)
{
  System.out.print(term + " ");
  term=9*Math.pow(10,i) +term;
   i++;
} 
} }