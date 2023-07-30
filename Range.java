class Range{
 public static void main(String args[])
{  
// integer literals
   System.out.println(Long.MIN_VALUE);
   System.out.println(Long.MAX_VALUE);
   System.out.println(Long.SIZE);//8 bytes  = 64 bits

//floating literals
 System.out.println(Double.MIN_VALUE);
   System.out.println(Double.MAX_VALUE);
   System.out.println(Double.SIZE);//8 bytes  = 64 bits

System.out.println(0.0000000000000000123);
System.out.println(12300000000000000000.00000);
System.out.println(0.1233);

//float is greater than long
 System.out.println(Float.MAX_VALUE);
 System.out.println(Long.MAX_VALUE);
}}