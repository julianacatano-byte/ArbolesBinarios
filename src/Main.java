public class Main{
    public static void main (String[] args){
        Arbol arbol = new Arbol();
        arbol.raiz = new Nodo('A');

        arbol.raiz.izquierdo = new Nodo('B');
        arbol.raiz.derecho = new Nodo('C');
        arbol.raiz.izquierdo.izquierdo = new Nodo('D');
        arbol.raiz.izquierdo.derecho = new Nodo ('E');
        arbol.raiz.derecho.izquierdo= new Nodo ('F');
        arbol.raiz.derecho.derecho = new Nodo ('G');
        arbol.raiz.izquierdo.izquierdo.izquierdo = new Nodo('H');
        arbol.raiz.izquierdo.izquierdo.derecho = new Nodo('I');
        arbol.raiz.izquierdo.derecho.derecho= new Nodo('J');

        arbol.PostOrder(arbol.raiz);
    }
}