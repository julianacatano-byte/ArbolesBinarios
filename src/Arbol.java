public class Arbol {
    Nodo raiz;
    public void PreOrder(Nodo nodo){
        if( nodo == null){
            return;
        }
        System.out.print(nodo.dato + " ");
        PreOrder(nodo.izquierdo);
        PreOrder(nodo.derecho);
    }
}
