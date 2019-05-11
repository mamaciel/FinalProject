/* 
 * @authors Angela, Alex, Marcos
 * @version 1.0 May 14 2019
 * CS174 Final Project
 * Compact Search Tree
 **/

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
    
    //main that tests the methods
    public static void main(String[] args){
	
	root.nexts.put("apple", 1);
	/*entries.put("banana", 2);
	entries.put("strawberry", 3);
	entries.put("avocado", 4);
	entries.put("band", 5);
	entries.put("bang", 6);
	System.out.println(entries.get("apple"));
	System.out.println(entries.get("banana"));
	System.out.println(entries.containsValue("peach"));
	*/
    }
    
    //return the size
    public int size() {
	return this.size;
    }
    
    //set a specific entry to a value
    //return the entries
    public Set<Entry<K, V>> entrySet() {

	return entries;
    }
    
    //Returns a set of all the keys from the hashmap
    public Set<K> keySet() {
	Set<K> keys = new LinkedHashSet<>();
	for(Entry<K, V> entry: entries) {
	    keys.add(entry.getKey());
	}
	return keys;
    }

    //clear the tree
    public void clear() {
	size = 0;
	root = null;
    }

    //Returns a collections with all values
    public Collection<V> values() {
	Collection<V> vals = new ArrayList<V>();
	for(Entry<K,V> entry : entries) {
	    vals.add(entry.getValue());
	}
	return vals;
    }
    
    //Copies all the elements of a map to another specific map
    public void putAll(final Map<? extends K, ? extends V> map) {
    }

    public V remove(final Object key) {
	for(Entry<K, V> entry : entries){
	    if(entry.getKey().equals(key)){
		entry = null;
		size--;
	    }
	}
	return null;
    }

    
    public V put(final K key, final V value) {
	key.toString();
	for(int i = 0;i < key.length();i++){
	    Node temp = new Node<Character, V>(key.charAt(i));
	}
	//LinkedHashSet<Node> singleNode = new LinkedHashSet<Node>();
	HashMap<K, Node> nexts = new HashMap<K, Node>();
	//next.setVal(value);

	for (Entry<K, V> entry : entries){
	    
	}
	
 	size++;
	return null;
    }

    //retrieve a specific key from the tree
    public V get(final Object key){
	for (Entry<K, V> entry : entries){
	    if(entry == key){
		return entry.getValue();
	    }
	}
	return null;
    }

    //determines if the tree contains a specific value
    public boolean containsValue(Object value) {
	return false;
    }

    //determines if the tree contains a specific key
    public boolean containsKey(Object key) {
	return false;
    }

    //checks if the tree is empty
    public boolean isEmpty() {
	if(root == null)
	    {
		return true;
	    }
	else
	    {
		return false;
	    }
    }
	
}
