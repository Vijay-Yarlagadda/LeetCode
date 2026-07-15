class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
            return false;
        int n=matrix.length;
        int m=matrix[0].length;
        int top=0;
        int bottom=n-1;
        int targetRow=-1;
        while(top<=bottom){
            int mid=top+(bottom-top)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][m-1]){
                targetRow=mid;
                break;
            }else if(target<matrix[mid][0]){
                bottom=mid-1;
            }else{
                top=mid+1;
            }
        }
        if(targetRow==-1)
            return false;
        int left=0;
        int right=m-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(matrix[targetRow][mid]==target)
                return true;
            else if(matrix[targetRow][mid]<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return false;
    }
}