public class let {
    public int solve(int[] A, int B) {
        int left = 1;
        int right = findMax(A);

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cutSum = 0;

            for (int tree : A) {
                cutSum += Math.max(0, tree - mid);
            }

            if (cutSum >= B) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    private int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
