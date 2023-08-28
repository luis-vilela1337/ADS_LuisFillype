package cidadania;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = scanner.nextLine();
        String sexo = scanner.nextLine();
        String cpf = scanner.nextLine();
        Integer idade = scanner.nextInt();

        Cidadao cidadao = new Cidadao(nome,sexo,idade,cpf);
    }
}
