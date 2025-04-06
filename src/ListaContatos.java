import util.Contatos;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;

public class ListaContatos {
    private static Scanner sc = new Scanner(System.in);
    private static List<Contatos> agendaContatos = new ArrayList<>();

    public static String dataAtual() {
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.now();
        return data.format(formatacao);
    }

    public static String horaAtual() {
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("kk:mm:ss");
        LocalTime hora = LocalTime.now();
        return hora.format(formatacao);
    }

    public static void criarContato() {
        System.out.print("Digite o nome do contato: ");
        String nomeContato = sc.nextLine();
        System.out.print("Digite o número do contato: ");
        String numeroContato = sc.next();

        Contatos contato = new Contatos(nomeContato, numeroContato, dataAtual(), horaAtual());
        agendaContatos.add(contato);
        System.out.println("Contato " + nomeContato + " criado com sucesso!");
    }

    public static void verListaContatos() {
        for (Contatos pessoa : agendaContatos) {
            System.out.println(pessoa.toString());
        }
    }

    public static void atualizarNome() {
        System.out.print("Digite o nome do contato: ");
        String antigoNome = sc.nextLine();

        boolean nomeAtualizado = false;

        for (Contatos nome : agendaContatos) {
            if (antigoNome.equalsIgnoreCase(nome.getNome())) {
                System.out.print("Digite o novo do contato: ");
                String novoNome = sc.nextLine();

                nome.setNome(novoNome);
                System.out.println("Nome atualizado com sucesso!");
                nomeAtualizado = true;
            }
        }

        if (!nomeAtualizado) {
            System.out.printf("O contato %s não existe.\n", antigoNome);
        }
    }

    public static void atualizarNumero() {
        System.out.print("Digite o número do contato: ");
        String antigoNumero = sc.nextLine();

        boolean numeroAtualizado = false;

        for (Contatos numero : agendaContatos) {
            if (antigoNumero.equals(numero.getTelefone())) {
                System.out.print("Digite o novo número do contato: ");
                String novoNumero = sc.nextLine();

                numero.setTelefone(novoNumero);
                System.out.println("O número do contato foi atualizado com sucesso!");
                numeroAtualizado = true;
            }
        }

        if (!numeroAtualizado) {
            System.out.printf("O número não %s não existe.\n", antigoNumero);
        }
    }

    public static void atualizarContato() {
        verListaContatos();

        System.out.print("[1] Para editar o nome do contato\n[2] Para editar o número do contato\nDigite a opçao: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                atualizarNome();
                break;
            case 2:
                atualizarNumero();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public static void removerContato(){
        verListaContatos();

        System.out.print("Digite o nome do contato que você deseja remover: ");
        String nomeContato = sc.nextLine();

        boolean contatoRemovido = false;
        int count = 0;

        for (Contatos contato : agendaContatos) {
            if (nomeContato.equalsIgnoreCase(contato.getNome())) {
                agendaContatos.remove(count);
                contatoRemovido = true;
                System.out.println("Contato " + contato.getNome() + " removido com sucesso!");
                break;
            }

            count ++;
        }

        if (!contatoRemovido) {
            System.out.println("O contato " + nomeContato + " não está dentro da agenda de contatos");
        }
    }

    public static void main(String[] args) {
        System.out.println("SISTEMA DE AGENDA DE CONTATOS");
        int opcao;

        do {
            System.out.println("[1] para criar um novo contato\n[2] para visualizar a agenda de contatos");
            System.out.println("[3] para editar um contato\n[4] para remover um contato da agenda de contatos");
            System.out.print("[0] para sair\nDigite a opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 0:
                    System.out.println("Processo finalizado!");
                    break;
                case 1:
                    criarContato();
                    break;
                case 2:
                    verListaContatos();
                    break;
                case 3:
                    atualizarContato();
                    break;
                case 4:
                    removerContato();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}
