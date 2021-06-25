import java.util.Stack;

public class Next_Greater_Element {
  public static void main(String[] args) {
    int arr[] ={1,53,2,5,92,3,83,23,9,21};
    int nge[] = new int[arr.length];

    Stack<Integer> st = new Stack<>();
    st.push(arr[arr.length-1]);
    nge[arr.length-1] = -1;

    for(int i = arr.length-2;i>=0;i--){
      while(st.size()>0&&arr[i]>=st.peek()){
        st.pop();
      }
      if(st.size()==0){
        nge[i] = -1;
      }else{
        nge[i] = st.peek();
      }
      st.push(arr[i]);
    }


    for(int p:nge){
      System.out.print(p+" ");
    }
  }
}
