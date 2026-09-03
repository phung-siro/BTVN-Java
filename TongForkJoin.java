package Chuong8;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class TongForkJoin extends RecursiveTask<Long>{
    private int[] array;
    private int start,end;
    private static final int NGUONG = 100000;
    public TongForkJoin(int[] array,int start,int end){
        this.array=array;
        this.start=start;
        this.end=end;
    }
    @Override
    protected Long compute(){
        if(end - start<NGUONG){
            long sum =0;
            for(int i = start;i<end;i++){
                sum += array[i];
            }
            return sum;
        }else{
            int mid = (start+end)/2;
            TongForkJoin task1= new TongForkJoin(array, start, mid);
            TongForkJoin task2 = new TongForkJoin(array, mid, end);
            task1.fork();
            long result2 = task2.compute();
            long result1 = task1.join();
            return result1 + result2;
        }
    }
    public static void main(String[] args) {
        int[] data = new int[100000000];
        for(int i = 0;i<data.length;i++) 
            data[i]+=1;
        ForkJoinPool pool = new ForkJoinPool();
        long startTime= System.currentTimeMillis();
        long total = pool.invoke(new TongForkJoin(data, 0, data.length));
        long endTime  = System.currentTimeMillis();
        System.out.println("Tong: "+ total);
        System.out.println("Thoi gian: "+(endTime-startTime)+"ms");
    }
}
