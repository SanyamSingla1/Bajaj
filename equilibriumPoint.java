public class equilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int totalSum=0;
        for (int num : arr) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                System.out.println(i);
                break;
            }
            leftSum += arr[i];
        }
        System.out.println(-1);
    }
}
