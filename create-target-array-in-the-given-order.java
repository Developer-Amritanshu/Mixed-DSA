class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target  = new ArrayList<Integer>();
        int l = nums.length;
        for(int i =0;i<l;i++)
        {
            target.add(index[i],nums[i]);
        }
        int[] target2 = new int[l];
        for(int i =0;i<l;i++)
        {
            target2[i] = target.get(i);
        }
        return target2;
    }
}
