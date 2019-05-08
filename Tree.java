import java.util.*;
public class Tree<V> {
    private Node<V> root;

    public Tree(V rootData) {
        root = new Node<V>();
        root.data = rootData;
        root.children = new HashSet<Node<V>>();
    }

    public static class Node<V> {
        private V data;
        private Node<V> parent;
        private Set<Node<V>> children;
    }
}

