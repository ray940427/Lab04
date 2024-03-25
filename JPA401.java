import java.util.Scanner;
public class JPA401 {
    public static void main(String[] args) {
        System.out.println("請輸入10個整數:");
        int s[];
        s=new int[10];
        int c=0;
        int e=0;
        for(int i=0;i<=9;i++){
            Scanner scn=new Scanner(System.in);
            int q=i+1;
            System.out.print("第"+q+"個整數:");
            int a=scn.nextInt();
            if(a>60){
                e=e+1;
                c=a+c; 
            }    
            a=s[i];
        }
        System.out.println("陣列中大於60的有"+e+"個");
        System.out.println("總和值為"+c);
        System.out.println("平均值為"+c/e);
    


    }

   
}
