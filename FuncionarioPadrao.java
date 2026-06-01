public class FuncionarioPadrao extends Colaborador {

    public FuncionarioPadrao(String nome, int matricula) {
        super(nome, matricula);
    }

    @Override
    public double calcularSalario() {
        return SALARIO_BASE;
    }
}