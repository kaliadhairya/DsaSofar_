
import java.util.HashMap;

public class h1 {
    static void HashMapMethods(){
    HashMap<String, Integer> mp = new HashMap<>();
    mp.put("Dhairya", 20); 
    
    
    System.out.println(mp.get("Dhairya"));
    System.out.println(mp.remove("riya"));
    System.out.println(mp.containsKey("Dhairya"));
    System.out.println(mp.containsKey("riyasen"));

    }
    public static void main(String[] args) {
        HashMapMethods();
    }
    

    
}
