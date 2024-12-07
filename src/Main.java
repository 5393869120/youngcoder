import figures.Triangle;

public class Main {
    int x = 5;

    public static void main(String[] args) {;
        Triangle myTriangle1 = new Triangle( 45,60, 35);
        int p1 = myTriangle1.perimeter();
        System.out.println(p1);
    }
}