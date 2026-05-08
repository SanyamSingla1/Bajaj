public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int i = 0;
        int j=0;
        while(i<nums.length){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
