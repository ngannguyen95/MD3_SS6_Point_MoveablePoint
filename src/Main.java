import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("----POINT------");
        Point point=new Point();
        System.out.println(point);
        point.setXY(5,9);
        System.out.println("mảng được tạo ra từ x,y "+ Arrays.toString(point.getXY()));
        System.out.println("NewPoint: "+point);

        System.out.println("----Movable point-----");
        MovablePoint  moval=new MovablePoint(2,5,9,7);
        System.out.println(moval);
        moval.setSpeed(1,2);
        System.out.println(moval);

    }
}
