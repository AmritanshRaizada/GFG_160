

// User function Template for Java

import java.util.Arrays;

class Second_Largest {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int max = arr[0];
        int secmax=-1;
        for(int i = 0 ; i <arr.length-1;i++){
            if(arr[i+1]>arr[i]){
                secmax=max;
                max=arr[i+1];
            }
        }
        return secmax;
    }
}