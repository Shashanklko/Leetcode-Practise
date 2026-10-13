class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result =  new HashSet<>();
        for(int i= 0 ; i<nums.length;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = i+1;j<nums.length;j++){
                int sum = -(nums[i]+nums[j]);
                if(set.contains(sum)){
                    List<Integer> l = Arrays.asList(
                        nums[i], nums[j] ,sum
                    );
                    Collections.sort(l);
                    result.add(l);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(result);
    }
}