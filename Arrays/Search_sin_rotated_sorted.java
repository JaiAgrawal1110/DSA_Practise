class Solution {
    int search(int[] arr, int key) {
        int n = arr.length;

        // Find pivot (smallest element)
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }

        int pivot = low;

        // Decide which half to search
        if (key >= arr[pivot] && key <= arr[n - 1]) {
            return binarySearch(arr, pivot, n - 1, key);
        } else {
            return binarySearch(arr, 0, pivot - 1, key);
        }
    }

    int binarySearch(int[] arr, int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}