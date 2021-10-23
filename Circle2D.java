public class Circle2D {
    private double x, y, radius;

    public Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double x1, double y1, double rad1) {
        x = x1;
        y = y1;
        radius = rad1;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x1, double y1) {
        double dx = x - x1;
        double dy = y - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);
        if (distance < radius)
            return true;
        else
            return false;
    }

    public boolean contains(Circle2D other) {
        double dx = x - other.x;
        double dy = y - other.y;
        double distance = Math.sqrt(dx * dx + dy * dy);

        if (radius >= other.radius + distance)
            return true;
        else
            return false;

    }

    public boolean overlaps(Circle2D other) {
        double dx = x - other.x;
        double dy = y - other.y;
        double distance = Math.sqrt(dx * dx + dy * dy);


        if (distance < radius + other.radius)
            return true;
        else
            return false;

    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.printf("Created circle c1 at (%.2f, %.2f) with radius %.2f\n", c1.getX(), c1.getY(), c1.getRadius());
        System.out.printf("Area = %.2f\n", c1.getArea());
        System.out.printf("Perimeter = %.2f\n", c1.getPerimeter());
        System.out.println("c1.contains(3, 3) = " + c1.contains(3, 3));
        System.out.println("c1.contains(new Circle2D(4, 5, 10.5)) = " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3)) = " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }

}
