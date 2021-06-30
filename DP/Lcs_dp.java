class Lcs_dp{
  public static void main(String[] args) {
    String s1="ABCDGH0";
    String s2="AEDFHR";
    int m=s1.length();
    int n=s2.length();
    int matrix[][] = new int[m][n];
    int len = lcsTab(s1,s2,m,n,matrix);
    System.out.println(len);
  }

  // Tab -
  static int lcsTab(String s1, String s2, int m, int n){
    int[][] matrix = new int[m+1][n+1];
    for(int i =0;i<m;i++){
      for(int j=0;j<=n;j++){
        if(i==0 || j==0){
          matrix[i][j] =0;
        }else if(s1.charAt(i-1)==s2.charAt(j-1)){
          matrix[i][j] = 1+matrix[i-1][j-1]; // Diagonal + 1
        }else{
          matrix[i][j] = Math.max(matrix[i-1][j],matrix[i][j-1]);
        }  
      }
    }
    return matrix[m][n];
  }

  // Memo -
  static int lcsMemo(String s1, String s2, int m, int n, int[][] matrix){
    
    // Temination case
    if(m==0||n==0){
      return 0;
    }

    // Cache
    if(matrix[m-1][n-1]!=0){
      return matrix[m-1][n-1];
    }

    // case1 - when last character are same
    if(s1.charAt(m-1) == s2.charAt(n-1)){
      matrix[m-1][n-1]= 1+lcsMemo(s1, s2, m-1, n-1, matrix);
      return matrix[m-1][n-1];
    }else{
      // case2 - when last character are not same
      int result1 = lcsMemo(s1, s2, m-1, n, matrix);
      int result2 = lcsMemo(s1, s2, m, n-1, matrix);
      matrix[m-1][n-1] = Math.max(result1,result2);
      return matrix[m-1][n-1];
    }
  }


  // Naive -
  static int lcs(String s1, String s2){

    // Termination Case
    if(s1.length()==0||s2.length()==0){
      return 0;
    }

    int count = 0;
    // case1 - when character are same
    if(s1.charAt(0)==s2.charAt(0)){
      count = 1 + lcs(s1.substring(1),s2.substring(1));
    }else{
      // case2 - when character are not same
      int result1 = lcs(s1.substring(1), s2); 
      int result2 = lcs(s1,s2.substring(1));
      count = Math.max(result1, result2);
    }
    return count;
  }
}
