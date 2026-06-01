import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Colaborador> colaboradores = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("========================================");
        System.out.println("  SISTEMA DE FOLHA DE PAGAMENTO - v1.0  ");
        System.out.println("========================================");

        do {
            exibirMenu();

            while (!sc.hasNextInt()) {
                System.out.println("Entrada inválida! Digite um número de 0 a 4.");
                sc.next();
            }
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: cadastrarPadrao(sc, colaboradores); break;
                case 2: cadastrarComissionado(sc, colaboradores); break;
                case 3: cadastrarProducao(sc, colaboradores); break;
                case 4: gerarFolha(colaboradores); break;
                case 0: System.out.println("\nEncerrando o sistema. Até logo!"); break;
                default: System.out.println("Opção inválida! Escolha entre 0 e 4.");
            }

        } while (opcao != 0);

        sc.close();
    }

    static void exibirMenu() {
        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("1 - Cadastrar Funcionário Padrão");
        System.out.println("2 - Cadastrar Funcionário Comissionado");
        System.out.println("3 - Cadastrar Funcionário de Produção");
        System.out.println("4 - Gerar Folha de Pagamento");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    static void cadastrarPadrao(Scanner sc, ArrayList<Colaborador> lista) {
        System.out.println("\n-- Cadastro: Funcionário Padrão --");
        System.out.print("Nome: ");
        String nome = sc.nextLine().trim();
        int matricula = lerInteiroPositivo(sc, "Matrícula: ");
        lista.add(new FuncionarioPadrao(nome, matricula));
        System.out.println("✔ Funcionário padrão cadastrado com sucesso!");
    }

    static void cadastrarComissionado(Scanner sc, ArrayList<Colaborador> lista) {
        System.out.println("\n-- Cadastro: Funcionário Comissionado --");
        System.out.print("Nome: ");
        String nome = sc.nextLine().trim();
        int matricula = lerInteiroPositivo(sc, "Matrícula: ");
        double vendas = lerDoublePositivo(sc, "Valor total de vendas (R$): ");
        double percentual = lerDoublePositivo(sc, "Percentual de comissão (%): ");
        lista.add(new FuncionarioComissionado(nome, matricula, vendas, percentual));
        System.out.println("✔ Funcionário comissionado cadastrado com sucesso!");
    }

    static void cadastrarProducao(Scanner sc, ArrayList<Colaborador> lista) {
        System.out.println("\n-- Cadastro: Funcionário de Produção --");
        System.out.print("Nome: ");
        String nome = sc.nextLine().trim();
        int matricula = lerInteiroPositivo(sc, "Matrícula: ");
        int qtdPecas = lerInteiroPositivo(sc, "Quantidade de peças produzidas: ");
        double valorPeca = lerDoublePositivo(sc, "Valor por peça (R$): ");
        lista.add(new FuncionarioProducao(nome, matricula, qtdPecas, valorPeca));
        System.out.println("✔ Funcionário de produção cadastrado com sucesso!");
    }

    static void gerarFolha(ArrayList<Colaborador> lista) {
        System.out.println("\n========================================");
        System.out.println("         FOLHA DE PAGAMENTO             ");
        System.out.println("========================================");

        if (lista.isEmpty()) {
            System.out.println("Nenhum colaborador cadastrado ainda.");
            return;
        }

        System.out.println("Total de pessoas cadastradas: " + lista.size());
        System.out.println("----------------------------");

        for (Colaborador c : lista) {
            c.exibirDados();
        }

        double totalFolha = 0;
        for (Colaborador c : lista) {
            totalFolha += c.calcularSalario();
        }

        System.out.printf("TOTAL DA FOLHA: R$ %.2f%n", totalFolha);
        System.out.println("========================================");
    }

    static int lerInteiroPositivo(Scanner sc, String mensagem) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                sc.nextLine();
                if (valor > 0) return valor;
                System.out.println("Valor inválido! Digite um número inteiro positivo.");
            } else {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                sc.nextLine();
            }
        }
    }

    static double lerDoublePositivo(Scanner sc, String mensagem) {
        double valor;
        while (true) {
            System.out.print(mensagem);
            if (sc.hasNextDouble()) {
                valor = sc.nextDouble();
                sc.nextLine();
                if (valor >= 0) return valor;
                System.out.println("Valor inválido! Digite um número positivo.");
            } else {
                System.out.println("Entrada inválida! Digite um número válido.");
                sc.nextLine();
            }
        }
    }
}