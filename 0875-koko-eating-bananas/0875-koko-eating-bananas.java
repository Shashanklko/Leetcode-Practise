class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int pile: piles){
          high = Math.max(high, pile);
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(piles , h , mid)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    private boolean isPossible(int[] piles , int h , int speed){
        int hours = 0;
        for(int pile: piles){
            hours+= Math.ceil((double)pile/speed);
            if(hours>h){
                return false;
            }
        }
        return true;
    }
}