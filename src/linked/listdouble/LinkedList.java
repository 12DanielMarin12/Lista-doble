package linked.listdouble;

public interface LinkedList {

    /***
     * Agrega un elemento al final de la lista.
     * @param object elemento
     * @return
     */
    boolean add(Object object);//GOOD

    /***
     * Inserta un elemento en una posición siguinete al nodo especificado.
     * @param node nodo
     * @param object elemento
     * @return
     */
    boolean add(LinkedListNode node, Object object);//GOOD

    /***
     * Agrega todos los elementos al final de la lista.
     * @param objects elementos
     * @return
     */
    boolean addAll(Object objects);//GOOD

    /***
     * Inserta todos los elementos desde una posición siguinete al nodo especificado.
     * @param node nodo
     * @param objects elementos
     * @return
     */
    boolean addAll(LinkedListNode node, Object objects);//GOOD

    /***
     * Inserta el elemento especificado al principio de esta lista.
     * @param object elemento
     * @return
     */
    boolean addFirst(Object object);//GOOD

    /***
     * Inserta el elemento especificado al final de esta lista.
     * @param object elemento
     * @return
     */
    boolean addLast(Object object);//GOOD

    /***
     * Elimina todos los elementos de esta lista.
     */
    void clear();//GOOD

    LinkedList clone();//GOOD

    /***
     * Devuelve verdadero si contiene el elemento.
     * @param object elemento
     * @return
     */
    boolean contains(Object object);//GOOD  
    
    
    /*
     * Devuelve verdadero si contiene todos los elementos.
     * @param objects elementos
     * @return
     */
    boolean containsAll(Object objects);

    /*
     * Devuelve el nodo del elemento especificado, o null si no contiene el elemento.
     * @param object elemento
     * @return
     */
    LinkedListNode nodeOf(Object object);//GOOD

    /*
     * la lsita tiene un tipo de dato y el bojeto agregado es del mismo tipo
     * Devuelve verdadero si el objeto especificado es igual a la lista.
     * @param object elemento
     * @return
     */
    boolean isEquals(Object object);//GOOD

    /*
     * Devuelve verdadero si no contiene elementos.
     * @return
     */
    boolean isEmpty();//GOOD

    /***
     * Obtener un elemento de la lista(depende del tipo de lista).
     * @return
     */
    Object get();//Good

    /***
     * Obtener un elemento de la posición del nodo especificado.
     * @param node nodo
     * @return
     */
    Object get(LinkedListNode node);//GOOD

    /***
     * Obtener un elemento de la posición previa al nodo especificado.
     * @param node nodo
     * @return
     */
    Object getPrevious(LinkedListNode node);//GOOD

    /***
     * Obtener un elemento de la posición siguinete al nodo especificado.
     * @param node nodo
     * @return
     */
    Object getNext(LinkedListNode node);//GOOD

    /***
     * Obtener el elemento especificado al principio de esta lista.
     * @return
     */
    Object getFirst();//GOOD

    /***
     * Obtner el elemento especificado al final de esta lista.
     * @return
     */
    Object getLast();//GOOD

    /***
     * Elimina el nodo en la lista.
     * @param object elemento
     * @return
     */
    boolean remove(Object object);//GOOD

    /***
     * Elimina el nodo en la lista.
     * @param node nodo
     * @return
     */
    boolean remove(LinkedListNode node);//GOOD

    /***
     * Elimina de esta lista todos sus elementos que están contenidos en la colección especificada.
     * @param objects elementos
     * @return
     */
    boolean removeAll(Object objects);

    /***
     * Conserva solo los elementos de esta lista que están contenidos en la colección especificada.
     * @param objects elementos
     * @return
     */
    boolean retainAll(Object objects);

    /***
     * Reemplaza el elemento en la posición del nodo especificado.
     * @param node nodo
     * @param object elemento
     * @return
     */
    boolean set(LinkedListNode node, Object object);//GOOG

    /***
     * Devuelve el número de elementos de esta lista.
     * @return
     */
    int size();//GOOD

    /***
     * Devuelve una vista de la parte de esta lista.
     * @param from nodo
     * @param to nodo
     * @return
     */
    LinkedList subList(LinkedListNode from, LinkedListNode to);//GOOD

    /***
     * Devuelve un array que contiene todos los elementos de esta lista.
     * @return
     */
    Object[] toArray();

    /***
     * Ordenar lista por ?
     * @return
     */
    LinkedList sort();

    /***
     * retorna un string con el contenido del nodo
     * @return
     */
    String toString();

}
