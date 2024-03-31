class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i=0, l = s.length(), ans=0;
        
        while(i<l){
            int j=i,ans1=0;
            while(j<l){
                if(set.add(s.charAt(j))){
                    ans1+=1;
                    j+=1;
                }
                else
                    break;
            }
            ans = Math.max(ans1, ans);
            set.clear();
            i+=1;
        }

        return ans;
    }
}
