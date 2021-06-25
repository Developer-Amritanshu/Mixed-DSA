import java.util.Stack;

class Duplicate_Brackets{
  public static void main(String[] args) {
    String eq = "(a+b)+((c+d))";
    Stack<Character> stk = new Stack<>();
    for(int i=0;i<eq.length();i++){
      char ch = eq.charAt(i);
      if(ch==')'){
        if(stk.peek()=='('){
          System.out.println("true");
          return;
        }else{
          while(stk.peek()!='('){
            stk.pop();
          }
          stk.pop();
        }
      }else{
        stk.push(ch);
      }
    }
    System.out.println("false");
  }
}