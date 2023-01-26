package arvorebinaria;

public class Arvore {
    
    private No raiz;
    private int totElementos = 0;

    public Arvore() {
        raiz = null;
    }
    
    public void inserir(int valor) {
        inserir(raiz, valor);
    }
    
    private void inserir(No n, int valor) {
        if (raiz == null) {
            raiz = new No(valor);
            totElementos++;
        } else {
            if (valor < n.getValor()) {
                if (n.esquerda == null) {
                    n.esquerda = new No(valor);
                    totElementos++;
                } 
                else {
                    inserir(n.esquerda, valor);
                }
            } else if (valor > n.getValor()) {
                if (n.direita == null) {
                    n.direita = new No(valor);
                    totElementos++;
                } 
                else {
                    inserir(n.direita, valor);
                }
            }
        }
    }
    
    public No remover(int valor) {
        if (raiz == null) {
            System.out.println("Árvore vazia");
            return null;
        } else {
            if (raiz.esquerda == null && raiz.direita == null) {
                raiz = null;
                totElementos--;
                return null;
            } else {
                return remover(raiz, valor);
            }
        }
    }
    
    private No remover(No n, int valor) {
        if (valor < n.getValor()) {
            n.esquerda = remover(n.esquerda, valor);
        } else if (valor > n.getValor()) {
            n.direita = remover(n.direita, valor);
        } else if (n.esquerda != null && n.direita != null) {
            n.setValor(encontraMinimo(n.direita).getValor());
            n.direita = removeMinimo(n.direita);
            totElementos--;
        } else {
            if (n.esquerda != null) {
                n = n.esquerda;
            } else {
                n = n.direita;
            }
            totElementos--;
        }
        return n;
    }
    
    private No encontraMinimo(No n) {
        if (n != null) {
            while (n.esquerda != null) {
                n = n.esquerda;
            }
        }
        return n;
    }
    
    private No removeMinimo(No n) {
        if (n == null) {
            System.out.println("Erro: valor nulo");
        } else if (n.esquerda != null) {
            n.esquerda = removeMinimo(n.esquerda);
            return n;
        } else {
            return n.direita;
        }
        return null;
    }
    
    public void imprimir(int op) {
        if (raiz == null) {
            System.out.println("Árvore vazia");
        } else {
            if (op == 1) inOrder(raiz);
            if (op == 2) preOrder(raiz);
            if (op == 3) posOrder(raiz);
        }
    }
    
    private void inOrder(No n) {        
        if (n.esquerda != null) {
            inOrder(n.esquerda);
        }
        System.out.print(n.getValor() + " ");
        if (n.direita != null) {
            inOrder(n.direita);
        }        
    }
    
    private void preOrder(No n) {
        System.out.print(n.getValor() + " ");
        if (n.esquerda != null) {
            preOrder(n.esquerda);
        }
        if (n.direita != null) {
            preOrder(n.direita);
        }
    }
    
    private void posOrder(No n) {
        if (n.esquerda != null) {
            posOrder(n.esquerda);
        }
        if (n.direita != null) {
            posOrder(n.direita);
        }
        System.out.print(n.getValor() + " ");
    }
    
    public int altura() {
        return altura(raiz);
    }
    
    private int altura(No n) {
        if (n == null) {
            return 0;
        }
        int alturaEsquerda = altura(n.esquerda);
        int alturaDireita = altura(n.direita);
        if (alturaEsquerda > alturaDireita) {
            return alturaEsquerda + 1;
        } else {
            return alturaDireita + 1;
        }        
    }
    
    public int totalNo() {
        return totElementos;
    }
    
    public boolean isEmpty() {
        return raiz == null;
    }
    
}
