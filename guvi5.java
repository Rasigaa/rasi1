import java.io.*;
import java.util.*;
public class guvi5{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(a>b)
{
if(a>c)
System.out.print(a);
else
System.out.print(c);
}
else if(b>c)
System.out.print(b);
else
System.out.print(c);
}}
