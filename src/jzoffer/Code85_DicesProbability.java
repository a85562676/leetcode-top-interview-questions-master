package jzoffer;

public class Code85_DicesProbability {


    public static int g_maxValue = 6;

    public static void PrintProbability(int number){
        if(number < 1){
            return;
        }
        int maxSum = number * g_maxValue;
        int[] pProbabilities = new int[maxSum - number + 1];
        for (int i = number; i <= maxSum; ++i){
            pProbabilities[i - number] = 0;
        }
        Probability(number, pProbabilities);

        int total = (int) Math.pow(g_maxValue, number);


    }

    public static void Probability(int number, int[] pProbabilities) {
    }


}
