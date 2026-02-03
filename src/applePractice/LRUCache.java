package applePractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    int limit;
    private LinkedHashMap<Integer,Integer> cache;

    public LRUCache(int capacity) {

        limit = capacity;
        //Node n1 = new Node();


    }

    public int get(int key) {

        return key;
    }

    public void put(int key, int value) {

    }
}
