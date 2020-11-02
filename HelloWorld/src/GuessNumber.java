import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int rangeStart = 10;
        int rangeEnd = 30;
        int mod = rangeEnd - rangeStart;
        Scanner in = new Scanner(System.in);
        int times = 3;
        boolean endGuess = false;
        while (!endGuess) {
            if (times <= 0) {
                System.out.println("游戏次数已超出，下次再来");
                break;
            }
            System.out.println("请输出数字，在" + rangeStart + "-" + rangeEnd + "之间。如果输入-1，结束游戏");
            if (rangeStart <= 0) {
                System.out.println("起始值不合法");
            } else if (rangeEnd < 0) {
                System.out.println("结束值不合法");
            } else if (rangeStart >= rangeEnd) {
                System.out.println("起始值不能大于结束值");
            }
            int guessInputNumber = in.nextInt();
            if (guessInputNumber == -1) {
                endGuess = true;
                System.out.println("用户输入-1，游戏结束");
            }
            int randomNumber = (int) (rangeStart+Math.random() * mod );
            System.out.println("随机数是：" + randomNumber );
            if (guessInputNumber > randomNumber) {
                System.out.println("输入数据比目标值大");
            } else if (guessInputNumber < randomNumber) {
                System.out.println("输入数据比目标值小");
            } else {
                System.out.println("输入的数据正确");
            }
            times--;
        }


    }
}
