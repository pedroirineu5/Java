package listaencadeada;



public class LinkedList<T>{
    private Node<T> start;
    private int length = 0;

    
    public void add(T data){
        Node<T> cel = new Node<T>(data);
        this.start = cel;
        this.length++;
    }

    public int getLength(){
        return this.length;
    }

    @Override
    public String toString() {
        return "LinkedList [start=" + start + "]";
    }

    
}