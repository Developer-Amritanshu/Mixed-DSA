import java.util.Stack;

public class Celebrity_Problem {
  public static void main(String[] args) {
    int[][] arr = {{0,1,1,1},{0,0,0,0},{1,1,0,1},{1,1,1,0}};
    Stack<Integer> stk = new Stack<>();
    for(int i =0;i<arr.length;i++){
      stk.push(i);
    }
    while(stk.size()>=2){
      int i = stk.pop();
      int j = stk.pop();
      if(arr[i][j]==1){ // if i knows j that means i is not celebrity & vice versa
        stk.push(j);
      }else{
        stk.push(i);
      }
    }

    int potential = stk.pop();
    for(int i =0;i<arr.length;i++){
      if(i!=potential){
        if(arr[i][potential] == 0 || arr[potential][i]==1){
          System.out.println("None");
          break;
        }
      }
    }

    System.out.println(potential);
  }
}
