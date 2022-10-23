package ListaExercicios;

import java.util.Scanner;

/* 5. Escreva um programa que vai ler a idade de 5 pessoas, 
o sistema vai mostrar quantas são maior ou iguais a 18 e quantas são de menor. */
public class Questao05 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Escreva a idade da primeira pessoa:");
    int idd1 = ler.nextInt();
    System.out.println("Escreva a idade da segunda pessoa:");
    int idd2 = ler.nextInt();
    System.out.println("Escreva a idade da terceira pessoa:");
    int idd3 = ler.nextInt();
    System.out.println("Escreva a idade da quarta pessoa:");
    int idd4 = ler.nextInt();
    System.out.println("Escreva a idade da quita pessoa:");
    int idd5 = ler.nextInt();
    
    int contA=0;
    int contB=0;
        if(idd1>=18){
           contA++;
        }
        else{
        contB++;    
        }
        
        if(idd2>=18){
           contA++;
        }
        else{
        contB++;    
        }
        
        
        if(idd3>=18){
           contA++;
        }
        else{
        contB++;    
        }
        
        
        if(idd4>=18){
           contA++;
        }
        else{
        contB++;    
        }
        
        
        if(idd5>=18){
           contA++;
        }
        else{
        contB++;    
        }
        
         
        System.out.println(contA + " Maior(es) de idade e "+contB +" menor(es) de idade.");





    }
}
