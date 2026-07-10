public class Arbol {
    Nodo raiz;
    public void PostOrder(Nodo nodo){
        if( nodo == null){
            return;
        }
        PostOrder(nodo.izquierdo);
        PostOrder(nodo.derecho);
        System.out.print(nodo.dato+" ");

    }
}
