package Chuong5_Bai3;

public class Triangle implements Polygon {
    private double base;
    private double height;
    public Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    //Ghi de phuong thuc area:  S = (đáy * cao) / 2
    @Override
    public double area(){
        return (base*height)/2;
    }
    // Getter cho height và base theo sơ đồ
    public double getHeight(){return height;}
    public void setHeight(double height){this.height=height;}
    public double getbase(){return base;}
    public void setBase(double base){this.base=base;}
}
