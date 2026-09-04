package Chuong8;

public class TongMang extends Thread {
    public int[] array;
    public int start,end;
    public long sumArray;
    public TongMang(int[] array,int start,int end){
        this.array=array;
        this.start=start;
        this.end=end;
       
    }
    public long getSumarray(){
        return sumArray;
    }
    @Override
    public void run(){
        sumArray=0;
        for(int i=start;i<end;i++){
            sumArray += array[i];
        }
    }
    public static void main(String[] args) {
        int[] data = new int[2000];
        // Mỗi luồng chỉ tính toán trong phạm vi được giao
        for(int i=0;i<data.length;i++){
            data[i]=i+1;
        
        }
        TongMang t1=new TongMang(data, 0, data.length/2);
        TongMang t2 = new TongMang(data, data.length/2, data.length);
        t1.start();
        t2.start();
        //khi gọi t1.start() và t2.start(), các luồng này sẽ chạy song song với luồng chính (main). Vì CPU xử lý rất nhanh, luồng main có thể thực hiện dòng lệnh System.out.println ngay lập tức trong khi t1 và t2 vẫn đang tính toán. Tại thời điểm đó, giá trị sumArray vẫn đang là 0(giá trị khởi tạo).
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Tong mang: "+(t1.getSumarray()+t2.getSumarray()));
    }
}
