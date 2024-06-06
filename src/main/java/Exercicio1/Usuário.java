package Exercicio1;
import java.util.Scanner;

public class Usuário {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Qual seu nome? ");
    String nome = sc.nextLine();

    System.out.print("Qual seu email ");
    String email = sc.nextLine();

    System.out.print("Qual seu telefone? ");
    int telefone = sc.nextInt();

    System.out.print("A usuária se chama " + nome + ", seu telefone é: " + telefone + ", e seu email é " + email + ".");
}
    }
