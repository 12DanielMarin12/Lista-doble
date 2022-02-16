 
package linked.listdouble;
 
public class ListaDoble {

        Node head=null;
	Node tail=null;
        int cont=0;
	
    public ListaDoble() {
            this.head = null;
            this.tail = null;	
    }
	
    public ListaDoble(Object object) {
            this.head = new Node(object);
            this.tail = head;
            cont++;
    }
    public ListaDoble(Node node){ 
        if(isEmpty()) {
            head = node;
            tail = head;
        }else{
            this.tail.next = node;
            this.tail.getNext().setPrevius(tail);
            this.tail = this.tail.next; 
        }
        cont++; 
	 
    }
    public boolean isEmpty() {
        return head == null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    public String toString(){
        String M = "";
        if(isEmpty()){
            return "Lista vacia";
        }else{
            Node Current = head;
            M += Current.toString();
            while(Current.getNext()!=null){
                Current = Current.getNext();
                M += Current.toString();
            }
            return M; 
        }
    }
    //METODOS DE LA LISTA DOBLE
    
    public boolean add(Object object){
        Node nueva = new Node(object);
        if(isEmpty()) {
            head = nueva;
            tail = head;
        }else{
            this.tail.next = nueva;
            this.tail.getNext().Previus = tail;
            this.tail = this.tail.next; 
        }
        cont++; 
        return true;
    }
    
    public String toStringHead(){
        String M = "";
        if(isEmpty()){
            return "Lista vacia";
        }else{
            Node Current = head;
            M += Current.toString();
            while(Current.getNext()!=null){
                Current = Current.getNext();
                M += Current.toString();
            }
            return M; 
        }
    }
    public String toStringTail(){
        String M = "";
        if(isEmpty()){
            return "Lista vacia";
        }else{
            Node Current = tail;
            M += Current.toString();
            while(Current.getPrevius()!=null){
                Current = Current.getPrevius();
                M += Current.toString();
            }
            return M; 
        }
    }
    
    public Object search(Object object){ 
        if(isEmpty()) {
            return false;
        }else{
            Node Current = tail;
            if(Current.getObject()==object){
                return Current;
            }else{
                while(Current.getPrevius()!=null){
                    Current = Current.getPrevius();
                    if(Current.getObject()==object){
                        return Current;
                    }
                }
            } 
        }
        return false;
    }
    
    public boolean delete(Object object){
        if(isEmpty()) {
            return false;
        }else{
            Node Current = tail;
            if(Current.getObject()==object){
                if(tail.getPrevius()==null){
                    tail=null;
                    head=null;
                }else{
                    Current.getPrevius().setNext(null);
                    tail = Current.getPrevius();
                }
                cont--;
                return true;
            }else{
                while(Current.getPrevius()!=null){
                    Current = Current.getPrevius();
                    if(Current.getObject()==object){
                        if(Current.getNext()==null)
                        cont--;
                        return true;
                    }
                }
            } 
        }
        return false;
    }
    
    
    
}
