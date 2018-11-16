import java.util.*;
class password
{
  public static void main(String args[])
   {
     String str;
     System.out.println("enter the pwd");
     Scanner sc=new Scanner(System.in);
     s=sc.next();
     char c[]=str.toCharArray();
     int len=c.length;
     int schar=0,UC=0,LC=0,num=0,count=0;
     for(int i=0;i<len;i++)
     {
      if(c[i]==35||c[i]==36||c[i]==64)
            schar++;
      if(c[i]>=65&&c[i]<=90)
            UC++; 
      if(c[i]>=97&&c[i]<=122)
            LC++;
         }
     if(len>=6&&len<=20)
             num++;

if((len>=6&&len<=20)&&(UC>LC)&&(schar>1)&&(num>1))
            count++;
            
            if(count!=1)
                   System.out.println("Valid");
     else
           System.out.println("Invalid");          
   }
}
