package Chuong5_Bai3;

public class TestPolygon {
    public static void main(String[] args) {
        Polygon t = new Triangle(5.0,4.5);
        System.out.println("Dien tich tam giac la: "+t.area());
        Polygon r= new Rectangle(6.0,7.5);
        System.out.println("Dien tich hinh chu nhat la: "+r.area());
    }
    
}
