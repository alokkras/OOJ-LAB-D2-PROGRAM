import java.util.Scanner;


class Student
{
 String USN;
 String name;
  int n;
  double SGPA = 0;
  int totalCredits = 0;
 Scanner ss = new Scanner(System.in);

 void Details()
 {
 System.out.println("Enter USN of the Student");
 USN = ss.nextLine();
 System.out.println("Enter Name of the Student");
 name = ss.nextLine();
 System.out.println("Enter Number of Subjects");
 n = ss.nextInt();
 int credits[] = new int[n];
 double marks[] = new double[n];
 System.out.println("Enter Details of the Subjects:");
 for(int i=0;i<n;i++)
 {
  System.out.println("Enter Credits Allotted to the Subject "+(i+1));
  credits[i] = ss.nextInt();
  System.out.println("Enter Marks in the Subject "+(i+1));
  marks[i] = ss.nextInt();
  Calculate(credits[i],marks[i],i);
 }
    }
    void Calculate(int credit,double mark,int j)
    {
  totalCredits = totalCredits + credit;
  if(mark>=90&&mark<=100)
   SGPA = SGPA + (10*credit);
  else if(mark>=80 && mark<=89)
   SGPA = SGPA + (9*credit);
  else if(mark>=70&&mark<=79)
   SGPA = SGPA + (8*credit);
  else if(mark>=60&&mark<=69)
   SGPA = SGPA + (7*credit);
  else if(mark>=50 && mark<=59)
   SGPA = SGPA + (6*credit);
  else if(mark>=40&&mark<=49)
   SGPA = SGPA + (5*credit);
  else
   System.out.println("Failed In Subject "+(j+1));
 }
 void Display()
 {
  System.out.println("Details of the Student");
  System.out.println("Name :"+name);
  System.out.println("USN: "+USN);
  System.out.println("SGPA Of Student "+(SGPA/totalCredits));
 }
}

public class Lab4_2
{
 public static void main(String args[])
 {
  Student s1 = new Student();
  s1.Details();
  s1.Display();
 }
}