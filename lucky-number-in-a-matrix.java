class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int rowmins[] = new int[r];
        int colmaxs[] = new int[c];
        int idx = 0;
        
        for(int i =0;i<r;i++){
            int min = Integer.MAX_VALUE;
            for(int j =0;j<c;j++){
                min = Math.min(min,matrix[i][j]);
            }
            rowmins[idx++]=min;
        }
        idx=0;
        for(int j=0;j<c;j++){
            int max = Integer.MIN_VALUE;
            for(int i=0;i<r;i++){
                max = Math.max(max,matrix[i][j]);
            }
            colmaxs[idx++]=max;
        }
        
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(rowmins[i]==matrix[i][j] && colmaxs[j]==matrix[i][j]){
                    ans.add(matrix[i][j]);
                }
            }
            
        }
        return ans;
    }
}
