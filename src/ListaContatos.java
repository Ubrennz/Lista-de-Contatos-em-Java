import util.Contatos;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ListaContatos {
    private static Scanner sc = new Scanner(System.in);
    private static Contatos contato;
    private static List<Contatos> agendaContatos = new ArrayList<>();


    public static void criarContato() {

    }

    public static void main(String[] args) {
        System.out.println("SISTEMA DE AGENDA DE CONTATOS");
        int opcao;

        do {
            System.out.println("[1] para criar um novo contato\n[2] para visualizar a agenda de contatos");
            System.out.println("[3] para editar um contato\n[4] para remover um contato da agenda de contatos");
            System.out.println("[0] para sair\nDigite a opção:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    criarContato();
                    break;
                case 2:
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

    }
}
