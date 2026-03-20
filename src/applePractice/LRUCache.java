package applePractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<k,v> extends LinkedHashMap<k,v> {

    private  int intCapacity;

    public LRUCache(int capacity) {
        super(capacity,0.75f,true);
        this.intCapacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<k, v> eldest) {
        return size() > intCapacity;
    }

    public static void main(String[] args) {
        LRUCache<String,Integer> lruCache = new LRUCache<>(3);
        lruCache.put("One",1);
        lruCache.put("Two",2);
        lruCache.put("Three",3);
        lruCache.put("Four",4);

        lruCache.get("Two");

        System.out.println(lruCache);

    }

    // Creating a generic cache
    // Extending LinkedHashMap
    // LinkedHashMap already maintains a doubly linked list internally in addition to a hash table.

    // false → maintains insertion order
    // true → maintains access order
}