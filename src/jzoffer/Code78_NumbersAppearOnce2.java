package jzoffer;

public class Code78_NumbersAppearOnce2 {

    public static int FindNumsAppearOnce2(int[] nums) {
        int[] binarySum = new int[32];
        for(int i = 0; i< 32; i++){//求每个二进制位的和
            int sum = 0;
            for(int num : nums){
                sum += (num >> i & 1);
            }
            binarySum[i] = sum;
        }
        int res = 0;
        for (int i = 0; i< 32; i++){
            if((binarySum[i]%3) != 0){
                res += 1<<i;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] data = new int[]{2,2,2,6,6,6,5,5,5,9};
        int result = FindNumsAppearOnce2(data); // 4
        System.out.println(result);

    }
}