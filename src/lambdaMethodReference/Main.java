package lambdaMethodReference;

class Test{
    public synchronized   void  fun(){
        for (int i=0 ;i<5 ; i++){
            System.out.println(Thread.currentThread().getName()  + " : " + i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Test ob = new Test();
        Thread t1 = new Thread(ob::fun,"t1");
        Thread t2 = new Thread(ob::fun , "t2");
        t1.start();
        t2.start();

    }
}
class Mainnn{
    /*public static void main(String[] args) {

    }*/
    static public void main(String[] args){
        System.out.println("sout");
    }

}
