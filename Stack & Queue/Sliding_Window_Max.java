import java.util.Stack;

public class Sliding_Window_Max {
  public static void main(String[] args) {
    int[] arr = {1,2,7,2,5,8,2,2,79,135,2,2,68,2345,2};
    int k =4;
    Stack<Integer> stk = new Stack<>();
    int[] nge = new int[arr.length];
    nge[arr.length -1] = arr.length;

    for(int i=arr.length-2;i>=0;i--){
      while(stk.size()>0&&arr[i]>=arr[stk.peek()]){
        stk.pop();
      }

      if(stk.size()==0){
        nge[i]= arr.length;
      }else{
        nge[i] = stk.peek();
      }
      stk.push(i);
    }

    int j =0;
    for(int i =0;i<=arr.length-k;i++){
      if(j<i){
        j=i;
      }
      while(nge[j]<i+k){
        j= nge[j];
      }
      System.out.print(arr[j]+" ");
    }
  }
}
