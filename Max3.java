class Max3{
public static void main(String args[])
{
  int a=12,b=304,c=36,max;
  if(a>b)
{
  if(a>c)
  max=a;
  else
max=c;
}
else
{
if(b>c)
max=b;
else
max=c;
}
System.out.println("The max is : " +max);
}
}
