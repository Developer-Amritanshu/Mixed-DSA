// Find The Two Repeating Elements

public class Two_Repeating_Elements {
  public static void main(String[] args) {
    int[] arr = {4, 2, 4, 5, 2, 3, 1};
    int size = arr.length;
    int count[] = new int[size];
        int i;
 
        System.out.println("Repeated elements: ");
        for (i = 0; i < size; i++)
        {
            if (count[arr[i]] == 1)
                System.out.print(arr[i] + " ");
            else
                count[arr[i]]++;
        }
  }
}
