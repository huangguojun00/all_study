package leetcode.editor.cn;////给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
////
//// 有效字符串需满足：
////
////
//// 左括号必须用相同类型的右括号闭合。
//// 左括号必须以正确的顺序闭合。
////
////
////
////
//// 示例 1：
////
////
////输入：s = "()"
////输出：true
////
////
//// 示例 2：
////
////
////输入：s = "()[]{}"
////输出：true
////
////
//// 示例 3：
////
////
////输入：s = "(]"
////输出：false
////
////
//// 示例 4：
////
////
////输入：s = "([)]"
////输出：false
////
////
//// 示例 5：
////
////
////输入：s = "{[]}"
////输出：true
////
////
////
//// 提示：
////
////
//// 1 <= s.length <= 104
//// s 仅由括号 '()[]{}' 组成
////
//// Related Topics 栈 字符串
//// 👍 2445 👎 0
//
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Stack;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public boolean isValid(String s) {
//        char[] chars = s.toCharArray();
//        Stack<Character> objects = new Stack<>();
//        for (char object : chars) {
//            if (object=='('){objects.push(')');}
//            else if (object=='['){objects.push(']');}
//            else if (object=='{'){objects.push('}');}
//            else if (objects.isEmpty()|| object!=objects.pop()){return false;}
//        }
//        return objects.empty();
//
//
////        Map<Character,Character> map = new HashMap<>();
////        map.put(')','(');
////        map.put('}','{');
////        map.put(']','[');
////        char[] chars = s.toCharArray();
////        Stack<Character> objects = new Stack<>();
////        for (char aChar : chars) {
////            if (map.containsValue(aChar)){
////                objects.push(aChar);
////            }else {
////                if (objects.empty()){
////                    return false;
////                }
////                Character peek = objects.peek();
////                Character character = map.get(aChar);
////                if (peek.equals(character)){
////                    objects.pop();
////                }else {
////                    objects.push(aChar);
////                }
////            }
////        }
////        return objects.empty();
//
//
//
//    }
//
//
//}
////leetcode submit region end(Prohibit modification and deletion)
