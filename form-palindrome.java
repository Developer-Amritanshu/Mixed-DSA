// Form Palindrome

public class Form_Palindrome {
  public static void main(String[] args) {
  String str = "a";
  char arr[] = str.toCharArray();
  int countArr[] = new int[256];

  int oddCount = 0;
  for(int i =0;i<arr.length;i++){
    countArr[arr[i]]++;
    if(countArr[arr[i]]%2 != 0){
      oddCount++;
    }else{
      oddCount--;
    }
  }
  if(oddCount!=1){
    System.out.println("Not A Palindrome");
  }else{
    System.out.println("Palindrome");
  }
  }
}
