
// First Unique Character In The String

// With Linked Hash Map
class Solution {
public int firstUniqChar(String s) {
    LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
    for(int i =0;i<s.length();i++){
      if(hm.containsKey(s.charAt(i))){
        hm.put(s.charAt(i), (hm.get(s.charAt(i))+1));
      }else{
        hm.put(s.charAt(i),1);
      }
    }
    int pos = 0;
    for(int i = 0;i<s.length();i++){
      if(hm.get(s.charAt(i))==1){
        pos = i;
        break;
      }else{
          pos = -1;
      }
    }
    return pos;
}
}

// With Array Size 26

class Solution {
public int firstUniqChar(String s) {
	int arr[] = new int[26];
	for (int i=0; i<s.length(); i++) {
	 int index = s.charAt(i) - 97;
	 arr[index]++;
	}
	for (int i=0; i<s.length(); i++) {
	 int index = s.charAt(i) -97;
	 if (arr[index] == 1)
	 return i;
	}
	return -1;
}	
}
