class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int ans=0;
        for(int i=0;i<n;i++){
            HashSet<Integer>set=new HashSet<>();
            for(int j=i;j<n;j++){
                int num=nums.get(j);
                set.add(num);
                int distnct=set.size();
                ans+=distnct*distnct;
                
            }
        }
        return ans;
    }
}