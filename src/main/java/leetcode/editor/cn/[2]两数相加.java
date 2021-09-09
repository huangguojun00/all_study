package leetcode.editor.cn;////给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
////
//// 请你将两个数相加，并以相同形式返回一个表示和的链表。
////
//// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
////
////
////
//// 示例 1：
////
////
////输入：l1 = [2,4,3], l2 = [5,6,4]
////输出：[7,0,8]
////解释：342 + 465 = 807.
////
////
//// 示例 2：
////
////
////输入：l1 = [0], l2 = [0]
////输出：[0]
////
////
//// 示例 3：
////
////
////输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
////输出：[8,9,9,9,0,0,0,1]
////
////
////
////
//// 提示：
////
////
//// 每个链表中的节点数在范围 [1, 100] 内
//// 0 <= Node.val <= 9
//// 题目数据保证列表表示的数字不含前导零
////
//// Related Topics 递归 链表 数学
//// 👍 6382 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// * int val;
// * ListNode next;
// * ListNode() {}
// * ListNode(int val) { this.val = val; }
// * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
////        ListNode head = l1;
////        ListNode head1 = l2;
////        int jinwei = 0;
////        ListNode newNode = null;
////        if (head != null && head1 != null) {
////            int i = head.val + head1.val;
////            jinwei = i / 10;
////            newNode = new ListNode(i % 10);
////        }
////        head = head.next;
////        head1 = head1.next;
////        // 循环链表
////        while (head != null || head1 != null) {
////            int a = 0;
////            if (head != null) {
////                a = head.val;
////            }
////            int b = 0;
////            if (head1 != null) {
////                b = head1.val;
////            }
////            int sum = a + b + jinwei;
////            jinwei = sum / 10;
////            newNode = new ListNode(sum % 10, newNode);
////            head = head.next;
////            head1=head1.next;
////        }
////        if (jinwei!=0){
////            newNode = new ListNode(jinwei);
////        }
////        // 反转一次链表
////        ListNode returnHead = newNode;
////        ListNode pre = null;
////        while (returnHead!=null){
////          ListNode next =   returnHead.next;
////          returnHead.next = pre;
////          pre = returnHead;
////          returnHead = next;
////        }
////      return pre;
//
//    }
//
////    // 循环链表
////
////    public class ListNode {
////        int val;
////        ListNode next;
////
////        ListNode() {
////        }
////
////        ListNode(int val) {
////            this.val = val;
////        }
////
////        ListNode(int val, ListNode next) {
////            this.val = val;
////            this.next = next;
////        }
////    }
//}
////leetcode submit region end(Prohibit modification and deletion)
