package arvorebinaria;

public class No {
    
    private int valor;
    No esquerda = null;
    No direita = null;

    public No(int valor) {
        this.valor = valor;
    }  

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}