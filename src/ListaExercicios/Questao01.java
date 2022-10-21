package ListaExercicios;

import java.util.Scanner;

/* 1. Escreva um programa que vai ler um número, o sistema 
vai escrever na tela a tabuada de 1 até 10 do número digitado.
 */
public class Questao01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    System.out.println("Escreva um número referente a tabuada desejada:");
    int num = ler.nextInt();
    System.out.println("Você escolheu a tabuada do "+num);
    int x = 0; 
    while (x < 10){
        x++;
        int tab = num * x;
        System.out.println(tab);
    }
    
        

        

    }
}
