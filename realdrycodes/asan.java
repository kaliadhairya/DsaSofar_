import java.util.*;

public class asan {
    
    int countOccurrences(int n, int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                count++;
            }
        }
        return count;
    }

    int findFirstIndex(int n, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                return i;
            }
        }
        return -1; // Element not found
    }

    int findLastIndex(int n, int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (n == arr[i]) {
                return i;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 3, 7, 9};
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to find its occurrences, first, and last index: ");
        int n = sc.nextInt();

        OccurrenceFinder finder = new OccurrenceFinder();
        
        int count = finder.countOccurrences(n, arr);
        System.out.println("Total occurrences: " + count);

        int firstIndex = finder.findFirstIndex(n, arr);
        if (firstIndex != -1) {
            System.out.println("First occurrence at index: " + firstIndex);
        } else {
            System.out.println("Element not found");
        }

        int lastIndex = finder.findLastIndex(n, arr);
        if (lastIndex != -1) {
            System.out.println("Last occurrence at index: " + lastIndex);
        } else {
            System.out.println("Element not found");
        }
    }
}
