public class Pi_String {
  public static void main(String[] args) {
    System.out.println(pi(0));
  }

  static String str = "2*pi+3*pi+10*pi";
  static String pi(int index){
    if(index==str.length()){
      return "";
    }
    if(index+1<str.length() && str.charAt(index)=='p' && str.charAt(index+1)=='i'){
      return "3.14"+pi(index+2);
  }
  return str.charAt(index)+pi(index+1);

  }
}
