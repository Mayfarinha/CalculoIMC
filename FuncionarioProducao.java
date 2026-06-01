public class FuncionarioProducao extends Colaborador {

    private int quantidadePecas;
    private double valorPorPeca;

    public FuncionarioProducao(String nome, int matricula,
                               int quantidadePecas, double valorPorPeca) {
        super(nome, matricula);
        this.quantidadePecas = quantidadePecas;
        this.valorPorPeca = valorPorPeca;
    }

    @Override
    public double calcularExtras() {
        return valorPorPeca * quantidadePecas;
    }

    @Override
    public double calcularSalario() {
        return SALARIO_BASE + calcularExtras();
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.printf("Salario Fixo: R$ %.2f%n", SALARIO_BASE);
        System.out.printf("Bonus de Producao (%d pecas x R$ %.2f): R$ %.2f%n",
                quantidadePecas, valorPorPeca, calcularExtras());
        System.out.printf("Salario Final: R$ %.2f%n", calcularSalario());
        System.out.println("----------------------------");
    }
}