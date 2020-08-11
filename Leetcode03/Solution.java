package Leetcode03;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,max=0;
        int n=s.length();
        if (s==null||s.length()==0) return 0;
        boolean[] used=new boolean[128];
        while (right<n)
        {
            if (used[s.charAt(right)]==false){
                used[s.charAt(right)]=true;
                right++;
            }else {
                max=Math.max(max,right-left);
                while (left<right&&used[s.charAt(left)]!=used[s.charAt(right)]){
                    used[s.charAt(left)]=false;
                    left++;
                }
                left++;
                right++;
            }
        }
        max=Math.max(max,right-left);
        return max;

    }
}
