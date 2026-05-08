import java.util.HashSet;

public class containsDuplicate {
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        boolean hasDuplicate = false;
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                hasDuplicate = true;
                break;
            }
            seen.add(num);
        }
        System.out.println("Contains duplicate: " + hasDuplicate);
    }
}
