package ListaExercicios;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva a sua mensagem:");
        String mensagem = ler.nextLine();
        System.out.println("Quantas vezes ela deve se repetir?");
        int num = ler.nextInt();

        int i =0;
        while(i<num){
            System.out.println(mensagem);
            i++;
        }
        
       /* System.out.println(mensagem.repeat(num));*/
        }
        
    }

