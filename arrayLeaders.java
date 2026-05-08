import java.util.*;

public class arrayLeaders {
    public static void main(String[] args) {
        int[] nums = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> leaders = new ArrayList<>();
        int maxFromRight = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > maxFromRight) {
                leaders.add(nums[i]);
                maxFromRight = nums[i];
            }
        }
        Collections.reverse(leaders);
        for (int leader : leaders) {    
            System.out.print(leader + " ");
        }
    }
}
