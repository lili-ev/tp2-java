public class ex6 {

    public static int maxSubarraySum(int[] t) {
        int currentSum = t[0];
        int maxSum = t[0];

        for (int i = 1; i < t.length; i++) {
            currentSum = Math.max(t[i], currentSum + t[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] t1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] t2 = {1, 2, 3, 4};
        int[] t3 = {-1, -2, -3};
        int[] t4 = {5};
        int[] t5 = {-7};
        int[] t6 = {-2, -1, 3, 4, -5};
        int[] t7 = {1, -1, 1, -1, 1};

        System.out.println(maxSubarraySum(t1));
        System.out.println(maxSubarraySum(t2));
        System.out.println(maxSubarraySum(t3));
        System.out.println(maxSubarraySum(t4));
        System.out.println(maxSubarraySum(t5));
        System.out.println(maxSubarraySum(t6));
        System.out.println(maxSubarraySum(t7));
    }
}
