// Approach 2 - Binary Search

public class Square_Root {
  public static void main(String[] args) {
    int n = 18;
    System.out.println(square_root(n));
  }

  private static int square_root(int n) {
    int first = 1, last = n, result = 0;
    if(n==0||n==1){
        return n;
    }
    while(first<=last){
      int mid = (first+last)/2;
      if(mid*mid==n){
        return mid;
      }
      if(mid*mid<n){
        first = mid+1;
        result = mid;
      }else{
        last = mid-1;
      }
    }
    return result;
  }
}

// Approach 1 - Naive

// public class Square_Root {
//   public static void main(String[] args) {
//     int n = 18;
//     System.out.println(square_root(n));
//   }

//   private static int square_root(int n) {
//     if(n==0||n==1){
//       return n;
//     }
//     int i =1;
//     int result = 1;
//     while(result<=n){
//       i++;
//       result=i*i;
//     }
//     return i-1;
//   }
// }
