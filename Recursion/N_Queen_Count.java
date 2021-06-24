public class N_Queen_Count {
  public static void main(String[] args) {
    boolean chessBoard[][] = new boolean[4][4];
    int count = countQueenPlacement(chessBoard,0);
    System.out.println(count); 
  }

  private static boolean isSafeToPlace(boolean[][] chessBoard,int row,int col){
    // Above Row
		for(int i = row; i>=0; i--) {
			if(chessBoard[i][col]) {
				return false;
			}
		}
		// Left Diagonal 
		for(int i = row, j= col; i>=0 && j>=0; i--, j--) {
			if(chessBoard[i][j]) {
				return false;
			}
		}
		
		// Right Diagonal 
				for(int i = row, j= col; i>=0 && j<chessBoard.length; i--, j++) {
					if(chessBoard[i][j]) {
						return false;
					}
				}
    return true;
  }
  private static int countQueenPlacement(boolean[][] chessBoard,int currentRow) {
    if(currentRow==chessBoard.length){
      return 1;
    }
    int count=0;
    for(int col=0;col<chessBoard[currentRow].length;col++){
      if(isSafeToPlace(chessBoard, currentRow, col)){
        chessBoard[currentRow][col] = true;
        count = count+countQueenPlacement(chessBoard, currentRow+1);
        chessBoard[currentRow][col] = false;
      }
    }
    return count;
  }
}
