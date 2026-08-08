public class numberOf1Bits_191 {
    public static void main(String[] args) {
        System.out.println(function(2147483645));
    }

    static int function(int n) {
        String s = Integer.toBinaryString(n);
        int ans = 0;
        for(char c: s.toCharArray()){
            if(c == '1'){
                ans++;
            }
        }
        return ans;
    }
}
