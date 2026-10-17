class Solution {
    public List<String> printVertically(String s) {
      String[] words=s.split(" ");
      List<String>ans=new ArrayList<>();
      int max=0;
      for(String word:words){
        max=Math.max(max,word.length());
      }
      for(int i=0;i<max;i++){
        StringBuilder word=new StringBuilder();
        for(String str:words){
            if(i<str.length()){
                word.append(str.charAt(i));
            }else{
                word.append(' ');
            }

        }
        ans.add(word.toString().stripTrailing());

      }
      return ans;



    }
}