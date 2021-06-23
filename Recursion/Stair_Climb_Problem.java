import java.util.ArrayList;
import java.util.Scanner;

public class Stair_Climb_Problem {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    ArrayList<String> paths = getStairsPath(n);
    System.out.println(paths);
    scn.close();
  }

  private static ArrayList<String> getStairsPath(int n) {
    if(n==0){
      ArrayList<String> bres = new ArrayList<>();
      bres.add("");
      return bres;
    }else if(n<0){
      ArrayList<String> bres = new ArrayList<>();
      return bres;
    }
    ArrayList<String> paths1 = getStairsPath(n-1);
    ArrayList<String> paths2 = getStairsPath(n-2);
    ArrayList<String> paths3 = getStairsPath(n-3);

    ArrayList<String> paths = new ArrayList<>();

    for(String path:paths1){
      paths.add(1+path);
    }
    for(String path:paths2){
      paths.add(2+path);
    }
    for(String path:paths3){
      paths.add(3+path);
    }

    return paths;
  }
}
