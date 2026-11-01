class Solution {
    public int minMoves(int[] nums) {
       int min=Integer.MAX_VALUE;
       for(int x:nums){
        if(x<min){
            min=x;
        }
       }int move=0;
        for(int x:nums){
            move+=x-min;
        }
        return move;
        
    }
}