class Solution {
    public boolean reorderedPowerOf2(int n) {
       String target=sortDigits(n);
       for(int i=0;i<31;i++){
        int power=1<<i;
        if(sortDigits(power).equals(target)){
            return true;
        }

       } 
       return false;
    }
    private String sortDigits(int n){
        char[]digits=String.valueOf(n).toCharArray();
        Arrays.sort(digits);
        return new String(digits);
    }
}