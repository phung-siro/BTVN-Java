package Chuong6;

import java.util.ArrayList;
import java.util.List;

//Chuyển chuỗi thành số
public class Chuong6_Bai1 {
    public static void main(String[] args) {
        List<String> dauvao= List.of("10","abc","25","3.14","100");
        List<Integer> ketqua = new ArrayList<>();
        for( String str: dauvao){
            try{
                //Chuyển chuỗi thành số nguyên
                int songuyen= Integer.parseInt(str);
                ketqua.add(songuyen);
            } catch(NumberFormatException e){
                System.out.println("Chuỗi không hợp lệ: "+str);
            }
        }
        System.out.println("Danh sách số nguyên là: "+ketqua);
    }    
}
