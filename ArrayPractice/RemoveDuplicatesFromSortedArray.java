package ArrayPractice;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] A) {
        //First Approach
        // int n = A.length;
        // int[] temp = new int[n];
        // int res = 1;
        // temp[0] = A[0];
        // for(int i = 1; i<n; i++){
        //     if(temp[res-1] != A[i]){
        //         temp[res] = A[i];
        //         res++;
        //     }
        // }
        // for(int i = 0; i<res; i++){
        //     A[i] = temp[i];
        // }
        // return res;





        // int n = A.length;
        // Set<Integer> set = new HashSet<>();
        // for(int i = 0; i<n; i++){
        //     set.add(A[i]);
        // }
        // int length = set.size();
        // int j = 0;
        // for(int x: set){
        //     A[j++] = x;

        // }
        // return length;

    int res = 1;
    int n = A.length;
         for(int i = 1; i<n; i++) {
             if (A[i] != A[res - 1]) {
                 A[res] = A[i];
                 res++;
             }
         }
        return res;
    }

}
