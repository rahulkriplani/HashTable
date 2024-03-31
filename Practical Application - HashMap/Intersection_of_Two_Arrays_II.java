class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums1)
            map.put(i, map.getOrDefault(i, 0)+1);
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: nums2){
            if(map.containsKey(i)){
                list.add(i);
                if(map.get(i) == 1)
                    map.remove(i);
                else
                    map.put(i, map.get(i)-1);
            }
        }
        
        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            ans[i] = list.get(i);
        return ans;
    }
}
