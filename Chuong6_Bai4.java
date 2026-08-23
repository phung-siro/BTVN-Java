package Chuong6;

import java.util.HashMap;
import java.util.Map;

//Đếm số lần xuất hiện của từ trong câu
public class Chuong6_Bai4 {
    public static void main(String[] args) {
        String sentence="Học lập trình java rất vui và học java rất thú vị";
        String[] words=sentence.toLowerCase().split("\\s+");//Chuyển thành chữ thường và tách chữ
        Map<String,Integer> wordMap= new HashMap<>();
        for(String word : words){
            wordMap.put(word,wordMap.getOrDefault(word,0)+1);
        }
        // Duyệt Map để in kết quả bằng biểu thức Lambda
        wordMap.forEach((key,value) -> System.out.println("Từ '" + key + "' xuất hiện: " + value + " lần"));
    }
}
