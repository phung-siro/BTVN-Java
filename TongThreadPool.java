package Chuong8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TongThreadPool {
    static class  TaskTinhTong implements Callable<Long> {
        private int[] array;
        private int start,end;
        public TaskTinhTong(int[] array,int start, int end){
            this.array=array;
            this.start=start;
            this.end=end;
        }
        @Override
        public Long call(){
            long sum = 0;
            for(int  i =start;i<end;i++){
                sum += array[i];
            }
            return sum;
        }
        
    }
    public static void main(String[] args) throws Exception {
        int[] data = new int[1000000];
        for(int i = 0;i<data.length;i++)
            data[i]=1;
        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Future<Long>> listKetQua = new ArrayList<>();
        int kichThuocPhan = data.length / 5;
        for( int i =0;i<5;i++){
            int batdau = i * kichThuocPhan;
            int ketthuc = (i==4) ? data.length: (i+1)*kichThuocPhan;
            TaskTinhTong task = new TaskTinhTong(data, batdau, ketthuc);
            listKetQua.add(executor.submit(task));
        }
        long tongcuoicung = 0;
        for(Future<Long> f: listKetQua){
            tongcuoicung += f.get();
        }
        System.out.println(data);
        System.out.println("Tong mang: "+tongcuoicung);
        executor.shutdown();
    }
}
