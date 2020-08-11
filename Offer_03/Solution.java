package Offer_03;
//在数组里面寻找重复数字
public class Solution {
    public void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public int findRepeatNumber(int[] nums)
    {
        int n=nums.length;
        int i=0;

        for (int num:nums)
            if (num<0||num>n)
                return -1;

            for (i=0;i<n;i++)
            {
                while (nums[i]!=i&&nums[i]!=nums[nums[i]])
                {
                    swap(nums,i,nums[i]);
                    if (nums[i]!=i&&nums[i]==nums[nums[i]])
                        return nums[i];
                }
                return -1;
            }

    }
}
