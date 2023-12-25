import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class main1 {

  public static Integer r(String s){
    String[] str = s.split(" ");
    
    HashMap <String, Integer> xs = new HashMap<String, Integer>();
    for(String c: str){
      xs.put(c, c.length());
    }
    Integer min = Collections.min(xs.values());
    for (Entry<String, Integer> entry : xs.entrySet()) {
      if (entry.getValue().equals(min)) {
          return entry.getKey().length();
      }
    }
    return -1;
  }
  
  public static void main(String[] args) {
    System.out.println(main1.r("bitcoin take over the world maybe who knows perhaps")); 
  }
}