class Solution {
    public int reverse(int x) {

        long rev=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        while(x!=0){
            int digit=x%10;
            rev=(rev*10)+digit;
            x=x/10;

        }
        if(rev>=max && rev<=min){
            return(int)rev;
        }
        return 0;


        
    }
}