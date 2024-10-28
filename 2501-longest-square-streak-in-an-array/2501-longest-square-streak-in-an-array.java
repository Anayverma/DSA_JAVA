class Solution {
    public int longestSquareStreak(int[] nums) {
        int max= 0;
        int arr[]=new int[100001];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]=1;
        }
        max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                int c=0,ii=i;
                while(i>=0 && i<arr.length && arr[i]==1){
                    c++;
                    arr[i]=2;
                    i=i*i;
                }
                max=Math.max(max,c);
                i=ii;
            }
        }
        return max<=1?-1:max;
    }
}