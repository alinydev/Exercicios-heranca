package Exercicio2;

    public class Pessoa {

        public String nome;
        public int idade;


            // Método falar
            public static void falar(String mensagem) {
                System.out.println(mensagem);
            }

            public static void main(String[] args) {

                Pessoa pessoa = new Pessoa();

                // Chamando o método falar
                pessoa.falar("Olá!");

            }
        }
