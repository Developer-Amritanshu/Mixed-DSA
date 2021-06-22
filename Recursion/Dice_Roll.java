import java.util.ArrayList;

public class Dice_Roll {
  public static void main(String[] args) {
    System.out.println(diceRoll(0, 10));
  }

  static ArrayList<String> diceRoll(int current, int endValue){
    if(current==endValue){
      ArrayList<String> list = new ArrayList<>();
      list.add("");
      return list;
    }
    if(current>endValue){
      ArrayList<String> list = new ArrayList<>();
      return list;
    }
    ArrayList<String> result = new ArrayList<>();
    for(int dice=1;dice<=6;dice++){
      int newValue = current + dice;
      ArrayList<String> temp = diceRoll(newValue, endValue);
      for(String t:temp){
        result.add(dice+t);
      }
    }
    return result;
  }
}
