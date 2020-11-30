package jzoffer;

public class Code80_FindContinuousSequence {

    public static void FindContinuousSequence(int sum){
        if(sum < 3){
            return;
        }
        int small = 1;
        int big = 2;
        int middle = (1 + sum)/2;
        int curSum = small + big;

        while(small < middle){
            if(curSum == sum)
                PrintContinuousSequence(small, big);
            while(curSum > sum && small < middle){
                curSum -= small;
                small++;
                if(curSum == sum)
                    PrintContinuousSequence(small, big);
            }
            big++;
            curSum += big;
        }
    }

    public static void PrintContinuousSequence(int small, int big) {
        for (int i = small; i <= big; ++i){
            System.out.print(i);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        FindContinuousSequence(15);
    }
}
