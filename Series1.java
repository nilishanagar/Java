/* series = 1,2,3,4,1,2,3,4,1,2,3,4,....*/
class Series1{
public static void main(String args[])
{
  int term =1,cnt=1,n=7;
   while(cnt<=n)
   {
      System.out.print(term+ " " );
      term++;
      cnt++;
      if(term==5)
     term=1;
  }}}