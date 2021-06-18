// reverse-words-in-a-string FULL API USE

class Solution {
    public String reverseWords(String s) {
    s = s.trim();
    String result = "";
    String[] words = s.split("\\s+");
    for(int i = words.length-1;i>=0;i--){
      if(i==0){
        result += words[i];
      }else{
        result += words[i]+" ";    
      }
      
    }
    return result;
    }
}

// reverse-words-in-a-string FULL MEHNAT - ArrayList use krna pda

 class Solution {
    public String reverseWords(String str) {
    String result = "";

    
    char[] charStrArray = str.toCharArray();
    
    // Spaces Hatanay Ka Jhol
    for(int i =0;i<charStrArray.length;i++){
      if(!String.valueOf(charStrArray[i]).equals(" ")){
        result+=String.valueOf(charStrArray[i]);
      }else{
        if(i!=0 && !String.valueOf(charStrArray[i-1]).equals(" ")){
          result+=" ";
        }
      }
    }
    
    char[] resultCharArray = result.toCharArray();
    String finalShow = ""; 
    ArrayList<String> finalShowArray = new ArrayList<String>();
    // Array Mae Split Krke Daloo
    for(int i=0;i<resultCharArray.length;i++){
      if(!String.valueOf(resultCharArray[i]).equals(" ")){
        finalShow+=String.valueOf(resultCharArray[i]);
        if(i==resultCharArray.length-1){
          finalShowArray.add(finalShow);
        }
      }else{
        finalShowArray.add(finalShow);
        finalShow="";
      }
    }

    String returnString="";

    for(int i = finalShowArray.size()-1;i>=0;i--){
      if(i==0){
        returnString+= finalShowArray.get(i);
      }else{
        returnString+= finalShowArray.get(i)+" ";
      }
    }

    return returnString;
    }
}
