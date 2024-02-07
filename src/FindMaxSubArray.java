package src;

public class FindMaxSubArray {
    public static int[] find(int[] arr, int startIndex, int endIndex) {
        if(startIndex == endIndex)
            return new int[] {startIndex, endIndex, arr[0]};
        int midIndex = (startIndex + endIndex)/2;
        int[] left = find(arr, startIndex, midIndex);
        int[] right = find(arr, midIndex+1, endIndex);
        int[] cross = findCross(arr, startIndex, midIndex, endIndex);
        return checkHighestArray(left, right, cross);
    }
    private static int[] findCross(int[] arr, int startIndex, int midIndex, int endIndex) {
        int leftIndex = midIndex;
        int rightIndex = midIndex;
        int parcialSum = 0;
        int totalSum = arr[midIndex];
        for(int i = midIndex; i >= startIndex; i--) {
            parcialSum += arr[i];
            if(parcialSum >= totalSum) {
                totalSum = parcialSum;
                leftIndex = i;
            }
        }
        parcialSum = totalSum;
        for(int j = midIndex + 1; j <= endIndex; j++) {
            parcialSum += arr[j];
            if(parcialSum > totalSum) {
                totalSum = parcialSum;
                rightIndex = j;
            }
        }
        return new int[] {leftIndex, rightIndex, totalSum};
    }
    private static int[] checkHighestArray(int[]... arrays) {
        int maxSum = arrays[0][2];
        int index = 0;
        int i = 0;
        for(int[] arr: arrays) {
            if(arr[2] > maxSum) {
                maxSum = arr[2];
                index = i;
            }
            i++;
        }
        return arrays[index];
    }
}
