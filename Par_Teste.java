import java.util.Scanner;

public class Par_Teste {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Digite o 1° número: ");
            int num_1 = input.nextInt();

            System.out.println("Digite o 2° número: ");
            int num_2 = input.nextInt();

            System.out.println("Digite o 3° número: ");
            int num_3 = input.nextInt();

            if (num_1 % 2 == 0) {
                System.out.println(num_1 + "-Par");
            }

                else {
                    System.out.println(num_1 + "-Ímpar");
            }
            
            if (num_2 % 2 == 0) {
                System.out.println(num_2 + "-Par");
            }

                else {
                    System.out.println(num_2 + "-Ímpar");
            }

            if (num_3 % 2 == 0) {
                System.out.println(num_3 + "-Par");
            }

                    else {
                        System.out.println(num_3 + "-Ímpar");
            
                }
                
                System.out.println("Deseja uma nova consulta?");
                    Scanner pgt_resposta = new Scanner(System.in);
                    String  pgt_respondida = pgt_resposta.nextLine();

                    if ("Sim".equals(pgt_respondida.toLowerCase()) ||
                        "sim".equals(pgt_respondida.toLowerCase())) {
                            System.out.println("----Nova Consulta----");
                        }

                        else {
                            System.out.println("Saindo...");
                            break;
                        }              
               
        }
    }
}

