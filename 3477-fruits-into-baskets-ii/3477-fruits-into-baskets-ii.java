class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
         int n = fruits.length;
        boolean[] used = new boolean[n];  // tracks which baskets are used
        int unplaced = n;

        for (int fruit : fruits) {
            for (int i = 0; i < n; i++) {
                if (!used[i] && baskets[i] >= fruit) {
                    used[i] = true;  
                    unplaced--;  
                    break;        
                }
            }
        }

        return unplaced;
    }
}