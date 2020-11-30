package jzoffer;

import java.util.ArrayList;

public class Code79_FindNumbersWithSum {

    public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList();
        int left = 0;
        int right = array.length-1;
        while(left < right){
            int result = array[left] + array[right];
            if(result == sum){
                list.add(array[left]);
                list.add(array[right]);
                return list;
            }
            else if(result > sum)
                right--;
            else
                left++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,7,11,15};
        ArrayList<Integer> res = FindNumbersWithSum(arr, 15);
        System.out.println(res);

    }
}
