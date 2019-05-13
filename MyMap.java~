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
    private Node<K, V> root;
    private Node<K, V> tempNexts;

    //main that tests the methods
    public static void main(String[] args){
	//MyMap<K, V> map = new MyMap<K,V>();
	//root.nexts.put("apple", 1);
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
	for(final K e : map.keySet()){
	    put(e, map.get(e));
	}
    }

    public V remove(final Object key) {
	if(!entries.containsKey(key)){
	    return null;
	}
	else{
	    K first = entries.get(0);
	    if(entries.size() == 1){
		
	    }
	}
	return null;
    }

    
    public V put(final K key, final V value) {
	//HashMap<Character, Node> nexts = new HashMap<Character, Node>();
	if(size == 0){
	    root = null;
	}
	else{
	String keyString = key.toString();	    
	for(int i = 0;i < keyString.length();i++){
	    char a = keyString.charAt(i);
	    Node temp = new Node<Character, V>(a);
	    HashMap<K, V> tempNexts = temp.getNexts();
	    //Node<K, V> temp = new Node<>(a);
	    if(tempNexts.containsKey(a)){
		temp = temp.setNext(new Node(a)); 
	    }else{
		//temp = temp.setNext(
	    }
	}
	
	
	//temp.setVal(value);
	//LinkedHashSet<Node> singleNode = new LinkedHashSet<Node>();
	//HashMap<K, Node> nexts = new HashMap<K, Node>();
	//next.setVal(value);
	
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
	char a = key.toString().charAt(0);
<<<<<<< HEAD
	Node temp = new Node<Character, V>(a);
	if (temp.getKey() == key){
	    return true;
	}
	else{
=======
	Node temp = new Node<Character, V>(a); 
	if(temp.getKey() == key){
	    return true;
	}else{
>>>>>>> 869ac533564df45fbb73ee7b116bce3faccbee97
	    return false;
	}
    }

    //checks if the tree is empty
    public boolean isEmpty() {
	if(size == 0) {
		return true;
	}else{
		return false;
	}
    }
	
}
