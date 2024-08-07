public class LinearSearch {
    public static int linearSearch(int[] arr, int search_Element) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search_Element) {
                System.out.println("it is found at the index position "+i);
                return search_Element;



            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 89, 34, 23, 10, 89, 78};
        int search_element = 34;
        int result = linearSearch(arr, search_element);
        System.out.println("the search element is :"+result);


    }
}
