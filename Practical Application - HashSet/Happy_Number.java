class Solution {
    public int square_sum(int n){
        int ans = 0;
        while(n>0){
            int x = n%10;
            n = n/10;
            ans = ans+(x*x);
        }
        return ans;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> s = new HashSet<Integer>();
        while(true){
            if(n==1)
                return true;
            else{
                n=square_sum(n);
                if(s.contains(n))
                    return false;
                s.add(n);
            }
        }
    }
}
