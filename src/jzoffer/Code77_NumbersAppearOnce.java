package jzoffer;

public class Code77_NumbersAppearOnce {

    public static int[] FindNumsAppearOnce(int[] nums) {
        int[] re = new int[2];
        if(nums == null || nums.length < 2)
            return re;
        int result = nums[0];
        for(int i = 1; i < nums.length; i++)
            result ^= nums[i];
        int index = getFirstBit1(result);//第一个二进制为1的位置(从最右侧开始)
        re[0] = 0; re[1] = 0;
        for(int i=0; i<nums.length; i++) {
            if(isBit1(nums[i], index))
                re[0] ^= nums[i];
            else
                re[1] ^= nums[i];
        }
        return re;
    }

    public static boolean isBit1(int i, int index) {
        int num = 1 << index;
        if((i&num) != 0)
            return true;
        return false;
    }

    public static int getFirstBit1(int result) {
        int i = 1, index = 0;
        while(i != 0) {
            if((result & i)==0) {
                index++;
                i = i<<1;
            }else {
                break;
            }
        }
        return index;
    }

    public static void main(String[] args){
        int[] data = new int[]{2,4,3,6,3,2,5,5};
        int[] result = FindNumsAppearOnce(data); // 4,6
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(getFirstBit1(5));

    }
}