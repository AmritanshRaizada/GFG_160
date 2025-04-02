
class Reverse_Array {
    public void reverseArray(int arr[]) {
        // code here
    int n = arr.length-1;
    int i = 0;
        while(i<n){
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            i++;
            n--;
        }
    }
}