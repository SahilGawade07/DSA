public class maximumProductOfTwoElementsInArray_1464 {
    public static void main(String[] args) {
        int nums[] = {3,7};
        System.out.println(function(nums));
    }

    static int function(int nums[]){
        int top1=0,top2=0;

        for(int i: nums){
            if(i > top1){
                top2 = top1;
                top1 = i;
                continue;
            }
            if(i > top2){
                top2 = i;
            }
        }

        return (top1 -1)*(top2 -1);
    }
}
