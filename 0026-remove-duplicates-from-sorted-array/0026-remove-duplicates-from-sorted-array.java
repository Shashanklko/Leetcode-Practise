class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int n = nums.length;
        int k = set.size();
        List<Integer> list = new ArrayList<>(set);
        for(int i = 0; i<set.size();i++){
            nums[i] = list.get(i); 
        }
        return set.size();
    }
}