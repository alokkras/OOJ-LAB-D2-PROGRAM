//program to print the message multiple times in different time gap
//start
/*import java.util.*;
public class lab9 {
    public static void main(String[] args) {
        try {
for(int i=0;i<=3;i++)
{
            System.out.println("BMS COLLEGE OF ENGINEERING" );
            Thread.sleep(2000);
            System.out.println("CSE");
            Thread.sleep(10000);
        } 
}
catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}*/
//end
//lab program
//start
public class lab9{  
 public static void main(String args[]){  
  Runnable r1=new Runnable(){  
    public void run(){  
      System.out.println("BMS COLLEGE OF ENGINEERING");  
    }  
  };  
  
  Runnable r2=new Runnable(){  
    public void run(){  
      System.out.println("CSE");  
    }  
  };  
      
  Thread t1=new Thread(r1);  
  Thread t2=new Thread(r2); 
 
    try {
           Thread.sleep(10000);
             t1.start();  
            Thread.sleep(2000);
              t2.start(); 
            
     
}
catch(InterruptedException e){
System.out.println(e);
}
//printing without the sleep method
//start
 /* t1.start();  
  t2.start();  */
//end

 }  
}

//end