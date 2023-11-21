import java.util.ArrayList;
import java.util.Arrays;

public class Node<T> {
    private ArrayList<Node<T>> connections = new ArrayList<>();
    public Node(T data, Node<T>... nodes){
        this.connections.addAll(Arrays.asList(nodes));
    }
    public Node()
}
