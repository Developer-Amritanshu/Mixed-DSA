import java.util.Stack;

public class Balanced_Brackets {
  public static void main(String[] args) {
    String eq = "[(a+b)+{(c+d)*(e/f)}}]";
    Stack<Character> st = new Stack<>();
    for(int i=0;i<eq.length();i++){
      char ch = eq.charAt(i);
      if(ch=='('||ch=='{'||ch=='['){
        st.push(ch);
      }else if(ch==')'){
        boolean val = handleClosing(st,'(');
        if(val == false){
          System.out.println(val);
          return;
        }
      }
      else if(ch=='}'){
        boolean val = handleClosing(st,'{');
        if(val == false){
          System.out.println(val);
          return;
        }
      }else if(ch==']'){
        boolean val = handleClosing(st,'[');
        if(val == false){
          System.out.println(val);
          return;
        }
      }
    }
    if(st.size()==0){
      System.out.println(true);
    }else{
      System.out.println(false);
    }
  }
  private static boolean handleClosing(Stack<Character> st, char cop) {
    if(st.size()==0){
      return false;
    } else if(st.peek() != cop){
        return false;
    }else{
      st.pop();
      return true;
    }
  }
}
