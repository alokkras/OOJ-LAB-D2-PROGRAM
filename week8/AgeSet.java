import java.util.Scanner.*;
import java.util.*;
import java.lang.*;

class  WrongAge extends Exception
{
    public String toString()
{
  return" PLEASE ,ENTER THE CORRECT AGE !!!!!";
}
}

 class Father
{
   int age;
   Father(int age1)
   { 
      age=age1;
    }

}

 class Son extends Father
{
      Son(int age1) 
      {
         super(age1);
      }

}

public class AgeSet
{
    public static void main(String args[]) throws WrongAge
    { 
       Scanner ss =new Scanner(System.in);
       int j,k;
        System.out.println("Enter the age of the father");
       j = ss.nextInt();
       System.out.println("Enter the age of the son");
        k= ss.nextInt();
       try{
        if(j<=0 ||j<=k)
       { 
          throw new WrongAge();
       }
       else
        {
           Father f=new Father(j);
           Son s=new Son(k);
          System.out.println("Father's Age is::"+j);
          System.out.println("Son's Age::"+k);
        }
     }
      catch (ArithmeticException e) 
    {
     System.out.println("Caught " + e);
     }
 }
}








 