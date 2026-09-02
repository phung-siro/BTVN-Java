package Chuong7;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Chuong7_Bai4 {
    public static void main(String[] args) {
        //Tạo thư mục
        File dir = new File("Thư mục của tôi");
        if(!dir.exists()){
            dir.mkdir();
            System.out.println("Đã tạo thư mục "+dir.getName());
        }
        //Tạo tên tệp theo ngày giờ hiện tại
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String fileName = dtf.format(LocalDateTime.now())+".txt";
        File file = new File(dir,fileName);
        try {
            if(file.createNewFile()){
                System.out.println("Đã tạo tệp: "+file.getAbsolutePath());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
  }
}
