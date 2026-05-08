public class singleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int singleNum = 0;
        for (int num : nums) {
            singleNum ^= num;
        }
        System.out.println("Single number: " + singleNum);
    }
}
