package Chuong5_Bai2;

public class Square extends Rectangle  {
    //Cụ thể, vì Square kế thừa từ Rectangle, nó không cần một biến private double side riêng biệt để tránh dư thừa dữ liệu. Thay vào đó, "cạnh" của hình vuông chính là giá trị của width và length từ lớp cha.
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);// Gọi constructor Rectangle(width, length) với cùng một giá trị side
    }
    public Square(double side, String color,boolean filled){
        super(side,side,color,filled);
    }
    // Lấy giá trị cạnh (thực chất là lấy width hoặc length)
    public double getSide(){
        return getWidth();
    }
    // Thiết lập giá trị cạnh (phải cập nhật cả width và length để giữ tính chất hình vuông)
   
    public void setSide( double side){
        setWidth(side);
        setLength(side);
    }
    // Ghi đè setWidth để đảm bảo khi đổi width thì length cũng đổi theo
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    // Ghi đè setLength tương tự
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square[side=" + getSide() + ", color=" + getColor() + ", filled=" + isFilled() + "]";
    }

}
