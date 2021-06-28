class Fibo_dp{
  public static void main(String[] args) {
    int n = 5;
    int[] cache = new int[n+1];
    System.out.println(fiboDP(n,cache));
  }

  // Top Down - Memo
  static int fiboDP(int n,int[] cache){
    if(n==0||n==1){
      return n;
    }
    if(cache[n]!=0){
      return cache[n];
    }
    int first = fiboDP(n-1,cache);
    int second = fiboDP(n-2,cache);
    int sum = first+second;
    cache[n] = sum;
    return cache[n];
  }

  // Bottom Up - Tabulation
  static int fiboTab(int n){
    int arr[] = new int[n+1];
    arr[0] = 0;
    arr[1] = 1;
    for(int current=2;current<=n;current++){
      arr[current] = arr[current-1]+arr[current-2];
    }
    return arr[n];
  }

  // Naive
  static int fiboNormal(int n){
    if(n==0||n==1){
      return n;
    }
    int first = fiboNormal(n-1);
    int second = fiboNormal(n-2);
    int sum = first+second;
    return sum;
  }

}