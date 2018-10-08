public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point(1,3);
        MovalbePoint movePoint1 = new MovalbePoint(point1.getX(),point1.getY(),2, 4);
        System.out.println(movePoint1.toString());
        System.out.println(movePoint1.move());

    }
}
