package SortedArray;

public class MedianOfTwoSortedArray {
    public static void main(String[] args){
     int arr1[] = {1,2,3,4,5,6};
     int arr2[] = {10,20,30,40,50};
     System.out.println("Median is " + medianOfTwoSortedArray(arr1, arr2));
    }


    static double medianOfTwoSortedArray(int arr1[], int arr2[]) {

    if (arr1.length > arr2.length)
        return medianOfTwoSortedArray(arr2, arr1);

    int n1 = arr1.length;
    int n2 = arr2.length;

    int begin1 = 0, end1 = n1;

    while (begin1 <= end1) {

        int i1 = (begin1 + end1) / 2;
        int i2 = (n1 + n2 + 1) / 2 - i1;

        int min1 = (i1 == n1) ? Integer.MAX_VALUE : arr1[i1];
        int max1 = (i1 == 0) ? Integer.MIN_VALUE : arr1[i1 - 1];

        int min2 = (i2 == n2) ? Integer.MAX_VALUE : arr2[i2];
        int max2 = (i2 == 0) ? Integer.MIN_VALUE : arr2[i2 - 1];

        if (max1 <= min2 && max2 <= min1) {

            if ((n1 + n2) % 2 == 0) {
                return (Math.max(max1, max2) + Math.min(min1, min2)) / 2.0;
            }

            return Math.max(max1, max2);
        }

        else if (max1 > min2) {
            end1 = i1 - 1;
        }

        else {
            begin1 = i1 + 1;
        }
    }

    return -1; // Should never happen for valid sorted arrays
}
}
