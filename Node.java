import java.util.*;
public class Node<K,V>{
    K value;
    V value;
    boolean terminal;
    
    HashMap<K, Node> next;

    Node getNext(K nextkey){
	return next.get(nextKey);
    }
}
