package Chuong8;

public class LuongChanLe {
    private static final Object lock= new Object();
    private static boolean denluotChan= true;
    static class LuongChan extends Thread {
        @Override
        public void run(){
            for(int i =0;i<=10;i+=2){
                synchronized(lock){
                    while (!denluotChan) {
                        try{
                            lock.wait();
                        }catch(InterruptedException e){}
                    }
                System.out.println("Chan: "+i);
                denluotChan = false;
                lock.notifyAll();
                }
               
        }
        
    }
}
static class  LuongLe extends Thread {
    @Override
    public void run(){
        for(int i=1;i<=10;i+=2 ){
            synchronized(lock){
                while (denluotChan) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {}
                }
                System.out.println("Le: "+i);
                denluotChan=true;
                lock.notifyAll();
            }
        }
    }
    
}
    public static void main(String[] args) {
        LuongChan t1 = new LuongChan();
        LuongLe t2= new LuongLe();
        t1.start();
        t2.start();
    }
}

