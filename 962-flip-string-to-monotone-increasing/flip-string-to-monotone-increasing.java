class Solution {
    public int minFlipsMonoIncr(String s) {
        int ones=0;
        int flip=0;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                ones++;
            }else{
                flip=Math.min(flip+1,ones);
            }
        }
        return flip;
    }
}