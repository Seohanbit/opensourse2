class ex5_2Person {
    private int weight;
    int age;
    protected int height;
    public String name;
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
}
class ex5_2Student extends ex5_2Person {
    public void set() {
        age = 30;
        name = "홍길동";
        height = 175;
        setWeight(99);
    }
}
public class ex5_2 {
    public static void main(String[] args) {
        ex5_2Student s = new ex5_2Student();
        s.set();
    }
}