package leetcode.simple;

import java.util.HashMap;
import java.util.Map;

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//示例:
//
//给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
//
public class TwoSum {
    public static void main(String[] args) {
        //int[] r = new TwoSum().twoSum(new int[]{2, 7, 11, 15},22);
        //System.out.println(r[0]+":"+r[1]);

        System.out.println(new TwoSum().reverse(1234567899));
    }

    public  int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length; i++){
            int other = target - nums[i];
            if( map.containsKey(other)){
                return new int[]{map.get(other),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
    public int reverse(int x) {
      try{
          StringBuilder builder = new StringBuilder();
          int start = 0;
          if( x<0 ){
              builder.append("-");
              start = 1;
          }
         char[] chars = String.valueOf(x).toCharArray();
         for(int i = chars.length-1;i>=start;i--){
             builder.append(chars[i]);
         }
          return Integer.valueOf(builder.toString());
      }catch (Exception e){
          return 0;
      }
    }
}
