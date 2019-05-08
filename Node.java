import java.util.*;
public class Node<K,V>{
    K key;
    V value;
    boolean terminal;
    
    HashMap<K, Node> next;
    
    Node getNext(K nextKey){
	return next.get(nextKey);
    }
    
    V getVal(){
	return this.value;
    }
    
    void setVal(V value){
	this.value = value;
    }
    void setNext(HashMap<K, Node> next){
	this.next = next;
    }
}
