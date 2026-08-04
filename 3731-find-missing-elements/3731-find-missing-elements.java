import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> missingElements = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
                missingElements.add(j);
            }
        }
        
        return missingElements;
    }
}