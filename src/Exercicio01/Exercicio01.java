package Exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Ana", 22, "Desenvolvedora");
        Funcionario funcionario2 = new Funcionario("Paula", 23, "DBA");
        Funcionario funcionario3 = new Funcionario("Lucas", 26, "GP");

        funcionario1.fazercv();
        funcionario1.entregarcv();
        System.out.println("-----------------------------------------------------------");
        funcionario2.fazercv();
        funcionario2.entregarcv();
        System.out.println("-----------------------------------------------------------");
        funcionario3.fazercv();
        funcionario3.entregarcv();
    }
}
