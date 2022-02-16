package linked.listdouble;

public class Node implements LinkedListNode {

	private Object object;
	public Node next;
        public Node Previus;
		
	public Node(Object object, Node node) {		
		this.object = object;
		this.next = node;
	}
	
	public Node(Object object) {		
		this.object = object;
		this.next = null;
	}
			
	public Object getObject() {
		return object;
	}
        
	public void setObject(Object object) {
		this.object = object;
	}

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevius() {
        return Previus;
    }

    public void setPrevius(Node Previus) {
        this.Previus = Previus;
    }
        
    
    

    @Override
    public String toString() {
            return "Node [object=" + object + "] |o| ";
    }
	
	
	
}
