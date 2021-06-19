package Array_2D;

import java.util.Scanner;

public class Matrix_Multiplication {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] arr1 = new int[2][3];
    int[][] arr2 = new int[3][2];

    // Inputing 1st Array
    for(int i =0;i<arr1.length;i++){
      for(int j=0;j<arr1[i].length;j++){
        System.out.print("Enter Value in 1st Array: ");
        arr1[i][j] = scanner.nextInt();
      }
    }

    // Inputing 2nd Array
    for(int i =0;i<arr2.length;i++){
      for(int j =0;j<arr2[i].length;j++){
        System.out.print("Enter Value in 2nd Array: ");
        arr2[i][j] = scanner.nextInt();
      }
    }

    // Printing 1st Array
    for(int i =0;i<arr1.length;i++){
      for(int j=0;j<arr1[i].length;j++){
        System.out.print(arr1[i][j]+ " ");
      }
      System.out.println();
    }
    
    // For Spacing in Output
    System.out.println();

    // Printing 2nd Array
    for(int i =0;i<arr2.length;i++){
      for(int j=0;j<arr2[i].length;j++){
        System.out.print(arr2[i][j]+ " ");
      }
      System.out.println();
    }

    // Matrix Multiplication Logic
    int[][] resultMatrix = new int[2][2];
    for(int i =0;i<resultMatrix.length;i++){
      for(int j=0;j<resultMatrix[i].length;j++){
        for(int k=0;k<arr1[i].length;k++){
          resultMatrix[i][j] += arr1[i][k]*arr2[k][j];
        }
      }
    }

    System.out.println();

    // Printing Result Array
    for(int i =0;i<resultMatrix.length;i++){
      for(int j=0;j<resultMatrix[i].length;j++){
        System.out.print(resultMatrix[i][j]+ " ");
      }
      System.out.println();
    }
    scanner.close();
  }
}
