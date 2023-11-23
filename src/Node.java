import java.util.ArrayList;
import java.util.Arrays;

public class Node<T> implements Comparable<Node> {
    private ArrayList<Node<T>> connections = new ArrayList<>();
    private T data;
    public Node(T data, Node<T>... nodes){
        this.connections.addAll(Arrays.asList(nodes));
    }
    public Node(T data){
        this.data = data;
    }

    public T data(){
        return this.data;
    }
}
public class Node<>
