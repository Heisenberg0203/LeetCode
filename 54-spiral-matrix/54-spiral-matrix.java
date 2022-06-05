class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> res = new ArrayList<>();
        
        int rowS=0,colS=0,rowE=matrix.length-1,colE=matrix[0].length-1;
        
        while(rowS<=rowE){
            for(int i=colS;i<=colE;i++) res.add(matrix[rowS][i]);
            rowS++;
            
            if(res.size()==matrix.length*matrix[0].length) break;
            
            for(int i=rowS;i<=rowE;i++) res.add(matrix[i][colE]);
            colE--;
            
            for(int i=colE;i>=colS;i--) res.add(matrix[rowE][i]);
            rowE--;
            if(res.size()==matrix.length*matrix[0].length) break;
            
            for(int i=rowE;i>=rowS;i--) res.add(matrix[i][colS]);
            colS++;
            
        }
        
        return res;
    }
}