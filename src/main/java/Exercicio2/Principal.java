package Exercicio2;
import java.lang.String;

    //O código (Classe Principal) exibe todos os atributos e chama todos os métodos envolvidos no processo.

    public class Principal extends Pessoa {

        public static void main(String[] args) {

            String nome = "Aliny";
            int idade = 21;

            // Exibir todos os atributos
            System.out.println(nome);
            System.out.println(idade);

            //Chama o Método falar
            Pessoa pessoa = new Pessoa();
            Principal.falar("Olá!");


        }

            public static void falar(String string) {
			
		}
    }
