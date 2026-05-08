public class kidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        boolean[] result = new boolean[candies.length];
        int maxCandies = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            result[i] = (candies[i] + extraCandies) >= maxCandies;
        }
        for (boolean num : result) {
            System.out.print(num + " ");
        }
    }
}