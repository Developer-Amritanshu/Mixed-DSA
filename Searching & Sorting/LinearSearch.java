class LinearSearch{
  public static void main(String[] args) {
    
    int[] arr = {1,2,3,7,8,6,20}; // Array
    int wtf = 20; // what to find 🤨
    int f = searchElement(arr,wtf); // returns the index if element found else return -1
    
    if(f>0){
      System.out.println("Found at: arr["+f+"]");
    }else{
      System.out.println("Not found: "+f);
    }
  
  }

  private static int searchElement(int[] arr, int wtf) {
    int cp =0; // current position
    while(cp<arr.length){
      if(arr[cp]==wtf){
        return cp;
      }
      cp++;
    }
    return -1;
  }

}