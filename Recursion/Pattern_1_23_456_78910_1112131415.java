public class Pattern_1_23_456_78910 {
  public static void main(String[] args) {
    printRow(5, 1, 1);    
  }

  static int printDigit(int noOfDigit,int currentDigit){
    if(noOfDigit==0){
      return currentDigit;
    }
    System.out.print(currentDigit);
    noOfDigit = noOfDigit-1;
    return printDigit(noOfDigit, currentDigit+1);
  }

  static void printRow(int noOfRows, int noOfDigits, int startDigit){
    if(noOfRows==0){
      return;
    }
    startDigit = printDigit(noOfDigits,startDigit);
    System.out.println();
    printRow(noOfRows-1, noOfDigits+1, startDigit);
  }
}
