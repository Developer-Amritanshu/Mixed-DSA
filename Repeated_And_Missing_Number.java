import java.util.HashMap;

public class Repeated_And_Missing_Number {
  public static void main(String[] args) {
    int[] arr = {1,3,1};
    HashMap<Integer,Integer> hm = new HashMap<>();
    for(int i =0;i<3;i++){
      if(hm.containsKey(arr[i])){
        hm.put(arr[i], hm.get(arr[i])+1);
      }else{
        hm.put(arr[i], 1);
      }
    }

    for(int i =0;i<3;i++){
      if(hm.get(arr[i])==2){
        System.out.println("Repeating: "+arr[i]);
        break;
      }
    }
    for(int i =1;i<=3;i++){
      if(!hm.containsKey(i)){
        System.out.println("Missing: "+i);
        break;
      }
    }
  }
}
