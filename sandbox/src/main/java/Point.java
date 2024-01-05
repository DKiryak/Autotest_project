public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public static double distance(Point p1, Point p2) {
        double distance = 0;
        distance = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
        return distance;
    }

    public static void main(String[] args) {
        Point p1 = new Point(3.5, 4.7);
        Point p2 = new Point(9.3, 1.2);
        System.out.println("Результат = " + distance(p1, p2));
    }

}
