class Solution {
    public String sort(String s){
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return String.valueOf(a);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String i: strs){
            String si = sort(i);
            if(map.containsKey(si)){
                List<String> l = new ArrayList<>();
                l = map.get(si);
                l.add(i);
                map.put(si, l);
            }
            else{
                List<String> l = new ArrayList<>();
                l.add(i);
                map.put(si, l);
            }
        }
        return new ArrayList<>(map.values());
    }
}
