package ArrayPractice;

public class MoveZeros {
    class Solution {
        public void moveZeroes(int[] arr) {
            //     int k = 0;
            // while (k < arr.length) {
            //   if (arr[k] == 0) {

            //     break;
            //   } else {
            //     k = k + 1;
            //   }
            // }

            // //finding zeros and immediate non-zero elements and swapping them
            // int i = k, j = k + 1;

            // while (i < arr.length && j < arr.length) {
            //   if (arr[j] != 0) {
            //     int temp = arr[i];
            //     arr[i] = arr[j];
            //     arr[j] = temp;
            //     i++;

            //   }

            //   j++;

            // }


            for(int i = 0; i<arr.length; i++){
                if(arr[i] == 0){
                    for(int j = i+1; j<arr.length; j++){
                        if(arr[j] != 0){
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                            break;
                        }
                    }
                }
            }

            int count = 0;
            for(int i = 0; i< arr.length; i++){
                if(arr[i] != 0){
                    int temp = arr[i];
                    arr[i] = arr[count];
                    arr[count] = temp;
                    count++;
                }
            }



        }
    }
}
