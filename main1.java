import java.util.*;
import java.util.stream.Collectors;

public class main1 {
  
  public static void main(String[] args) {
    main1 m = new main1();
    String strng = "112 145 179 80000";
    List<String> numx = new ArrayList<>();
    int li = -1; 
    strng += " ";
    for(int i = 0; i < strng.length(); ++i){
        if(strng.charAt(i) == ' '){
            numx.add(strng.substring(li+1, i));
            li = i;
        }
    }
    
    List<Integer> integerList = numx.stream().map(Integer::parseInt).collect(Collectors.toList());
    String sb = "";
    HashMap<Integer, Integer> map = new HashMap<>();

    int sum = 0;
    int dup = 0;
    for(int i: integerList){
        sum = 0;
        dup = i;
        while (i > 0) {
            sum = sum + i % 10;
            i = i / 10;
        }
        map.put(dup, sum);
    }
    Object[] a = map.entrySet().toArray();
    Arrays.sort(a, new Comparator() {public int compare(Object o1, Object o2) {return ((Map.Entry<Integer, Integer>) o1).getValue().compareTo(((Map.Entry<Integer, Integer>) o2).getValue());}});
    for (Object e : a) {
        sb += ((Map.Entry<Integer, Integer>) e).getKey() + " "; 
    } 
    String newStr = sb.substring(0, sb.length() - 1);
    System.out.println(newStr);
    char[] x = new char[newStr.length()]; 
    for (int i = 0; i< x.length; ++i){ 
        x[i] = newStr.charAt(i); 
    } 
    //System.out.println(Arrays.toString(x));
  }
  
}