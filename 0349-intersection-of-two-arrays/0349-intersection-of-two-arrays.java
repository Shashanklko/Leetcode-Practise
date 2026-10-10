class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i:nums1){
            set.add(i);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i]) && !l.contains(nums2[i])){
                l.add(nums2[i]);
            }
        }
       int arr[] = new int[l.size()];
       for(int i=0;i<l.size();i++){
        arr[i]=l.get(i);
       }
       return arr;
    }
}