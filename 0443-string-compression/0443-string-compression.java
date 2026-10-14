class Solution {
    public int compress(char[] chars) {
       int i=0;
       int write=0;
       while(i<chars.length){
        char current=chars[i];
        int count=0;
        while(i<chars.length && chars[i]==current){
            count=count+1;
            i++;
        }chars[write]=current;
        write++;
        if(count>1){
           String countString = String.valueOf(count);
            for(int j=0;j<countString.length();j++){
                chars[write] = countString.charAt(j);
                write++;
            }
        }

       }return write; 
    }
}