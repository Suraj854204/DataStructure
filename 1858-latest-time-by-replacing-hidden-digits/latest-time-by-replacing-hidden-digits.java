class Solution {
    public String maximumTime(String time) {
        for(int h=23;h>=0;h--){
            for(int m=59;m>=0;m--){
                String candidate=String.format("%02d:%02d",h,m);
                boolean match=true;
                for(int i=0;i<5;i++){
                    if(time.charAt(i)!='?' && time.charAt(i)!=candidate.charAt(i)){
                        match=false;break;
                    }
                }
                if(match) return candidate;
            }
            
        }
        return "";
    }
}