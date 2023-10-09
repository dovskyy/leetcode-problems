public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int firstNumIndex = -1;
            int secondNumIndex = -1;

            for (int i = 0; i < nums.length; i++) {
                int x = nums[i];

                for (int j = i+1; j < nums.length; j++) {
                    int y = nums[j];
                    if (x + y == target){
                        firstNumIndex = i;
                        secondNumIndex = j;
                    }
                }
            }

            int[] output = {firstNumIndex, secondNumIndex};
            return output;
        }
    }
}
