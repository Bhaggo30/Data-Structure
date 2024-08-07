public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7, 8, 9, 10, 12};
        int searchElement = 7;
        int result = binarySearch(a, searchElement);
        if (result != -1) {
            System.out.println("Search element is at the index " + result+ " and the element is "+searchElement);
        } else {
            System.out.println("Search element not found");
        }
    }

    public static int binarySearch(int[] array, int search_element) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == search_element) {
                return mid;
            } else if (search_element > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}