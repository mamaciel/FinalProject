import java.util.*;
public class Node<K,V>{
    K key;
    V value;
    boolean terminal;
    
    HashMap<K, Node> next;

    Node getNext(K nextKey){
	return next.get(nextKey);
    }
}
