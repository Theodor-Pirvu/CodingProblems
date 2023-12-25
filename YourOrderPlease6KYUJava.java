import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class main1 {

  public static String order(String words) {
    String[] wrd = words.split(" ");
    HashMap <String, Integer> x = new HashMap<String, Integer>();
    LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
    ArrayList<Integer> list = new ArrayList<>();
    String res = "";
    int k = 0; 
    for(String c : wrd){
      for(int i = 0; i<c.length(); ++i){
        if(Pattern.matches("[123456789]", String.valueOf(c.charAt(i)))){
          x.put(c, Integer.parseInt(String.valueOf(c.charAt(i))));
        }
      }
    }
    
    for (Map.Entry<String, Integer> entry : x.entrySet()) {
      list.add(entry.getValue());
    }
    Collections.sort(list); 
    for (int num : list) {
      k++;
        for (Entry<String, Integer> entry : x.entrySet()) {
            if (entry.getValue().equals(num)) {
                res += k == list.size()? entry.getKey() : entry.getKey() + " ";
                sortedMap.put(entry.getKey(), num);
            }
        }
    }

    return res;
  }
  
  public static void main(String[] args) {
    System.out.println(main1.order("h6i the3re litt2le fello1w"));
  }
}