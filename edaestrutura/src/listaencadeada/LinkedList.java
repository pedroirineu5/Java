package listaencadeada;



public class LinkedList<T>{
    private Node<T> start;
    private Node<T> last;
    private int length = 0;

    public void add(T data){
        Node<T> cel = new Node<T>(data);
        if (this.length == 0){
            this.start = cel; //A HEAD APONTA PARA O PRIMEIRO NÓ, POR ISSO É UMA HEAD.(Isso também só funciona no primeiro nó, pq depois que só vai rodar é o else)
        }
        else{
            this.last.setNext(cel);// O nó do lado do nó passado no caso ficaria assim NODE=[DATA=1[NEXT=NODE[DATA=2[NEXT=NULL]]]]
        }        
        this.last = cel; // atribuindo o TAIL para a ultima estrutura de nó
        this.length++; //incrementando o size do NÓ para ajudar a contar
    }

    public void search(T target){
         
        while (current.next !=null){
            atual = current.next
        }
    }

    public int getLength(){
        return this.length;
    }

    @Override
    public String toString() {
        return "LinkedList [start=" + start + "]";
    }

    
}