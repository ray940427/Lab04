import java.util.Scanner;
public class JPA402 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("請輸入學生人數:");
        int q=scn.nextInt();
        double s[];
        double e=0;
        s=new double[q];
        for(int i=0;i<q;i++){
            int w=i+1;
            System.out.print("第"+w+"個學生的成績");
            double a=scn.nextFloat();
            e= a+e;
            a=s[i];
            
        }
    System.out.println("人數:"+q);
    System.out.println("總分:"+e);
    System.out.println("平均:"+e/q);
    }
}
