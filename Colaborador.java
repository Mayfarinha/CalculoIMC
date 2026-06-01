import java.util.ArrayList;
import java.util.Scanner;

public class Colaborador {

    protected String nome;
    protected int matricula;

    // Constante do salário base — igual para todos
    public static final double SALARIO_BASE = 2000.0;

    public Colaborador(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public double calcularSalario() {
        return SALARIO_BASE;
    }

    public double calcularExtras() {
        return 0.0;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Salário Fixo: R$ %.2f%n", SALARIO_BASE);
        System.out.printf("Extras: R$ %.2f%n", calcularExtras());
        System.out.printf("Salário Final: R$ %.2f%n", calcularSalario());
        System.out.println("----------------------------");
    }
}