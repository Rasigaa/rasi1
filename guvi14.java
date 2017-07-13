import java.io.*;
import java.util.*;
public class guvi14{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int i=s.nextInt(),k=0,j;
  for(j=2;j<i;j++)
  {
  if(i%j==0)
  {
  k++;
  }
  }
  if(k==0)
  {
    System.out.print(i+" "+"is a prime number");
  }
  else
  {
    System.out.print(i+" "+"is not a prime number");
  k=0;
}
}
}
