import java.io.*;
import java.util.*;
public class guvi15{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
  StringBuffer b=new StringBuffer(a);
  b.reverse();
  String c=b.toString();
  if(a.equals(c))
System.out.print("yes");
  else
    System.out.print("no");
}}
