import java.util.*;
public class Node<K,V>{
    K key;
    V value;
    boolean terminal;
    Character a;
    
    HashMap<Character, Node> nexts;

    Node nextNode = new Node();
    //HashMap<K, V> next;

    public Node(){

    }
    
    public Node(Character a){
	this.a = a;
    }

    //public Node(HashMap<Character, Node> nexts){
    //	this.nexts = nexts;
    //}

    //public boolean hasNext(Character C){

    //}
    
    public Node getNext(Character nextKey){
	return nexts.get(nextKey);	
    }
    
    public V getVal(){
	return this.value;
    }

    public Character getKey(){
	return this.a;
    }

    public void setVal(V value){
    	this.value = value;
    }

    public void setNext(HashMap<Character, Node> nexts){
	this.nexts = nexts;
    }

    public HashMap<Character, Node> getNexts(){
	return this.nexts;
    }

    public boolean isTerminal(){
	return value != null;
    }

    /*public boolean containsNexts(Character a, Node temp){
	if(nexts.find(a, temp)){
	    return true;
	}else{
	    return false;
	}
	}*/
}
