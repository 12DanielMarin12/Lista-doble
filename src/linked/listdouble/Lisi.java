
package linked.listdouble;

//SE PRESENTO UN ERROR CATASTROFICO, NO PODIA IMPLEMENTAR OBJETOS DE LA CASE SI ESTA HEREDABA DE "LinkedList"
//AUN ASI TODOS LOS METODOS SOLICITADOS ESTAN AQUI.
 
public class Lisi implements LinkedList{
        Node head=null;
	Node tail=null;
        int cont=0;
	
    public Lisi() {
            this.head = null;
            this.tail = null;	
    }
	
    public Lisi(Object object) {
            this.head = new Node(object);
            this.tail = head;
            cont++;
    }
   
    //metodo agregado especificamente para poder eliminar pasando un nodo como dato
    public boolean add(Node node){
        try {
            if(isEmpty()) {
                head = node;
                tail = head;
            }else{
                this.tail.next = node;
                this.tail.getNext().setPrevius(tail);
                this.tail = this.tail.next; 
            }
            cont++;
            return true;
	}catch (Exception e) {
            return false;
	}
    }
    
    @Override
    public boolean add(Object object) {
        try {
            if(isEmpty()) {
                this.head = new Node(object);
                this.head.setNext(tail);
	        this.tail = head;
            } else {
                this.tail.next = new Node(object);
		this.tail = this.tail.next;
            }
            cont++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean add(LinkedListNode node, Object object) {
        try {
            if(isEmpty()){
                return false; 
            }else{
                Node current = head;  
                if(current.getObject()==node.getObject()){
                    Node next = current.getNext();
                    current.setNext(new Node(object, next));
                    cont++;
                    return true;
                }else{
                    while(current.getNext()!=null){
                        current = current.getNext();
                        if(current.getObject()==node.getObject()){
                            if(current.getObject()==tail.getObject()){
                                Node x = new Node(object);
                                current.setNext(x);
                                    tail = x; 
                                    cont++;
                                    return true;
                                }else{
                                    Node next = current.getNext();
                                    current.setNext(new Node(object,next));
                                    cont++;
                                    return true;
                                }
                            }
                        } 
                    }
                } 
                return false;
            }catch (Exception e){
                return false;
            }    
    }

    @Override//LO SIENTO NO ENTENDÍ LO QUE QUIZO DECIR
    public boolean addAll(Object objects) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override//LO SIENTO NO ENTENDÍ LO QUE QUIZO DECIR
    public boolean addAll(LinkedListNode node, Object objects) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addFirst(Object object) {
        Node nuevo = new Node(object);
        if(isEmpty()){
            head=nuevo;
            tail=head;
            cont++;
            return true;
        }else{            
            nuevo.setNext(head);
            head = nuevo;
            cont++;
            return true;
            }
    }

    @Override
    public boolean addLast(Object object) {
        Node nuevo = new Node(object);
        if(isEmpty()){
            tail=nuevo;
            head=tail;
            cont++;
            return true;
        }else{            
            tail.setNext(nuevo);
            tail = nuevo;
            cont++;
            return true;
        }
    }

    @Override
    public void clear() {
        head = tail = null;
        cont = 0;
    }
 
    public LinkedList clone() {
        Lisi ListClone = new Lisi();
        ListClone.setHead(getHead());
        ListClone.setTail(getTail());
        ListClone.setCont(getCont());            
        return ListClone;
    }

    @Override
    public boolean contains(Object object) {
    if(isEmpty()){
        return false;
        }else{
            Node current = head;
            if(current.getObject()==object){
                return true;
            }else{
                while(current.getNext()!=null){
                    current = current.getNext();
                    if(current.getObject()==object){
                        return true;
                    }                        
                }
            return false;
            }        
        }
    }

    @Override
    public boolean containsAll(Object objects) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinkedListNode nodeOf(Object object) {
        Node especifico = new Node("Nodo no encontrado");
        if(isEmpty()){
            return especifico;
        }else{
            Node current = head;
            if(current.getObject()==object){
                return current;
            }else{
                while(current.getNext()!=null){
                    current = current.getNext();
                    if(current.getObject()==object){
                        return current;
                    }                        
                }
            return especifico;
            }        
        }
    }

    @Override
    public boolean isEquals(Object object) {
        if(isEmpty()){
            return false;
        }else{
            Node current = head;
            if(current.getObject()==object){
                return true;
            }else{
                while(current.getNext()!=null){
                    current = current.getNext();
                    if(current.getObject()==object){
                        return true;
                    }                        
                }
            return false;
            }        
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Object get() {
        return tail;
    }

    @Override
    public Object get(LinkedListNode node) {
        if(isEmpty()){
                return "lista vacia";
        }else{
            Node current = head;
            int c = 1;
            if(current.getObject()==node.getObject()){
                return "posicion del nodo especificado 1";
            }else{
                while(current.getNext()!=null){
                    current = current.getNext();
                    if(current.getObject()==node.getObject()){
                        return "posicion del nodo especificado "+c ;
                    }       
                    c++;
                }
            return false;
            }           
        }
    }

    @Override
    public Object getPrevious(LinkedListNode node) {
        if(isEmpty()){
            return "lista vacia";
        }else{
            Node current = head;
            int c = 0;
            if(current.getObject()==node.getObject()){
                return "No hay nodos previos al especificado";
            }else{
                while(current.getNext()!=null){
                    current = current.getNext();
                    if(current.getObject()==node.getObject()){
                        return "posicion previa al nodo especificado: "+c;
                    }  
                    c++;   
                }
                return false;
            }        
        }
    }

    @Override
    public Object getNext(LinkedListNode node) {
        if(isEmpty()){
            return "lista vacia";
        }else{
            Node current = head;
            int c = 0;
            if(current.getObject()==node.getObject()){
                return "posicion siguiente al nodo especificado: 1";
            }else{
                while(current.getNext()!=null){
                    c++;
                    current = current.getNext();
                    if(current.getObject()==node.getObject()){
                        return (current.getNext()==null)?"no hay mas nodos despues del especificado":
                                "posicion del nodo siguiente al especificado:  "+(c+1);
                    }     
                }
            return false;
            }        
        }
    }

    @Override
    public Object getFirst() {
        return head;
    }

    @Override
    public Object getLast() {
        return tail;
    }

    @Override
    public boolean remove(Object object) {
        if(isEmpty()){
           return false;
        }else{
            Node current = head; 
            if(current.getObject()==object){
                if(current.getNext()==null){
                    head=null;
                    tail=null;
                    cont=0;
                    cont--;
                    return true;        
                }else{
                    head = current.getNext();
                    cont--;
                    return true;
                }                    
            }
            while(current.getNext()!=null){
                if(current.getNext().getObject()==object){
                    current.setNext(current.getNext().getNext());
                    cont--;
                    return true;
                }
                current = current.getNext();
            }
            return false;
        }
    }

    @Override
    public boolean remove(LinkedListNode node) {
        if(isEmpty()){
            return false;
        }else{
            Node current = head; 
            if(current==node){
                if(current.getNext()==null){
                    head=null;
                    tail=null;
                    cont=0;
                    return true;
                }else{
                    head = current.getNext();
                    return true;
                }                    
            }
            while(current.getNext()!=null){
                if(current.getNext()==node){
                    current.setNext(current.getNext().getNext());
                    return true;
                }
                current = current.getNext();
            }
            return false;
        }
    }

    @Override
    public boolean removeAll(Object objects) {
        head=null;
        tail=null;
        return true;
    }

    /**
     *
     * @param objects
     * @return
     */
    @Override//LO SIENTO NO ENTENDÍ LO QUE QUIZO DECIR
    public boolean retainAll(Object objects) { 
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.  
    }

    @Override
    public boolean set(LinkedListNode node, Object object) {
        if(isEmpty()){
            return false;
        }else{
            Node current = head;
            if(current.getObject()==node.getObject()){
                current.setObject(object);
                return true;
            }else{
                while(current.getNext()!=null){
                    current = current.getNext();
                    if(current.getObject()==node.getObject()){
                        current.setObject(object);
                        return true;
                    }     
                }
            return false;
            }        
        }
    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public LinkedList subList(LinkedListNode from, LinkedListNode to) {
        Lisi nueva = new Lisi();
        if(isEmpty()){
            return nueva;
        }else{
            Node Current = head;
            if(Current.getObject()==from.getObject()){
                nueva.add(Current);
                while(Current.getNext()!=null){ 
                        Current = Current.getNext();
                        if(Current.getObject()==to.getObject()){ 
                            nueva.add(Current);
                            return nueva;
                        }  
                        nueva.add(Current);
                    }
            }                
            while(Current.getNext()!=null){
                Current = Current.getNext();
                if(Current.getObject()==from.getObject()){ 
                    nueva.add(Current);
                    while(Current.getNext()!=null){ 
                        Current = Current.getNext();
                        if(Current.getObject()==to.getObject()){ 
                            nueva.add(Current);
                            return nueva;
                        }  
                        nueva.add(Current);
                    }
                }
            } 
            return nueva;
        } 
    }

    @Override
    public Object[] toArray() {
        Object nueva[] = new Object[cont];
        Node current = head;
        for(int i=0; i<cont; i++){ 
            nueva[i]=current;
            current = current.getNext();
        }
        return nueva;
    }

    @Override
    public LinkedList sort() {
        Lisi nueva = new Lisi();
        if(isEmpty()){
            return nueva; 
        }else{
            Node current = head;  
            nueva.add(current.getObject());
            while(current.getNext()!=null){
                current = current.getNext();
                Node N = new Node(current.getObject());
                N.setNext(nueva.getHead());
                nueva.setHead(N);
            }
            return nueva;
        }
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
 
    public void setHead(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
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
 
     
    
    
    
}
