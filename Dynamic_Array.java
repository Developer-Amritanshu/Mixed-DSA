// Dynamic Array

public class Dynamic_Array {
  public static void main(String[] args) {
    DynamicArray dynamicArray = new DynamicArray();
    dynamicArray.add(5);
    dynamicArray.add(6);
    dynamicArray.add(7);
    dynamicArray.add(17);
    dynamicArray.add(27);
    dynamicArray.add(127);
    dynamicArray.print();
  }
}

class DynamicArray{
  int[] arr = new int[5];
  int i = 0;

  public void add(int data){
    if(arr.length == i){
      int[] newArr = new int[i*2];
      int j = 0;
      for(int p:arr){
        newArr[j] = p;
        j++;
      }
      arr = new int[newArr.length];
      int k=0;
      for(int p:newArr){
        arr[k] = p;
        k++;
      }
    }
    arr[i] = data;
    i++;
  }

  public void print(){
    for(int p:arr){
      System.out.print(p+" ");
    }
  }
}
