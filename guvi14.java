import java.io.*;
import java.util.*;
public class guvi14{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int i,k=0,j,st=s.nextInt(),en=s.nextInt();
for(i=st+1;i<en;i++)
{
  for(j=2;j<i;j++)
  {
  if(i%j==0)
  {
  k++;
  }
  }
  if(k==0)
  {
    System.out.print(i);
  }
  k=0;
}
}
}
