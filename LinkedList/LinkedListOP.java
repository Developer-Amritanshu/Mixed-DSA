import java.util.Scanner;

// Method -1 

// class OldNode{
//   int data;
//   OldNode next; // by default null
//   OldNode(int data){
//     this.data = data;
//     // this.next = null;
//   }
// }


// Method -2 Genric
class Node<T>{
  T data;
  Node<T> next;
  Node(T data){
    this.data = data;
  }
}

class LinkedListOperations<T>{


  Node<T> start;
  void addAtEnd(Node<T> node){
    if(start==null){
      start = node;
    }else{
      Node<T> temp = start;
      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = node;
    }
  }


  void addAtBeg(Node<T> node){
    if(start==null){
      start = node;
    }else{
      node.next = start;
      start = node;
    }
  }

  void addByPos(Node<T> node,int pos){
    if(pos==0){
      node.next = start;
      start = node;
    }
    int i =1;
    Node<T> temp = start;
    while(i<=pos){
      temp = temp.next;
      i++;
    }
    node.next = temp.next;
    temp.next = node;
  }

  void deleteAtEnd(){
    if(start==null){
      System.out.println("Linked List is empty");
      return;
    }
    if(start.next==null){
      start = null;
      System.out.println("Node deleted");
      return;
    }
    Node<T> temp = start;
    Node<T> temp2 = start;
    while(temp.next!=null){
      temp2 = temp;
      temp = temp.next;
    }
    temp = null;
    temp2.next = null;
  }




  void print(){
    Node<T> temp = start;
    while(temp!=null){
      System.out.print("["+temp.data+"]->");
      temp= temp.next;
    }
    System.out.println("null");
  }
}

class LinkedListOP{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    LinkedListOperations<Integer> opr = new LinkedListOperations<>();
    while(true){
      System.out.println("1. Add at end");
      System.out.println("2. Add at beg");
      System.out.println("3. Add at pos");
      System.out.println("4. Print");
      System.out.println("Enter Choice: ");
      int choice = scanner.nextInt();
      switch(choice){
        case 1:
          System.out.println("Enter the data");
          int data = scanner.nextInt();
          Node<Integer> node = new Node<>(data);
          opr.addAtEnd(node);
          break;
        case 2:
          System.out.println("Enter the data");
          int data1 = scanner.nextInt();
          Node<Integer> node1 = new Node<>(data1);
          opr.addAtBeg(node1);
          break;
        case 3:
          System.out.println("Enter the data");
          int data2 = scanner.nextInt();
          System.out.println("Enter the pos");
          int pos = scanner.nextInt();
          Node<Integer> node2 = new Node<>(data2);
          opr.addByPos(node2, pos);
          break;
        case 4:
          opr.print();
          break;
      }
    }
  }
}