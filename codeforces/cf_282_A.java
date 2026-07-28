import java.util.*;

public class cf_282_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int num =0;

        for(int i = 0;i<t;i++){
            String statement = sc.next();
            if(statement.contains("+")){
                num++;
            }else{
                num--;
            }
            
    }
    System.out.println(num);
        
}
}