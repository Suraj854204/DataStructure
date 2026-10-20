class Solution {
    public String arrangeWords(String text) {
        String[]word=text.toLowerCase().split(" ");
        Arrays.sort(word,(a,b)->a.length()-b.length());
        String ans=String.join(" " , word);
        return ans.substring(0,1).toUpperCase()+ans.substring(1);
    }
}