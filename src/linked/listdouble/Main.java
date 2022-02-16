package linked.listdouble;
 
public class Main {

	public static void main(String[] args) {
	       ListaDoble n = new ListaDoble();
               n.add(1);
               n.delete(1);
               n.add(2);
               n.add(3);
               n.add(4);
               n.add(5);
               n.add(6);
               
               System.out.println(n.toString());
               System.out.println(n.toStringTail());
               
               System.out.println(n.search(1));
    }	
}
