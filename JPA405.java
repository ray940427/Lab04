public class JPA404 {
    public static void main(String[] args) {
        String s[]={"A","B","C","D","E","F","G","H","I","J"};
        String b[];
        b=new String[10];
        
        for(int i=1;i<=10;i++){
            b[i-1]=s[10-i];  
        }
        System.out.print("反轉陣列資料之前:");
        for(int k=1;k<=10;k++){
            System.out.print(b[k-1]+" ");
        }    
        System.out.println();
        System.out.print("反轉陣列資料之後:");
        for(int a=1;a<=10;a++){
            System.out.print(s[a-1]+" ");
        }
    
    }
}
