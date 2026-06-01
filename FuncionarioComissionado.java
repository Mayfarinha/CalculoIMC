public class FuncionarioComissionado extends Colaborador {

    private double totalVendas;
    private double percentualComissao;

    public FuncionarioComissionado(String nome, int matricula, double totalVendas, double percentualComissao) {
        super(nome, matricula);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularExtras() {
        return totalVendas * percentualComissao / 100;
    }

    // ✔ ADICIONADO: salário final inclui a comissão
    @Override
    public double calcularSalario() {
        return SALARIO_BASE + calcularExtras();
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.printf("Salário Fixo: R$ %.2f%n", SALARIO_BASE);
        // ✔ CORRIGIDO: era "%.2%n" e "%2.f"
        System.out.printf("Comissão (%.0f%% sobre R$ %.2f): R$ %.2f%n", percentualComissao, totalVendas, calcularExtras());
        System.out.printf("Salário Final: R$ %.2f%n", calcularSalario());
        System.out.println("------------------------------");
    }
}