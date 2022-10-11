class ex5_3Point {
    private int x, y;
    public ex5_3Point() {
        this.x = this.y = 0;
    }
    public ex5_3Point(int x, int y) {
        this.x = x; this.y = y;
    }
    public void showPoint() { // 점의 좌표 출력
        System.out.println("(" + x + "," + y + ")");
    }
}
class ex5_3ColorPoint extends ex5_3Point {
    private String color;
    public ex5_3ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    public void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}
public class ex5_3 {
    public static void main(String[] args) {
        ex5_3ColorPoint cp = new ex5_3ColorPoint(5, 6, "blue");
        cp.showColorPoint();
    }
}