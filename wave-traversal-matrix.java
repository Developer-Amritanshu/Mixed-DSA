package Array_2D;

import java.util.Scanner;

public class Wave_Traversal_Matrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Rows And Coumns Inputs
    System.out.print("Enter Row: ");
    int n = scanner.nextInt();
    System.out.print("Enter Col: ");
    int m = scanner.nextInt();
    
    // 2D Array
    int[][] arr = new int[n][m];

    // Filling Matrix Logic
    for(int i =0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.print("Enter Value: ");
        arr[i][j] = scanner.nextInt();
      }
    }

    System.out.println();
    
    // Printing Array
    for(int i =0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }

    System.out.println();

    // Logic of Wave - even-> row+ odd-> row-
    for(int j=0;j<arr[0].length;j++){
      if(j%2==0){
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i][j]+" ");
        }
      }else{
        for(int i=arr.length-1;i>=0;i--){
          System.out.print(arr[i][j]+" ");
        }
      }
    }
    
    scanner.close();
  }
}
