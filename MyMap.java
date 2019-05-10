import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.ArrayList;

public final class MyMap<K,V> implements Map<K,V> {
    public Set<Entry<K,V>> entries = new LinkedHashSet<Entry<K,V>>();
    private int size = 0;
    private Node root = null;
    
    

    //Constructor creates root
    //testing github 
    public static void main(String[] args){
	/*
	entries.put("apple", 1);
	entries.put("banana", 2);
	entries.put("strawberry", 3);
	entries.put("avocado", 4);
	entries.put("band", 5);
	entries.put("bang", 6);
	System.out.println(entries.get("apple"));
	System.out.println(entries.get("banana"));
	System.out.println(entries.containsValue("peach"));
	*/

    }
    
    public int size() {
	return this.size;
    }
    
    public Set<Entry<K, V>> entrySet() {
	return entries;
    }

    public Set<K> keySet() {
	Set<K> keys = new LinkedHashSet<>();
	for(Entry<K,V> entry: entries) {
	    keys.add(entry.getKey());
	}
	return keys;
    }

    public void clear() {
	size = 0;
	root = null;
    }

    public Collection<V> values() {
	Collection<V> vals = new ArrayList<V>();
	for(Entry<K,V> entry : entries) {
	    vals.add(entry.getValue());
	}
	return vals;
    }

    public void putAll(final Map<? extends K, ? extends V> map) {
    }

    public V remove(final Object key) {
	
	return null;
    }

    public V put(final K key, final V value) {
	//LinkedHashSet<Node> singleNode = new LinkedHashSet<Node>();
	HashMap<K, Node> next = new HashMap<K, Node>();
	//HashMap<K, V> next = new HashMap<K, V>();
	next.setVal(value);

	size++;
	return null;
    }

    public V get(final Object key) {
	return null;
    }

    public boolean containsValue(Object value) {
	return false;
    }

    public boolean containsKey(Object key) {
	return false;
    }

    public boolean isEmpty() {
	return false;
    }
    
	
}
