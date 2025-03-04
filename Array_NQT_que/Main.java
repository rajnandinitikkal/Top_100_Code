package Top_100_codes.Array_NQT_que;

// public class Main {
//     public static void main(String[] args) {
//         int arr[] ={1,2,3,1,4,5};
//         int k = 3;

//         int n = arr.length;

//         for(int i =0; i<=arr[3]; i++){
//             for(int j=1; j<=arr[4]; j++){
//                 if(arr[i] > arr[j]){
//                     System.out.println(arr[i]);
//                 }
//             }
//         }


//     }
    
// }

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    public static List<Integer> maxSlidingWindow(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            // Remove indices out of the current window from the front
            while (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }

            // Remove indices of elements smaller than the current element from the back
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            // Add current index to the deque
            dq.offerLast(i);

            // Add the maximum element of the current window to the result
            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 2, 3, 1, 4, 5};
        int k1 = 3;
        System.out.println(maxSlidingWindow(arr1, k1)); // Output: [3, 3, 4, 5]

        // Example 2
        int[] arr2 = {8, 5, 10, 7, 9, 15, 12, 90, 13};
        int k2 = 4;
        System.out.println(maxSlidingWindow(arr2, k2)); // Output: [10, 10, 15, 15, 90, 90]

        // Example 3
        int[] arr3 = {20, 10, 30};
        int k3 = 1;
        System.out.println(maxSlidingWindow(arr3, k3)); // Output: [20, 10, 30]
    }
}
