public class Pal_R {
  public static void main(String[] args) {
    String name = "nitin";
    boolean res = pal(name);
    System.out.println(res);
  }

  private static boolean pal(String name) {
    if(name.length()==0 || name.length() == 1 ){
      return true;
    }
    if(name.charAt(0) == name.charAt(name.length()-1)){
      return pal(name.substring(1,name.length()-1));
    }
    return false;
  }
}
