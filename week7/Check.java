 import java.util.Scanner;

class Multi<TYPE1,TYPE2>
{
TYPE1 a;
TYPE2 b;
Multi(TYPE1 x, TYPE2 y)
{
a=x;
b=y;
}
void show()
{
System.out.println();
System.out.println(a);
System.out.println(b);
}
}
class Check
{
public static void main(String arg[])
{
Scientist sc=new Scientist();
Politician po=new Politician();
SportsPerson sp=new SportsPerson();
 
Multi<SportsPerson,Politician> dsp=new Multi<SportsPerson,Politician>(sp,po);
Multi<Politician,Scientist> dps=new Multi<Politician,Scientist>(po,sc);
Multi<Scientist,SportsPerson> dss=new Multi<Scientist,SportsPerson>(sc,sp);
 
dsp.show();
dps.show();
dss.show();
}
}

class Scientist
{
String sc;
Scientist()
{
Scanner ss=new Scanner(System.in);
System.out.println("ENTER THE NAME OF THE SCIENTIST::");
sc=ss.nextLine();
}
public String toString()
{
return sc;
}
}
class Politician
{
String s;
int i;
Politician()
{
Scanner ss=new Scanner(System.in);
System.out.println("ENTER THE NAME OF THE POLITICIAN::");
s=ss.nextLine();
System.out.println("ENTER THE AGE OF THE POLITICIAN::");
i=ss.nextInt();
}
public String toString()
{
return s+" "+i;
}
}
class SportsPerson
{
String name;
String ass;
SportsPerson()
{
Scanner ss=new Scanner(System.in);
System.out.println("ENTER THE NAME OF THE SPORTS PERSON::");
name=ss.nextLine();
System.out.println("ENTER THE SPORTS NAME THAT THE SPORTS MAN PLAYED::");
ass=ss.nextLine();
}
public String toString()
{
return name+" "+ass;
}
}