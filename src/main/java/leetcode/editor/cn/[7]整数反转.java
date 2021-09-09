package leetcode.editor.cn;////给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
////
//// 如果反转后整数超过 32 位的有符号整数的范围 [−231, 231 − 1] ，就返回 0。
////假设环境不允许存储 64 位整数（有符号或无符号）。
////
////
////
//// 示例 1：
////
////
////输入：x = 123
////输出：321
////
////
//// 示例 2：
////
////
////输入：x = -123
////输出：-321
////
////
//// 示例 3：
////
////
////输入：x = 120
////输出：21
////
////
//// 示例 4：
////
////
////输入：x = 0
////输出：0
////
////
////
////
//// 提示：
////
////
//// -231 <= x <= 231 - 1
////
//// Related Topics 数学
//// 👍 2838 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int reverse(int x) {
//        int ans = 0;
//        while (x != 0) {
//            int pop = x % 10;  // 取余数
//            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7)) {
//                return 0;
//            }
//            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8)) {
//                return 0;
//            }
//            // 余数*10再加余数
//            ans = ans * 10 + pop;
//            x = x / 10;
//        }
//       return ans;
//
////        if (x == 0) {
////            return 0;
////        }
////        boolean a = x > 0;
////        String number = Integer.toString(x);
////        char[] chars = number.toCharArray();
////        if (a) {
////            StringBuilder now = new StringBuilder();
////            for (int i = chars.length - 1; i >= 0; i--) {
////                now.append(chars[i]);
////            }
////            try {
////                return Integer.parseInt(now.toString());
////            } catch (NumberFormatException e) {
////               return 0;
////            }
////        }
////        StringBuilder now = new StringBuilder();
////        for (int i = chars.length - 1; i >= 1; i--) {
////            now.append(chars[i]);
////        }
////        try {
////            return Integer.parseInt(now.toString())*-1;
////        } catch (NumberFormatException e) {
////            return 0;
////        }
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
//
//
