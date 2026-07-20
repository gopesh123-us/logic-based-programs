
import java.util.HashMap;

class Solution {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 4, 5, 7, 8};
        int target = 10;
        int[] result = twoSum(arr, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i]; // [nums[i], diff]
            if (!map.containsKey(diff)) {
                map.put(nums[i], i);
            } else {
                ans[0] = i;
                ans[1] = map.get(diff);
            }
        }
        return ans;
    }
}
