class ex6_3Point {
    int x, y;
    public ex6_3Point(int x, int y) {
        this.x = x; this.y = y;
    }
    public boolean equals(Object obj) {
        ex6_3Point p = (ex6_3Point)obj;
        if(x == p.x && y == p.y) return true;
        else return false;
    }
}
public class ex6_3 {
    public static void main(String[] args) {
        ex6_3Point a = new ex6_3Point(2,3);
        ex6_3Point b = new ex6_3Point(2,3);
        ex6_3Point c = new ex6_3Point(3,4);
        if(a == b)
            System.out.println("a==b");
        if(a.equals(b))
            System.out.println("a is equal to b");
        if(a.equals(c))
            System.out.println("a is equal to c");
    }
}