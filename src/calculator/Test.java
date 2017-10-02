package calculator;

import java.util.Scanner;

public class Test {
    public static void main(String[]args) {
        Scanner scan2 = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入共有多少组测试数据：");
        int n = scan2.nextInt();

        while(true) {
            if(n==0)
                break;
            System.out.println("请输入计算表达式：");
            String calc = scan.nextLine();
            if (calc.equals("q") || calc.equals("quit"))
                break;
            Transform mytrans  = new Transform(calc);
            mytrans.transCalc();
            System.out.print("后缀表达式：");
            mytrans.showResStack();
            double res = mytrans.getResult();
            System.out.printf("%.4f\n", res);
            n--;
        }

    }
}
