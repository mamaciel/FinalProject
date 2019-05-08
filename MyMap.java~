import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.ArrayList;

public final class MyMap<K,V> implements Map<K,V> {
    public Set<Entry<K,V>> entries = new LinkedHashSet<Entry<K,V>>();
    int size;

    //Constructor creates root
    //testing github 
    public static void main(String[] args){
	entries.put("apple", 1);
	entries.put("banana", 2);
	entries.put("strawberry", 3);
	System.out.println(entries.get("apple"));
	System.out.println(entries.get("banana"));
	System.out.println(entries.containsValue("peach"));
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

    }

    public Collection<V> values() {
	Collection<V> vals = new ArrayList<V>();
	for(Entry<K,V> entry : entries) {
	    vals.add(entry.getValue());
	}
	return vals;
    }

    public void putAll(final Map<? extends K, ? extends V> map) {
	for(Entry<? extends K, ? extends V> entry : map.entrySet()){
	    checkArgument(apply(entry.getKey(), entry.getValue()));
	}
	unfiltered.putAll(map):
    }

    public V remove(final Object key) {
	
	return null;
    }

    public V put(final K key, final V value) {
	//returns old value after insertion
	int keyBucket = hash(key);
	Entry<K, V> temp = table[keyBucket];
	while(temp != null){
	    if((temp.key == null && key == null) || (temp.key != null && temp.key.equals(key))){
		temp.value = value;
		return null;
	    }
	    temp = temp.next;
	}
	entries[keyBucket] = new HashMapEntry<K, V>(key, value, entries[keyBucket]);
    }

    public V get(final Object key) {
	Entry<K, V> entries = get(key);
	if(entries != null){
	    return entries.value;
	}
	return null;
    }

    public boolean containsValue(Object value) {
	return false;
    }

    public boolean containsKey(Object key) {
	Entry<K, V> entries = get(key);
	return entries != null;
	//	return false;
    }

    public boolean isEmpty() {
	return false;
    }
    
	
}
