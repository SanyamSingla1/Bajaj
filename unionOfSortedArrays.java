public class unionOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};

        int[] union = unionOfSortedArrays(arr1, arr2);
        System.out.print("Union of the two sorted arrays: ");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }

    public static int[] unionOfSortedArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int[] tempUnion = new int[arr1.length + arr2.length];
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (k == 0 || tempUnion[k - 1] != arr1[i]) {
                    tempUnion[k++] = arr1[i];
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (k == 0 || tempUnion[k - 1] != arr2[j]) {
                    tempUnion[k++] = arr2[j];
                }
                j++;
            } else {
                if (k == 0 || tempUnion[k - 1] != arr1[i]) {
                    tempUnion[k++] = arr1[i];
                }
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            if (k == 0 || tempUnion[k - 1] != arr1[i]) {
                tempUnion[k++] = arr1[i];
            }
            i++;
        }

        while (j < arr2.length) {
            if (k == 0 || tempUnion[k - 1] != arr2[j]) {
                tempUnion[k++] = arr2[j];
            }
            j++;
        }

        int[] union = new int[k];
        System.arraycopy(tempUnion, 0, union, 0, k);
        return union;
    }
}