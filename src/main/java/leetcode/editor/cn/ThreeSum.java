//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重
//复的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：nums = [0]
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 3000 
// -105 <= nums[i] <= 105 
// 
// Related Topics 数组 双指针 排序 
// 👍 3691 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Java：三数之和
public class ThreeSum {
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
        int[] a = {0,0,0};
        List<List<Integer>> lists = solution.threeSum(a);
        System.out.println(lists.toString());
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {


        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] > 0) break;
//                if (i > 0 && nums[i] == nums[i - 1]) continue;
//                int target = -nums[i];
//                HashSet<Integer> set = new HashSet<>();
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (j > i + 2 && nums[j] == nums[j - 1] && nums[j - 1] == nums[j - 2]) { // 三元组元素b去重
//                        continue;
//                    }
//                    int value = target - nums[j];
//                    if (set.contains(value)) {
//                        result.add(Arrays.asList(nums[i], value, nums[j]));
//                        set.remove(value);
//                    } else {
//                        set.add(nums[j]);
//                    }
//
//
//                }
//
//            }


            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) break;
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                int L = i + 1;
                int R = nums.length - 1;
                while (L < R) {
                   int sum = nums[i]+nums[L]+nums[R];
                   if (sum==0){
                       result.add(Arrays.asList(nums[i],nums[L],nums[R]));
                       while (L<R&&nums[L]==nums[L+1]){
                           L++;
                       }
                       while (L<R&&nums[R]==nums[R-1]){
                           R--;
                       }
                       L++;
                       R--;
                   }
                   else if (sum<0) L++;
                   else if (sum>0) R--;
                }

            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
