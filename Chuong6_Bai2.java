package Chuong6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Chuong6_Bai2 {
    public static void main(String[] args) {
        List <Integer> numbers= List.of(1,2,4,3,2,1,4,5,4,3,1,3);
        Set<Integer> cacsodagap= new HashSet<>();
        Set<Integer> cacsobilap = new HashSet<>();
        for(Integer num: numbers){
            if(cacsodagap.add(num)==false){
                cacsobilap.add(num);
            }
        }
        System.out.println("Các số bị lặp lại nhiều hơn 1 lần trong ds: "+cacsobilap);
    }
}
