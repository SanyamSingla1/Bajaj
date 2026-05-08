public class secondLargest {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5, 9};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(secondLargest);
        }
    }
}
