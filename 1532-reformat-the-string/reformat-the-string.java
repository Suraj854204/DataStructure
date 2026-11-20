class Solution {
    public String reformat(String s) {
        List<Character>letters=new ArrayList<>();
        List<Character>digits=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                letters.add(c);
            }else{
                digits.add(c);
            }
        }
        if(Math.abs(letters.size() - digits.size())>1){
            return "";

        }
        List<Character>first=letters.size() >= digits.size() ?letters :digits;
        List<Character>second=letters.size() >= digits.size() ?digits :letters;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<first.size();i++){
            ans.append(first.get(i));
            if(i<second.size()){
                ans.append(second.get(i));
            }
        }


       return ans.toString();
    }
}