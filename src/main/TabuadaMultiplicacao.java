package main;

import java.util.Scanner;

public class TabuadaMultiplicacao {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem vindo(a) ao App Tabuada da Multiplica��o! ");
        System.out.println("Digite um n�mero para saber a Tabuada de sua multiplica��o: ");
        int num1 = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            // Calcula e imprime a linha da tabuada.
            System.out.println(num1 + " x " + i + " = " + (num1 * i));
        }
        
        // Boa pr�tica: fechar o scanner para liberar os recursos.
        scanner.close();
        
//        for ( inicializa��o ; condi��o ; incremento ) {
    // Bloco de c�digo a ser repetido

    }
    
}
