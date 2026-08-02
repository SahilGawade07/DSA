public class printOneToN {
    public static void main(String[] args) {
        int n = 8;
        function(n, 1);
    }   
    
    
     static void function(int n, int curr){
        if(curr == n){
            System.out.println(curr);
            return;
        }
        System.out.println(curr);
        function(n, curr+1);
    }
}
