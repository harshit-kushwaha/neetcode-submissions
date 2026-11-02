class LRUCache {

    private final Map<Integer, Integer> cache;
    private final Deque<Integer> queue;

    private final int max;

    public LRUCache(int capacity) {
        cache = new HashMap<>();
        queue = new LinkedList<>();
        max = capacity;
    }
    
    public int get(int key) {
        if (cache.containsKey(key)){
            queue.remove(key);
            queue.addLast(key);
            return cache.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (!cache.containsKey(key) && queue.size() == max){
            int removedKey = queue.pollFirst();
            cache.remove(removedKey);
        }
        if (cache.containsKey(key)){
            queue.remove(key);
        }
        queue.addLast(key);
        cache.put(key, value);
    }
}
