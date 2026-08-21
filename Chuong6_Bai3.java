package Chuong6;
import java.util.Set;
//Tìm phần tử lớn nhất trong Set
public class Chuong6_Bai3 {
    public static <T extends Comparable<T>> T findMax(Set<T> set){
        if (set ==null || set.isEmpty()) return null; //Trả về null nếu Set rỗng
        T max = null;
        for (T x: set){
            if(max == null || x.compareTo(max)>0){
                max=x;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Set<Integer> set = Set.of(10,45,23,89,34);
        System.out.println("Phần tử lớn nhất trong Set là: "+findMax(set));
    }
}
