package src;

public class FindMaxSubArrayBruteForce {
    public static int[] find(int[] arr, int startIndex, int endIndex) {
        int leftIndex = 0;
        int rightIndex = 0;
        int totalSum = arr[0];
        for(int i = 0; i <= endIndex; i++) {
            for(int j = i; j <= endIndex; j++) {
                if(ArrayManipulation.sum(arr, i, j) > totalSum) {
                    totalSum = ArrayManipulation.sum(arr, i, j);
                    leftIndex = i;
                    rightIndex = j;
                }
            }
        }
        return new int[] {leftIndex, rightIndex, totalSum};
    }
}
