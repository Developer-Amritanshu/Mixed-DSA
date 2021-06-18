public class Run_Length_Encoding {
  public static void main(String[] args) {
    String str = "cc";
    int count = 1;
    String finalR="";
    if(str.length()==1){
      finalR += str+""+count;
    }
    for(int i =0;i<str.length()-1;i++){
      if(str.charAt(i) != str.charAt(i+1)){
        if(i==str.length()-2){
          finalR+= str.charAt(i)+""+count;
          count=1;
          finalR+= str.charAt(i+1)+""+count;
        }else{
          finalR+= str.charAt(i)+""+count;
          count=1;
        }
      }else{
        if(i==str.length()-2){
          count++;
          finalR+= str.charAt(i)+""+count;
        }else{
          count++;
        }
      }
    }

    System.out.println(finalR);
  }
}
