class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (k == 0 || n == 0) {
            return;
        }
        int[] res = new int[n];
        int nk = k % n;
        for (int i = 0; i < n; i++) {
            res[i] = nums[(n-nk+i) % n];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = res[i];
        }
    }
}