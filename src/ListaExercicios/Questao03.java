package ListaExercicios;

import java.util.Scanner;

/* 3. Escreva um programa que vai ler 2 números, o sistema 
vai escrever na tela todos os número entre os 2 digitados. */
public class Questao03 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Escreva o primeiro número:");
    int n1 = ler.nextInt();
    System.out.println("Escreva o segundo número:");
    int n2 = ler.nextInt();
    System.out.println("Os números escolhidos foram "+n1+" e "+n2+ ", os números inteiros existentes entre eles são: " );
       
    
    n2= n2+1;
    while(n1>n2){
    System.out.println(n2++);
             }
    
    n1= n1+1;
    n2=n2-1;
    while (n2>n1) {
    System.out.println(n1++);       
           }
        
}
}