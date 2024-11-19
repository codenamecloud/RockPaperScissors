import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //rock = 0, paper = 1, scissors = 2
        Integer com = random.nextInt(3);

        String answer = "Yes";
        while(answer.equals("Yes") || answer.equals("Y") || answer.equals("yes") || answer.equals("y")) {
            System.out.println("가위바위보!");
            System.out.print("무엇을 내시겠습니까? ");
            String me = scanner.nextLine();
            if(me.equals("가위") && com.equals(0)) {
                System.out.println("com: 주먹");
                System.out.println("졌습니다 ㅠㅠ");
            } else if(me.equals("가위") && com.equals(1)) {
                System.out.println("com: 보");
                System.out.println("이겼습니다!!");
            } else if(me.equals("가위") && com.equals(2)) {
                System.out.println("com: 가위");
                System.out.println("비겼습니다.");
            } else if(me.equals("바위") && com.equals(0)) {
                System.out.println("com: 주먹");
                System.out.println("비겼습니다.");
            } else if(me.equals("바위") && com.equals(1)) {
                System.out.println("com: 보");
                System.out.println("졌습니다 ㅠㅠ");
            } else if(me.equals("바위") && com.equals(2)) {
                System.out.println("com: 가위");
                System.out.println("이겼습니다!!");
            } else if(me.equals("보") && com.equals(0)) {
                System.out.println("com: 주먹");
                System.out.println("이겼습니다!!");
            } else if(me.equals("보") && com.equals(1)) {
                System.out.println("com: 보");
                System.out.println("비겼습니다");
            } else if(me.equals("보") && com.equals(2)) {
                System.out.println("com: 가위");
                System.out.println("졌습니다 ㅠㅠ");
            }
            System.out.print("계속하시겠습니까?(Yes/No): ");
            answer = scanner.nextLine();
        }

    }
}
