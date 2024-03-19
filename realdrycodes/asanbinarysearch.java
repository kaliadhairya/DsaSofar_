import java.util.*;

public class asanbinarysearch{

    int countOccurrences(int n, int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                count++;
            }
        }
        return count;
    }

    int binarySearchFirstIndex(int n, int arr[]) {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == n) {
                result = mid;
                high = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    int binarySearchLastIndex(int n, int arr[]) {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == n) {
                result = mid;
                low = mid + 1; // Continue searching in the right half
            } else if (arr[mid] < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 3, 7, 9};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its occurrences, first, and last index: ");
        int n = sc.nextInt();

        // Assuming the array is sorted, you can sort it using Arrays.sort(arr) if it's not sorted.

        OccurrenceFinder finder = new OccurrenceFinder();

        int count = finder.countOccurrences(n, arr);
        System.out.println("Total occurrences: " + count);

        int firstIndex = finder.binarySearchFirstIndex(n, arr);
        if (firstIndex != -1) {
            System.out.println("First occurrence at index: " + firstIndex);
        } else {
            System.out.println("Element not found");
        }

        int lastIndex = finder.binarySearchLastIndex(n, arr);
        if (lastIndex != -1) {
            System.out.println("Last occurrence at index: " + lastIndex);
        } else {
            System.out.println("Element not found");
        }
    }
}
