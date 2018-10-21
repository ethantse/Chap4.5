import java.sql.SQLOutput;
import java.util.Scanner;

public class select_20161361 {
    public static int ar[] =null;

    public static void arrset() {
        ar = new int[10];
        System.out.println("数组： ");
        for(int i =0;i<ar.length;i++) {
            ar[i] = (int) (Math.random() * 10);
            System.out.print(ar[i] + "\t");
        }
    }
    public static void main(String[] args) {
        boolean isselect = false;
        arrset();
        System.out.println();
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数字");
            int b = sc.nextInt();
            for (int i = 0; i < ar.length; i++) {
                if (b == ar[i]) {
                    isselect = true;
                }

            }
            if (isselect) {
                System.out.println("成功匹配");
                break;
            } else
                System.out.println("匹配失败,请检查输入数字");
        }
    }
}
