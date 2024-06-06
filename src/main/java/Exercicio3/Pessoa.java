package Exercicio3;
import java.util.Scanner;

public class Pessoa {

    //Classe Pessoa

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Qual seu nome? ");
            String nome = sc.nextLine();

            System.out.print("Qual sua idade? ");
            int idade = sc.nextInt();

            System.out.print("Qual seu telefone? ");
            int telefone = sc.nextInt();

            System.out.println("O funcionário " + nome + " possui " + idade + " anos, e seu telefone de contato é o: " + telefone + ".");
        }
    


        }
