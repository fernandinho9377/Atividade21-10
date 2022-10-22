package ListaExercicios;

import java.util.Scanner;

/* 4. Escreva um programa que vai ler uma palavra, se a 
palavra for diferente de "Java-2022" o retorno vai ser "Palavra Errada" 
se igual "Palavra Ok" a pessoa pode faze no máximo 5 tentativas de acertar a palavra.
 */
public class Questao04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            int tentativas=0;
            while(tentativas<5){
            System.out.println("Escreva uma palavra:");
            String palavra = ler.nextLine();
            String p = "Java-2022";
        if (palavra.equals(p)){
        System.out.println("Palavra OK!");
        }else{ 
        System.out.println("Palavra Errada!");

       tentativas = tentativas +1;
        System.out.println("Número de tentativas excedido!");
       
            }
        
        }



    }
}
