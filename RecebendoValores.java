package br.com.fundamentosjava; //Esse código tem intuito de receber dado do usuário.
import java.util.Scanner; //importando a classe scanner
public class RecebendoValores {

    public static void main(String[] args) {
        System.out.println("digite um numero: ");//imprimindo mensagem pedindo informações ao usuário.
        Scanner entrada = new Scanner(System.in); //usando ferramenta scanner.
        int num1 = entrada.nextInt();//armazenando valor inserido em uma variável.
        System.out.println("o numero digitado pelo usuario foi: "+num1);//imprimindo o valor inserido.
    }
}
