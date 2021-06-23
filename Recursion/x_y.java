public class x_y {
  public static void main(String[] args) {
    xy("xxyy",0,"");
  }

  private static void xy(String input , int index, String output) {
    output = output + input.charAt(index);
    if(input.length()-1 == index){
      System.out.println(output);
      return;
    }
    if(input.charAt(index)==input.charAt(index+1)){
      output=output+"*";
    }
    xy(input, index+1, output);
  }
}
