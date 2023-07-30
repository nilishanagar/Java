/* series 2 = 1,-1,1,-1,1,-1.....*/

class Series2{
public static void main(String args[])
{
  int  cnt=1,n=9;
  while(cnt<=n)
  { 
   if(cnt%2!=0)
   System.out.print(1 + " ");
   else
    System.out.print(-1 + " ");
   cnt++;
  }}}