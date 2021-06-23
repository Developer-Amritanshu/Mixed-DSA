import java.util.ArrayList;

public class Arr_Str_Cap {
  public static void main(String[] args) {
    String[] names = {"amit","ram"};
    int idx = 0;
    ArrayList<String> namesArr = CNG(names,idx);
    System.out.println(namesArr);
  }

  private static ArrayList<String> CNG(String[] names, int idx) {
    if(idx == names.length){
      ArrayList<String> returnAr = new ArrayList<String>();
      return returnAr;
    }
    
    ArrayList<String> namesArr = CNG(names,idx+1);
    ArrayList<String> result = new ArrayList<String>();
    result.add(names[idx]);
    for(String n:result){
      namesArr.add(n.toUpperCase());
    } 
    return namesArr;
  }
}
