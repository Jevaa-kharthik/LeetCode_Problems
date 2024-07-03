import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class RandomizedCollection {

    private List<Integer> elements;
    private Map<Integer, Set<Integer>> map;
    private Random rand;
    
    public RandomizedCollection() {
        elements = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        boolean contain = map.containsKey(val);
        if(!contain){
            map.put(val, new HashSet<>());
        }
        map.get(val).add(elements.size());
        elements.add(val);
        return !contain;
        
    }
    
    public boolean remove(int val) {
        boolean contain = map.containsKey(val);
        if(!contain){
            return false;
        }
        int last_index = map.get(val).iterator().next();
        map.get(val).remove(last_index);

        int last_element = elements.get(elements.size() - 1);
        elements.set(last_index, last_element);
        map.get(last_element).add(last_index);
        map.get(last_element).remove(elements.size() - 1);

        elements.remove(elements.size() - 1);

        if(map.get(val).isEmpty()){
            map.remove(val);
        }
        return true;
        
    }
    
    public int getRandom() {
        return elements.get(rand.nextInt(elements.size()));
        
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
