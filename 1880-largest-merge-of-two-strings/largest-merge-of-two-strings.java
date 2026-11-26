class Solution {
    public String largestMerge(String word1, String word2) {
        int i=0,j=0;
        int n=word1.length(),m=word2.length();
        StringBuilder ans=new StringBuilder();
        while(i<n && j<m){
            if(word1.substring(i).compareTo(word2.substring(j))>0){
                ans.append(word1.charAt(i++));
            }else{
                ans.append(word2.charAt(j++));
            }

        }
        if(i<n)ans.append(word1.substring(i));
        if(j<m)ans.append(word2.substring(j));
        return ans.toString();
    }
}