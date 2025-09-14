package main;

import java.util.Scanner;

public class TabuadaMultiplicacao {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem vindo(a) ao App Tabuada da Multiplicação! ");
        System.out.println("Digite um número para saber a Tabuada de sua multiplicação: ");
        int num1 = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            // Calcula e imprime a linha da tabuada.
            System.out.println(num1 + " x " + i + " = " + (num1 * i));
        }
        
        // Boa prática: fechar o scanner para liberar os recursos.
        scanner.close();
        
//        for ( inicialização ; condição ; incremento ) {
    // Bloco de código a ser repetido

    }
    
}
