import java.util.Scanner;
public class problem6 {
    public static void main(String[] args){
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        Scanner scanner = new Scanner(System.in);

        int quo = 0;
        int remainder = 0;

        System.out.print("금액을 입력하시오>>");
        int Num = scanner.nextInt();

        for(int i = 0; i < unit.length; i++){
            if(i == 0){
                quo = Num/unit[i];
                remainder = Num%unit[i];
            }
            else {
                quo = remainder / unit[i];
                remainder = remainder % unit[i];
            }
            System.out.println(unit[i]+"원 짜리 : " + quo + "개");
        }



    }
}
