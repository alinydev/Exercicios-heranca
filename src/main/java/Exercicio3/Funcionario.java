package Exercicio3;
import java.util.Scanner;

public class Funcionario extends Pessoa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual seu departamento? ");
        String departamento = sc.nextLine();

        System.out.print("Qual seu cargo? ");
        String cargo = sc.nextLine();

        System.out.print("Qual sua função? ");
        String função = sc.nextLine();

        System.out.print("Ele é do departamento de " + departamento + " possui o cargo de " + cargo + " e sua função é " + função + ".");
    }
}