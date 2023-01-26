package arvorebinaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Arvore a = new Arvore();
        
        a.inserir(15);
        a.inserir(5);
        a.inserir(20);
        a.inserir(25);
        a.inserir(10);
        a.inserir(0);
        a.inserir(30);
        a.inserir(-5);
        a.inserir(35);
        
        System.out.println("\n-------------------------------");
//        int op = 0;
//        do {
//            System.out.println("Deseja imprimir em: ");
//            System.out.println("(1) inOrder\t(2) preOrder\t(3) posOrder");
//            Scanner sc = new Scanner(System.in);
//            op = sc.nextInt();
//        } while (op < 1 || op > 3);
        System.out.println("\n-------------------------------");
        a.imprimir(1);
        System.out.println("\n-------------------------------");
        a.imprimir(2);
        System.out.println("\n-------------------------------");
        a.imprimir(3);
        System.out.println("\n-------------------------------");
        System.out.print(a.altura());
        System.out.println("\n-------------------------------");
        System.out.print(a.totalNo());
        System.out.println("\n-------------------------------");
        
        a.remover(15);
        a.remover(5);
        a.remover(20);
        a.remover(25);
        a.remover(10);
        a.remover(0);
        a.remover(30);
        a.remover(-5);
        a.remover(35);
        
        System.out.println("\n-------------------------------");
        a.imprimir(1);
        System.out.println("\n-------------------------------");
        System.out.print(a.altura());
        System.out.println("\n-------------------------------");
        System.out.print(a.totalNo());
        System.out.println("\n-------------------------------");
    }
    
}
