import java.util.*;
import java.lang.*;

abstract class shape
{
      int a,b;
      abstract public void print_area();
      
}
class rectangle extends shape
{
 public int area_rect;
        @Override
 public void print_area()
 {
         Scanner ss= new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF THE 'a':-");
         a=ss.nextInt();  
        System.out.println("ENTER THE VALUE OF THE 'b':-");
        int   b=ss.nextInt();
         area_rect=a*b;
          System.out.println("The area of rectangle is:"+area_rect);
 }

}
class triangle extends shape
{
 int area_tri;
        @Override
 public void print_area()
 {
 Scanner ss= new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF THE 'a':-");
         a=ss.nextInt();  
        System.out.println("ENTER THE VALUE OF THE 'b':-");
          b=ss.nextInt();
  area_tri=(int) (0.5*a*b);
                System.out.println("The area of triangle is:"+area_tri);
 }
}

class circle extends shape
{
 int area_circle;
        @Override
 public void print_area()
 {
 Scanner ss= new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF THE 'a':-");
         a=ss.nextInt();  
      
  area_circle=(int) (3.14*a*a);
                System.out.println("The area of circle is:"+area_circle);
 }
}
public class Shape1 {

    public static void main(String[] args) {
     
       
        rectangle r=new rectangle();
        r.print_area();
        triangle t=new triangle();
        t.print_area();
        circle r1=new circle();
        r1.print_area();
       
   
    }
   


}