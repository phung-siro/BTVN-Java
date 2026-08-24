package Chuong7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Chuong7_Bai1 {
    public static void main(String[] args) {
        String chuoi= "Chào mừng đến với lập trình Java I/O!";
        try (OutputStream os= new FileOutputStream("file.txt")){
            //Chuyển chuỗi thành mảng
            byte[] data = chuoi.getBytes();
            os.write(data);
            System.out.println("Đã ghi chuỗi vào file.");
        }catch (IOException e) {
            System.out.println("Lỗi ghi file.");
            e.printStackTrace();
        }
    }
}
