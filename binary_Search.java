class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int start=0;
        int end=row*col-1;
        int mid=start+(end-start)/2;
        while(start<=end)
        {
            int element=matrix[mid/col][mid%col];
            if(element==target)
            return true;
            else if(target>element)
            start=mid+1;
            else 
            end=mid-1;
            mid=start+(end-start)/2;
        }
        return false;
    }
}
