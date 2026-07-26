package Chuong5_Bai2;
public abstract class Shape {
    private String color;
    private boolean filled;
    //Khoi tao mac dinh
    public Shape(){
        this.color="khong biet";
        this.filled=false;
    }
    //Phuong thuc khoi tao co tham so
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    //Lay gia tri mau
    public String getColor(){
        return color;
    }
    //Thiet lap mau
    public void setColor(String color) {
        this.color=color;
    }
    //Kiem tra trang thai co duoc to mau hay khong 
    public boolean isFilled() {
        return filled;
    }
    //Thiet lap trang to mau
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    //Cac phuong thuc truu tuong (bat buoc cac lop con phai ghi de)
    public abstract double getArea();//abstract double getArea(): Mọi hình học đều có diện tích, nhưng công thức tính của Hình tròn khác Hình vuông. Vì vậy, ta để abstract để bắt buộc các lớp con (như Circle, Square) phải tự viết công thức tính toán của riêng chúng.
    public abstract double getPerimeter();//abstract double getPerimeter(): Tương tự như diện tích, mỗi hình sẽ có cách tính chu vi riêng.
    @Override 
    public abstract String toString();//Phương thức toString(): Tôi đã thêm @Override để đánh dấu rằng đây là phương thức ghi đè từ lớp Object, giúp mã nguồn rõ ràng hơn.
    
}
 


