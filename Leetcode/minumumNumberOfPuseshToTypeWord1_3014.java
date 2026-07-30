
public class minumumNumberOfPuseshToTypeWord1_3014 {

    public static void main(String[] args) {
        String word = "acolkxjbizfmhnrdqp";
        System.out.println(function(word));
    }

    static int function(String word) {
        if(word.length() <9){
            return word.length();
        }
        int quotient = word.length() / 8;
        int remainder = word.length() % 8;
        
        int answer = 8;
        for(int i =2;i<=quotient;i++){
            answer += i *8;
        }
        answer += remainder *( quotient+1);
        return answer;
    }
}
