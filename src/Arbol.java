public class Arbol {
    Nodo raiz;
    public void InOrder(Nodo nodo){
        if( nodo == null){
            return;
        }
        InOrder(nodo.izquierdo);
        System.out.print(nodo.dato+" ");
        InOrder(nodo.derecho);
    }
}
