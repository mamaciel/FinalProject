import java.util.*;
public class Node<K,V>{
    K key;
    V value;
    boolean terminal;
    
    //HashMap<K, Node> next;
    HashMap<K, V> next;
    //Node getNext(K nextKey){
	//return next.get(nextKey);
	
    //}
    
    public V getVal(){
	return this.value;
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
