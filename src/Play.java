import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Play {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Set set = new Set();

        System.out.print("무엇을 내시겠습니까?(rock=r, paper=p, scissors=s) 선택= ");
        String MChoice = scanner.nextLine();
        Integer CChoice = random.nextInt(3);

        ArrayList<String> choices = set.SetAndGet(MChoice, CChoice);
        String me = choices.get(0);
        String com = choices.get(1);

        if (me.equals("r") && com.equals("0")) {
            com = "주먹";
            System.out.println("나: " + me + " 컴퓨터: " + com);
            System.out.println("비겼다!");
        } else if (me.equals("r") && com.equals("1")) {
            com = "보";
            System.out.println("나: " + me + " 컴퓨터: " + com);
            System.out.println("졌다ㅠㅠ");
        } else if (me.equals("r") && com.equals("2")) {
            com = "가위";
            System.out.println("나: " + me + " 컴퓨터: " + com);
            System.out.println("이겼다!!");
        } else if (me.equals("p") && com.equals("1")) {
            com = "보";
            System.out.println("나: " + me + " 컴퓨터: " + com);
            System.out.println("비겼다!");
        } else if (me.equals("p") && com.equals("2")) {
            com = "가위";
            System.out.println("나: " + me + " 컴퓨터: " + com);
            System.out.println("졌다ㅠㅠ");
        } else if (me.equals("p") && com.equals("0")) {
            com = "주먹";
            System.out.println("나: " + me + " 컴퓨터: " + com);
            System.out.println("이겼다!!");
        } else if (me.equals("s") && com.equals("2")) {
            com = "가위";
            System.out.println("나: " + me + " 컴퓨터: " + com);
            System.out.println("비겼다!");
        } else if (me.equals("s") && com.equals("0")) {
            com = "주먹";
            System.out.println("나: " + me + " 컴퓨터: " + com);
            System.out.println("졌다ㅠㅠ");
        } else if (me.equals("s") && com.equals("1")) {
            com = "보";
            System.out.println("나: " + me + " 컴퓨터: " + com);
            System.out.println("이겼다!!");
        }
    }
}
