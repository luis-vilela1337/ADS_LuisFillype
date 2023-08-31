package cidadania;

import java.util.Scanner;

/**
 * Esta classe contém o método principal (main) para execução do programa.
 * Recebe informações do usuário sobre um cidadão e cria um objeto Cidadao com essas informações.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class Main {
    /**
     * Método principal que recebe informações do usuário e cria um objeto Cidadao.
     *
     * @param args Os argumentos de linha de comando (não utilizados neste contexto).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = scanner.nextLine();

        System.out.println("Sexo:");
        String sexo = scanner.nextLine();

        System.out.println("CPF:");
        String cpf = scanner.nextLine();

        System.out.println("Idade:");
        Integer idade = scanner.nextInt();

        Cidadao cidadao = new Cidadao(nome, sexo, idade, cpf);
    }
}
