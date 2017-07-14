import java.io.*;
import java.util.*;
public class guvi11{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int i,j,k=0,p=0,st=s.nextInt(),en=s.nextInt();
for(i=st+1;i<en;i++)
{
  for(j=2;j>i;j++)
  {
    if(i%j==0)
      k++;
    else
      p++;
  }
}
System.out.print(p);
}}
