import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class main1 {

  public static int duplicateCount(String text) {
    if(text == ""){
      return 0;
    }
    char[] x = text.toLowerCase().toCharArray();
    HashMap <String, Integer> hm = new HashMap<>(); 
    HashMap <String, Integer> HRES = new HashMap<>();

    for(char c : x){
      if(!hm.containsKey(c)){
        hm.merge(String.valueOf(c), 1, Integer::sum);
      }
    }
    for(Map.Entry<String, Integer> entry : hm.entrySet()){
      if(entry.getValue() != 1 && entry.getValue() >= 2){
        HRES.put(entry.getKey(), entry.getValue());
      }
    }
    return HRES.size();
  }
  
  public static void main(String[] args) {
    System.out.println(main1.duplicateCount("indivisibilities"));
  }
}