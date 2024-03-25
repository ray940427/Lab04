public class JPA403 {
    public static void main(String[] args) {
        int s[];
        s=new int[10];
        s[0]=0;
        s[1]=1;
        System.out.println(s[0]);
        System.out.println(s[1]);
        for(int i=2;i<10;i++){
            s[i]=s[i-2]+s[i-1];
            System.out.println(s[i]);
        }
    
    }
}
