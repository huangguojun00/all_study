//给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位
//。 
//
// 返回滑动窗口中的最大值。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,3,-1,-3,5,3,6,7], k = 3
//输出：[3,3,5,5,6,7]
//解释：
//滑动窗口的位置                最大值
//---------------               -----
//[1  3  -1] -3  5  3  6  7       3
// 1 [3  -1  -3] 5  3  6  7       3
// 1  3 [-1  -3  5] 3  6  7       5
// 1  3  -1 [-3  5  3] 6  7       5
// 1  3  -1  -3 [5  3  6] 7       6
// 1  3  -1  -3  5 [3  6  7]      7
// 
//
// 示例 2： 
//
// 
//输入：nums = [1], k = 1
//输出：[1]
// 
//
// 示例 3： 
//
// 
//输入：nums = [1,-1], k = 1
//输出：[1,-1]
// 
//
// 示例 4： 
//
// 
//输入：nums = [9,11], k = 2
//输出：[11]
// 
//
// 示例 5： 
//
// 
//输入：nums = [4,-2], k = 2
//输出：[4] 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 105 
// -104 <= nums[i] <= 104 
// 1 <= k <= nums.length 
// 
// Related Topics 队列 数组 滑动窗口 单调队列 堆（优先队列） 
// 👍 1089 👎 0

package leetcode.editor.cn;

import java.util.Deque;
import java.util.LinkedList;

//Java：滑动窗口最大值
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Solution solution = new SlidingWindowMaximum().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
//        // 使用大顶推  堆的个数为k
//        int n = nums.length;
//        Queue<int[]> queue =  new PriorityQueue<>((o1, o2) -> o1[0]!=(o2[0]) ? o2[0]-o1[0] : o2[1]-o1[1]);
//        for (int i = 0; i < k; i++) {
//            queue.offer(new int[]{nums[i],i});
//        }
//        int[] result = new int[n-k+1];
//        result[0] =  queue.peek()[0];
//        for (int i = k; i < n; i++) {
//            queue.offer(new int[]{nums[i],i});
//            while (queue.peek()[1]<=i-k){
//                 queue.poll();
//            }
//            result[i-k+1] =  queue.peek()[0];
//        }
//        return result;
            // 使用双端队列
            int n = nums.length;
            Deque<Integer> deque = new LinkedList<>();
            for (int i = 0; i < k; i++) {
                // 如果队列不为空 如果当前元素 大于等于 队列末尾元素  删除队列末尾元素
                while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                    deque.pollLast();
                }
                // 把当前数组下表追加到队列末尾
                deque.offerLast(i);
            }

            int[] result = new int[n - k + 1];
            result[0] = nums[deque.peekFirst()];


            for (int i = k; i < n; i++) {
                // 如果队列不为空 如果当前元素 大于等于 队列末尾元素  删除队列末尾元素
                while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                    deque.pollLast();
                }
                // 把当前下表加入队尾
                deque.offerLast(i);
                // 如果队首的元素 小于等于 窗口的下标 把队首删掉
                while (deque.peekFirst()<=i-k){
                    deque.pollFirst();
                }
                result[i-k+1]  = nums[deque.peekFirst()];

            }


            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
