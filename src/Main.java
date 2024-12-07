import figures.Rectangle;
import figures.Triangle;

public class Main {
    int x = 5;

    public static void main(String[] args) {;
        Triangle myTriangle1 = new Triangle( 45,60, 35);
        int p1 = myTriangle1.perimeter();
        System.out.println("perimeter " + p1);

        Rectangle myRectangle2 = new Rectangle( 60, 50 );
        int p2 = myRectangle2.area();
        int p = myRectangle2.perimeter();
        System.out.println("petimeter " + p);
        System.out.println("area " + p2);
    }





}