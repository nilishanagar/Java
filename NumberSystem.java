class NumberSystem{
public static void main(String args[])
{
 //decimal to binary 
System.out.println(Integer.toBinaryString(25));
//decimal to octal
System.out.println(Integer.toOctalString(25));
//decimal to hexa
System.out.println(Integer.toHexString(25));

//from binary to decimal
System.out.println(0b11001);
//from octal to decimal
System.out.println(031);
//from hexa to decimal
System.out.println(0x19);

//from octal to hexa
System.out.println(Integer.toHexString(031));

}}