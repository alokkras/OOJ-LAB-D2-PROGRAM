class Oddthread extends Thread{
    int sumodd=0;
    int i=1;
public void run(){
    try{
        Thread.sleep(2000);
        while(i<=100){
            if(i%2==0){

            }
            else{
                sumodd=sumodd+i;
            }
            i++;
        }
        System.out.println("Sum of odd numbers between 1 & 100 ::" + sumodd);
    }
    catch(InterruptedException e){
        System.out.println("Interrupted Exception"+ e);
    }
}
}
class p1{
    public static void main(String args[]) {

        Oddthread t1 = new Oddthread();
        t1.start();
        int sumeven = 0;
        int i = 1;
        try{
            Thread.sleep(2000);
            while(i<=100){
                if(i%2==0){
                    sumeven=sumeven+i;
                }
                else{}
                i++;
            }
            System.out.println("Sum of even numbers between 1 and 100 are::" + sumeven);

        }
        catch(InterruptedException e){
            System.out.println("Interrupted Exception"+ e);
        }
    }
}