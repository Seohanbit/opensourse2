import java.util.Random;
import java.util.Scanner;
public class problem {

    public static void main(String[] args){
        Random r = new Random();
        int k = r.nextInt(100);
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print(count+">>");
            int Num = scanner.nextInt();
            count++;
            if(k == Num){
                System.out.println("맞았습니다.");
                count = 0;
                System.out.println("다시 하시겠습니까(y/n)");
                String text = scanner.next();
                if(text.equals("n")){
                    break;
                }
            }
            if(k < Num){
                System.out.println("더 낮게");
            }
            else
                System.out.println("더 높게");
        }



    }

}
