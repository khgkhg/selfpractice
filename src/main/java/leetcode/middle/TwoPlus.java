package leetcode.middle;

import org.junit.Test;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.List;

/**
 * @author khg
 * @date 2020-05-16 13:20
 */
/*
   给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
    如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
    您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
    示例：
    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
    输出：7 -> 0 -> 8
    原因：342 + 465 = 807
*/
public class TwoPlus {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    @Test
    public  void test() {
        ListNode l1 =  listNode(new int[]{2,4,3});
        ListNode l2 =  listNode(new int[]{5,6,4});
       ListNode result = new TwoPlus().addTwoNumbers(l1,l2);
       while (null !=result){
            System.out.println(result.val);
            result = result.next;
        }
    }


      //本质两个链表合并为一个链表
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        int jw = 0;//进位
        while (null != l1 || null != l2 || 1 == jw  ){
           int a = 0 ,b = 0 ,c=0;
           a = null != l1 ? l1.val:0;
           b = null != l2 ? l2.val:0;
           int sum = a + b +jw;
           c = sum%10;
           ListNode node = new ListNode(c);
           head.next = node;
           head = node;
           l1 = null!= l1 ? l1.next:null;
           l2 = null!= l2 ? l2.next:null;
           jw = sum>9?1:0;
        }
        return result.next;
    }

    /**
     * 错误示范 使用两数相加
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbersByLong(ListNode l1, ListNode l2) {
        long a = 0L; long b = 0L;
        int mod = 0;
        while (null != l1){
            a +=(long) (l1.val* Math.pow(10,mod));
            l1 = l1.next;
            mod++;
        }
        mod = 0;
        while (null != l2){
            b +=(long) (l2.val* Math.pow(10,mod));
            l2 = l2.next;
            mod++;
        }
        Long sum = a+b;//121 %10
        int ws = String.valueOf(sum).toCharArray().length-1;//1234  4 1000
        List<ListNode> list = new ArrayList<>();

        for(int i = ws ; i >=0  ;i--){
            int nodeval =(int) (sum / Math.pow(10,i));
            sum=(long) (sum%Math.pow(10,i));
            list.add(new ListNode(nodeval)) ;
        }

        for (int i= list.size()-1 ; i>0;i--){
           list.get(i).next = list.get(i-1);
        }
        return  list.get(list.size()-1);
    }

    public ListNode listNode(int[] a){
        ListNode result = new ListNode(0);
        ListNode head = result;
        for(int b : a){
            ListNode node = new ListNode(b);
            head.next = node;
            head = node;
        }
        return result.next;
    }
}
