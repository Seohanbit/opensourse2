interface problem5_13Shape{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class problem5_13Circle implements problem5_13Shape{
    private int radius;
    public problem5_13Circle(int radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("반지름이 " + this.radius + "인 원입니다.");
    }
    public double getArea() {
        return PI * radius * radius;
    }
}

public class problem5_13 {
    public static void main(String args[]) {
        problem5_13Shape donut = new problem5_13Circle(10);
        donut.redraw();
        System.out.println("면적은 " + donut.getArea());
    }
}