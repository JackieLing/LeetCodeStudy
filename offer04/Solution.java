package offer04;

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if((matrix==null||matrix.length==0)||(matrix.length==1&&matrix[0].length==0))
            return false;
        int i=0,j=matrix[0].length-1;
        while(i<=matrix.length-1&&j>=0){
            if(target==matrix[i][j]) return true;
            if(target>matrix[i][j]) i++;
            else if(target<matrix[i][j]) j--;
        }
        return false;

    }
}
