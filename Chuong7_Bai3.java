package Chuong7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Chuong7_Bai3 {
    public static void main(String[] args) {
        int demtu=0;
        try(BufferedReader br= new BufferedReader(new FileReader("file.txt"))){
            String dong;
            while ((dong = br.readLine())!=null) {
                //Tách dòng bằng khoảng trắng
                String[] tu=dong.trim().split("\\s+");
                if(!dong.isEmpty()){
                    demtu += tu.length;
                }
            }
            System.out.println("Số lượng từ trong file là: "+demtu);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
