import java.util.*;
public class Node<K,V>{
    K key;
    V value;
    boolean terminal;

    //HashMap<Character, Node> nexts;
    HashMap<K, Node> root;
    HashMap<K, Node> nexts;
    //HashMap<K, V> next;


    //public boolean hasNext(Character C){

    //}
    
    public Node getNext(Character nextKey){
	return nexts.get(nextKey);	
    }
    
    public V getVal(){
	return this.value;
    }

    public K getKey(){
	return this.key;
    }

    //public void setVal(K key, V value){
    //	this.value = value;
    //	this.key = key;
    //}

    public void setVal(V value){
    	this.value = value;
    }

    public void setNext(K key){
	this.key = key;
    }
}
