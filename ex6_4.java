class ex6_4Rect {
    int width;
    int height;
    public ex6_4Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public boolean equals(Object obj) {
        ex6_4Rect p = (ex6_4Rect)obj;
        if (width*height == p.width*p.height)
            return true;
        else
            return false;
    }
}
public class ex6_4 {
    public static void main(String[] args) {
        ex6_4Rect a = new ex6_4Rect(2,3);
        ex6_4Rect b = new ex6_4Rect(3,2);
        ex6_4Rect c = new ex6_4Rect(3,4);
        if(a.equals(b))
            System.out.println("a is equal to b");
        if(a.equals(c))
            System.out.println("a is equal to c");
        if(b.equals(c))
            System.out.println("b is equal to c");
    }
}