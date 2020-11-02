import java.util.Scanner;

public class ScoreGuess {
    public static void main(String[] args) {
        // 声明六个变量，分别代表六门科目成绩
        int yuWenIndex = 0;
        int shuXueIndex = 1;
        int waiYuIndex = 2;
        int wuLiIndex = 3;
        int huaXueIndex = 4;
        int shengWuIndex = 5;
        int totalScoreCount = 6;


        //每门课的名字
        String[] names = new String[totalScoreCount];
        names[yuWenIndex] = "语文";
        names[shuXueIndex] = "数学";
        names[waiYuIndex] = "外语";
        names[wuLiIndex] = "物理";
        names[huaXueIndex] = "化学";
        names[shengWuIndex] = "生物";

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入共有多少年的成绩");
        int yearCount = scanner.nextInt();
        double[][] scrores = new double[yearCount][totalScoreCount];
        for (int i = 0; i < yearCount; i++) {
            for (int j = 0; j < totalScoreCount; j++) {
                scrores[i][j] = 80 + Math.random() * 20;
                System.out.println("第" + (i + 1) + "年的" + names[j] + "成绩为" + scrores[i][j]);
            }
        }
        boolean Cont = true;
        while (Cont) {
            System.out.println("请选择要进行的操作：");
            System.out.println("1:求某年最好成绩\n" +
                    "2:求某年的平均成绩\n" +
                    "3:求所有年份最好成绩\n" +
                    "4:求某门课历年最好成绩");
            int operId = scanner.nextInt();
            int year;
            switch (operId) {
                case 1:
                    System.out.println("请输入要查询哪一年的最好成绩");
                    year = scanner.nextInt();
                    if (year <= 0 || year > yearCount) {
                        System.out.println("非法年份" + year);
                        Cont = false;
                        break;
                    }
                    year = year - 1;
                    int BestScoresYearId = 0;
                    for (int i = 0; i < totalScoreCount; i++) {
                        if (scrores[year][BestScoresYearId] < scrores[year][i]) {
                            BestScoresYearId = i;
                        }
                    }
                    System.out.println("第" + (year + 1) + "年最好成绩是" + names[BestScoresYearId] + "为" + scrores[year][BestScoresYearId]);
                    break;
                case 2:
                    System.out.println("请选择要查询哪一年的平均成绩");
                    year = scanner.nextInt();
                    year = year - 1;
                    if (year <= 0 || year > yearCount) {
                        System.out.println("非法的年份" + year);
                        Cont = false;
                        break;
                    }
                    int scoreTolalYear = 0;
                    for (int i = 0; i < totalScoreCount; i++) {
                        scoreTolalYear += scrores[year][i];
                    }
                    System.out.println("第" + (year + 1) + "的平均成绩为" + (scoreTolalYear / totalScoreCount));
                    break;
                case 3:
                    int bestYest = 0;
                    int bestScore = 0;
                    for (int i = 0; i < yearCount; i++) {
                        for (int j = 0; j < totalScoreCount; j++) {
                            if (scrores[bestYest][bestScore] < scrores[i][j]) {
                                bestYest = i;
                                bestScore = j;
                            }
                        }
                    }
                    System.out.println("最好成绩是，第" + (bestYest + 1) + "年" + names[bestScore] + "成绩为" + scrores[bestYest][bestScore]);
                    break;
                case 4:
                    System.out.println("请选择哪门课历年最好成绩\n" +
                            "1 语文\n" + "2 数学\n" + "3 外语\n" + "4 物理\n" + "5 化学\n" + "6 生物\n");
                    int nameOpt = scanner.nextInt();
                    if (nameOpt <= 0 || nameOpt > totalScoreCount) {
                        System.out.println("错误输入");
                        Cont = false;
                        break;
                    }
                    nameOpt = nameOpt - 1;
                    year = 0;
                    for (int i = 1; i < yearCount; i++) {
                        if (scrores[year][nameOpt] < scrores[i][nameOpt]) {
                            year = i;
                        }
                    }
                    System.out.println("第" + (year + 1) + "年度" + names[nameOpt] + "成绩最好为" + scrores[year][nameOpt]);
                    break;
                default:
                    Cont = false;
                    System.out.println("游戏结束，不支持" + operId);
            }
        }
    }
}
