import java.io.*;
import java.util.*;
public class guvi6{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.next();
if(a%4==0)
{
if(a%100==0)
{
if(a%400==0)
System.out.print(a+" "+"is a leap year");
else
System.out.print(a+" "+"is not a leap year");
}
else 
System.out.print(a+" "+"is a leap year");
}
else
System.out.print(a+" "+"is not a leap year");
}}
