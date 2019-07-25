import java.io.*;
import java.util.*;
public class Vernam
{
public String vclogic(String alpha,String pt,String key,char ch,int n)
{
int temp,k,j=0;
String ct;
char[] myChars = pt.toCharArray();
if(ch=='+')
{
	for(int i=0;i<pt.length();i++)
	{
	if((pt.charAt(i))!=' ')
	{

	k=alpha.indexOf(key.charAt(j%n));
	temp=alpha.indexOf(pt.charAt(i));
	if(temp==-1)
	{
	System.out.print(" ");
	}
	else
	{

		temp=(k+temp)%26;
		if(temp>=0)
		{
		myChars[i] = alpha.charAt(temp);
		}
		else
		{
		temp+=26;
		myChars[i] = alpha.charAt(temp);
		}
	}
	j=j+1;
	}
	
	else
	{
	
	myChars[i] =' ';
	
	}
	}
	
}
else
{
	for(int i=0;i<pt.length();i++)
	{
	if((pt.charAt(i))!=' ')
	{
	k=alpha.indexOf(key.charAt(j%n));
	temp=alpha.indexOf(pt.charAt(i));
	if(temp==-1)
	{
	System.out.print(" ");
	}
	else
	{

		temp=(temp-k)%26;
		if(temp>=0)
		{
		myChars[i] = alpha.charAt(temp);
		}
		else
		{
		temp+=26;
		myChars[i] = alpha.charAt(temp);
		}
	}
	j=j+1;
	}
	
	else
	{
	myChars[i] =' ';

	}
	}

}
ct = String.valueOf(myChars);
return ct;
}

public static void main(String args[])

{
String pt,ct,key;

String alpha="abcdefghijklmnopqrstuvwxyz";
System.out.println("Enter the sentence");
Scanner scanner=new Scanner(System.in); 
pt=scanner.nextLine();
System.out.println("Enter the key");
key=scanner.nextLine();
if(pt.length()==key.length())
{

Vernam obj=new Vernam();
ct=obj.vclogic(alpha,pt,key,'+',key.length());

System.out.println("Cipher text "+ct);

pt=obj.vclogic(alpha,ct,key,'-',key.length());
System.out.println("Plain text "+pt);
}
else
System.out.println("Vernam Cipher cant be done");

}
}