package Chuong5_Bai5;

public class MoveablePoint implements Moveable {
    private int x;
    private int y;
    public MoveablePoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public void moveLeft() {
        x--;//Di chuyen sang trai thi x giam
    }

    @Override
    public void moveDown() {
        y--;//Di chuyen xuong duoi thi y giam
    }

    @Override
    public void moveUp() {
        y++;//Di chuyen len tren thi y tang
    }

    @Override
    public void moveright() {
        x++;//Di chuyen sang phai thi x tang
    }
    public String toString(){
        return("Point at (" +x +","+y+")");
    }
    
}
