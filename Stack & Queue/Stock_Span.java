import java.util.Stack;

class Stock_Span{
  public static void main(String[] args) {
    int arr[] = {1,2,1,4,5,2,4,7};
    int span[] = new int[arr.length];
    Stack<Integer> st = new Stack<>();
    st.push(0);
    span[0] = 1;
    for(int i=0;i<arr.length;i++){
      while(st.size()>0&&arr[i]>arr[st.peek()]){
        st.pop();
      }
      if(st.size()==0){
        span[i] = i+1;
      }else{
        span[i] = i - st.peek();
      }
      st.push(i);
    }

    for(int p:span){
      System.out.print(p+" ");
    }
  }
}
