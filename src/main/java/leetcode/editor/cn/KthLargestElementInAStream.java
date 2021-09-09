//设计一个找到数据流中第 k 大元素的类（class）。注意是排序后的第 k 大元素，不是第 k 个不同的元素。 
//
// 请实现 KthLargest 类： 
//
// 
// KthLargest(int k, int[] nums) 使用整数 k 和整数流 nums 初始化对象。 
// int add(int val) 将 val 插入数据流 nums 后，返回当前数据流中第 k 大的元素。 
// 
//
// 
//
// 示例： 
//
// 
//输入：
//["KthLargest", "add", "add", "add", "add", "add"]
//[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
//输出：
//[null, 4, 5, 5, 8, 8]
//
//解释：
//KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
//kthLargest.add(3);   // return 4
//kthLargest.add(5);   // return 5
//kthLargest.add(10);  // return 5
//kthLargest.add(9);   // return 8
//kthLargest.add(4);   // return 8
// 
//
// 
//提示：
//
// 
// 1 <= k <= 104 
// 0 <= nums.length <= 104 
// -104 <= nums[i] <= 104 
// -104 <= val <= 104 
// 最多调用 add 方法 104 次 
// 题目数据保证，在查找第 k 大元素时，数组中至少有 k 个元素 
// 
// Related Topics 树 设计 二叉搜索树 二叉树 数据流 堆（优先队列） 
// 👍 281 👎 0

package leetcode.editor.cn;

import java.util.PriorityQueue;

//Java：数据流中的第 K 大元素
public class KthLargestElementInAStream {
    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        KthLargest solution = new KthLargestElementInAStream().new KthLargest(3, nums);
        System.out.println(solution.add(3));
        System.out.println(solution.add(5));
        System.out.println(solution.add(10));
        System.out.println(solution.add(9));
        System.out.println(solution.add(4));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class KthLargest {
        private PriorityQueue<Integer> queue;
        private int k;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            queue = new PriorityQueue<>(k);
            for (int i = 0; i < nums.length; i++) {
                add(nums[i]);
            }



//            // 把nums排序 然后直接返回下标   3  9  1 5 2
//            // 第一遍    9 3 5 2 1
//            // 第二遍    9 5 3 2 1
//            // 第三遍    1 2 3 4 9
//            for (int j = 0; j < (nums.length + 1) / 2; j++) {
//                for (int i = 0; i < nums.length - 1; i++) {
//                    int num = nums[i];
//                    int next = nums[i + 1];
//                    if (num < next) {
//                        nums[i] = next;
//                        nums[i + 1] = num;
//                    }
//                }
//            }
//            Integer[] integers = new Integer[k];
//            int min = Math.min(k, nums.length);
//            for (int i = 0; i < min; i++) {
//                integers[i] = nums[i];
//            }
//            this.nums = integers;

        }

        public int add(int val) {
            queue.offer(val);
            if (queue.size() > k) {
                queue.poll();
            }
            return queue.peek();

//            Integer lastOne = nums[nums.length - 1];
//
//            if (lastOne ==null||val > lastOne) {
//                nums[nums.length - 1] = val;
//            }
////            System.out.println(Arrays.toString(nums));
//
//            for (int i = nums.length - 1; i > 0; i--) {
//                int num = nums[i];
//                int next = nums[i - 1];
//                if (num > next) {
//                    nums[i] = next;
//                    nums[i - 1] = num;
//                }
//
//            }
//            return nums[nums.length - 1];
        }
    }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
