class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
       int count=0;
       int windowsum=0;
       for(int i=0;i<arr.length;i++){
        windowsum+=arr[i];
       if(i>=k-1){
        if(windowsum>=k*threshold){
            count++;
        }
        windowsum-=arr[i-k+1];
       }
    }
       return count;
    }
}