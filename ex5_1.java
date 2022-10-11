class ex5_1Point {
    private int x, y;
    public void set(int x, int y) {
        this.x = x; this.y = y;
    }
    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}
class ex5_1ColorPoint extends ex5_1Point {
    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}
public class ex5_1 {
    public static void main(String [] args) {
        ex5_1Point p = new ex5_1Point();
        p.set(1, 2);
        p.showPoint();
        ex5_1ColorPoint cp = new ex5_1ColorPoint();
        cp.set(3, 4);
        cp.setColor("red");
        cp.showColorPoint();
    }
}