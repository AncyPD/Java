import java.io.*;
import java.util.Scanner;
class Ceaser
{
public static void main(String[]args)
{
int i;
Scanner s=new Scanner(System.in);
System.out.println("Enter the plain text");
String  pt=s.nextLine();
String npt=pt.toUpperCase();
System.out.println(npt);
String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
for(i=0;i<npt.length();i++)
{
char a=npt.charAt(i);
int b=alphabet.indexOf(a)+3;
char c=alphabet.charAt(b);
System.out.println(c);
}
}
}
