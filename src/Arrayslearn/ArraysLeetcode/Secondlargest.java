package Arrayslearn.ArraysLeetcode;

public class Secondlargest {
    static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5,3};
        System.out.println(secondLargest(arr));
    }

    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int element : arr) {

            if (element > largest) {
                secondLargest = largest;
                largest = element;
            }
            else if (element > secondLargest && element != largest) {
                secondLargest = element;
            }
        }

        return secondLargest;
    }
}
