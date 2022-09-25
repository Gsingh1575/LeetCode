class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int[] current = new int[4];
        String s = croakOfFrogs;
        int n = s.length();
        int currentC = 0; 
        int maxC = 0;
        String croak = "croak";
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int j = croak.indexOf(c);
            if (j == -1) {
                return -1;
            }
            if (j == 0) {
                currentC++;
                if (currentC > maxC) {
                    maxC = currentC;
                }
                current[0]++;
            } else if (j == 4) {
                if (current[3] < 1) {
                    return -1;
                }
                currentC--;
                current[3]--;
            } else {
                if (current[j-1] < 1) {
                    return -1;
                }
                current[j - 1]--;
                current[j]++;
            }
        }
        for (int v : current) {
            if (v != 0) {
                return -1;
            }
        }
        return maxC;
    }
}