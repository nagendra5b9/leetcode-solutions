class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int maxvowels=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
            maxvowels=count;
        }
            if(maxvowels==k){
                return k;
            }
        for(int right=k;right<s.length();right++){
            if(isvowel(s.charAt(right-k))){
                count--;
            }
            if(isvowel(s.charAt(right))){
                count++;
            }maxvowels=Math.max(count,maxvowels);
            if(maxvowels==k){
                return k;
            }
        }return maxvowels;
    }private boolean isvowel(char ch){
        return ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u';
    }
}