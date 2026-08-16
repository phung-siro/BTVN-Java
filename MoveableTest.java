package Chuong5_Bai5;

public class MoveableTest {
    public static void main(String[] args) {
        Moveable m1= new MoveablePoint(5,5);
        System.out.println("Toa do ban dau: "+m1);
        m1.moveUp();
        System.out.println("Toa do sau khi di chuyen len la: "+m1);
        m1.moveDown();
        System.out.println("Toa do sau khi di chuyen xuong la: "+m1);
        m1.moveLeft();
        System.out.println("Toa do sau khi sang trai la: "+m1);
        m1.moveright();
        System.out.println("Toa do sau khi sang phai la: "+m1);
    }
}
